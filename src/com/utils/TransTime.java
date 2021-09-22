package com.utils;

import com.ENUM.MONTH_ENMU;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Zhang
 * @date 9/16/2021 10:13 AM
 * @description
 */
public class TransTime {

    public static void main(String[] args) {
        String origin_time = "13 jan. 2021 18:43:15 UTC";
        String[] s_time = origin_time.split(" ");
        String UTC_Time = s_time[2] +"-" + MONTH_ENMU.jan.getValue() +"-"+ s_time[0] +"T"+ s_time[3]+"Z";
        System.out.println(UTC_Time);

        String formatPattern = "yyyy-MM-dd HH:mm:ss";
        ZonedDateTime zdt  = ZonedDateTime.parse(UTC_Time);
        LocalDateTime localDateTime = zdt.toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatPattern);
        String gst = formatter.format(localDateTime.plusHours(8));
        Date Date_Time = strToDateLong(gst);

    }
    public static Date strToDateLong(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

}
