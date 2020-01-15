package com.iolo.javaskill.studyLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * java.time api工具类
 *
 * @author liuzixi
 * date 2019-04-24
 */
public class LocalDateTimeUtils {

    /**
     * 将java.util.Date格式日期时间转化为java.time.LocalDateTime格式
     * @param date
     * @return
     * @author liuzixi
     * date 2019-04-10
     */
    public static LocalDateTime convertDateToLdt(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * 将java.time.LocalDateTime格式日期时间转化为java.util.Date格式
     * @param localDateTime
     * @return
     * @author liuzixi
     * date 2019-04-10
     */
    public static Date convertLdtToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 将java.util.Date格式日期时间转化为java.time.LocalDate格式
     * @param date
     * @return
     * @author liuzixi
     * date 2019-04-10
     */
    public static LocalDate convertDateToLd(Date date) {
        return convertDateToLdt(date).toLocalDate();
    }

    /**
     * 将java.time.LocalDate格式日期转化为java.util.Date格式
     * @param localDate
     * @return
     * @author liuzixi
     * date 2019-04-10
     */
    public static Date convertLdToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 将java.util.Date格式日期时间转化为java.time.LocalTime格式
     * @param date
     * @return
     * @author liuzixi
     * date 2019-04-10
     */
    public static LocalTime convertDateToLt(Date date) {
        return convertDateToLdt(date).toLocalTime();
    }
}
