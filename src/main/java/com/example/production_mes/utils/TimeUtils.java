package com.example.production_mes.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public static String NowTime(){
        Date date=new Date();   //这里的时util包下的
        SimpleDateFormat temp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //这是24时
        String Date=temp.format(date);
        return Date;
    }
    public static Date NowTimeN(){
        Date date=new Date();   //这里的时util包下的
        return date;
    }
    public String DateToString(Date d){

        SimpleDateFormat temp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //这是24时
        String Da=temp.format(d);
        return Da;
    }
    public static Date StringToDate(String s){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        try {
            // 注意格式需要与上面一致，不然会出现异常
            date = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
