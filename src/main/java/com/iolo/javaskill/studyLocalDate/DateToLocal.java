package com.iolo.javaskill.studyLocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Date 和 Local之间的转换
 *
 * @author Fengxinxin
 * @date 2018-12-14
 */
public class DateToLocal {
    public static void main(String[] args) {
        //Date转LocalDate
        /*
        Date对象表示特定的日期和时间，而LocalDate(Java8)对象只包含没有任何时间信息的日期。
        因此，如果我们只关心日期而不是时间信息，则可以在Date和LocalDate之间进行转换
        1）将java.util.Date转换为ZonedDateTime。
        2）使用它的toLocalDate（）方法从ZonedDateTime获取LocalDate。
         */
        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        // atZone()方法返回在指定时区从此Instant生成的ZonedDateTime。
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        System.out.println("Date = " + date);
        System.out.println("LocalDate = " + localDate);

        //LocalDate转Date
        /*
        1）使用ZonedDateTime将LocalDate转换为Instant。
        2）使用from（）方法从Instant对象获取Date的实例
         */
        LocalDate localDate2 = LocalDate.of(2008, 8, 8);
        ZonedDateTime zdt = localDate2.atStartOfDay(zoneId);
        Date date2 = Date.from(zdt.toInstant());
        System.out.println("LocalDate = " + localDate2);
        System.out.println("Date = " + date2);

        //LocalTime 转 Date
        LocalTime localTime = LocalTime.of(12, 12, 12);
//        ZonedDateTime zdt2 = localTime.atDate(localDate2);

        //Date to LocalDateTime
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println(localDateTime);
        //Date 转 LocalTime
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate2, localTime);
        System.out.println(localDateTime1);
        ZonedDateTime zdt2 = localDateTime1.atZone(zoneId);
        Date date1 = Date.from(zdt2.toInstant());
        System.out.println(date1);

    }
}
