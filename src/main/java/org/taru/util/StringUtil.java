package org.taru.util;

public class StringUtil {

    public static String valueOf(Object obj){
        if(obj!=null){
            return obj.toString();
        }
        return null;
    }

}
