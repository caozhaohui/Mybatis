package org.taru.util;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class IdUtil {
    private static DateTimeFormatter
            formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    /**
     * 鑾峰彇UUID
     * @return
     */
    public static String   getUuid(){
        String  uuid = UUID.randomUUID().toString();
        return uuid;
    }

    /**
     * 鑾峰彇DateId 褰撳墠鏃堕棿鏃跺垎绉?
     * @return
     */
    public static String  getDateId(){
        LocalDateTime dateTime =LocalDateTime.now();
        String str =formatter.format(dateTime);
        return  str;

    }
    /**
     * 鑾峰彇tLongTime 褰撳墠鏃堕棿鐨勬绉掓暟
     * @return
     */
    public static String  getLongTimeId(){
        long  longValue =System.currentTimeMillis();
        return  String.valueOf(longValue);

    }




}
