package org.taru.util;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.management.RuntimeErrorException;
public class DButil {
    private static ThreadLocal<Connection> local=new ThreadLocal<Connection>();
    private static Properties properties =new Properties();
    static {

        try {
            properties.load(DButil.class.getClassLoader().getResourceAsStream("db.Properties"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }



    static {

        try {
            Class.forName(properties.getProperty("DRIVER"));
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Connection connection() {
        Connection conn=local.get();
        try {
            if(conn==null||conn.isClosed()) {
                conn=DriverManager.getConnection(properties.getProperty("URL"), properties.getProperty("USERNAME"),properties.getProperty("PASSWORD"));
                local.set(conn);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    public static List<Map<String,Object>> query(String sql,Object...params){
        Connection conn= connection();
        PreparedStatement pst=null;
        List<Map<String,Object>> list=null;
        ResultSet rs=null;
        try {
            pst=conn.prepareStatement(sql);
            if(params!=null){
                for(int i=0;i<params.length;i++) {
                    pst.setObject(i+1, params[i]);
                }
            }


            rs=pst.executeQuery();
            ResultSetMetaData rsd=rs.getMetaData();
            int count=rsd.getColumnCount();
            list =new ArrayList<Map<String,Object>>();
            while(rs.next()) {
                Map<String,Object> hashmap=new HashMap<String,Object>();
                for(int i=0;i<count;i++) {
                    hashmap.put(rsd.getColumnLabel(i+1), rs.getObject(i+1));
                }
                list.add(hashmap);
            }




        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException("执行查询错误");
        }finally {
            if(rs!=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(pst!=null){
                try {
                    pst.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


        }


        return list;

    }
    public static int update(String sql,Object...params) {
        Connection conn= connection();
        PreparedStatement pst=null;
        int row=0;

        ResultSet rs=null;
        try {
            pst=conn.prepareStatement(sql);
            if(params!=null){
                for(int i=0;i<params.length;i++) {
                    pst.setObject(i+1, params[i]);
                }
            }
            row=pst.executeUpdate();
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException("执行查询错误");
        }finally {

            if(pst!=null){
                try {
                    pst.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return row;

    }

    public static void close() {
        Connection conn=local.get();
        if(conn!=null) {
            try {
                conn.close();
                local.remove();
                conn=null;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



    }
}
