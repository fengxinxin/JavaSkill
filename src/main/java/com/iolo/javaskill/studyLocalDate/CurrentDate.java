package com.iolo.javaskill.studyLocalDate;

import org.springframework.cglib.core.Local;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author Fengxinxin
 * @date 2019-02-28
 */
public class CurrentDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //获取某个时区的时间
        ZoneId zoneCurrent = ZoneId.systemDefault();
        System.out.println("Zone : " + zoneCurrent);

        LocalDateTime ldt = LocalDateTime.now(zoneCurrent);
        Date ldtDate1 = Date.from(ldt.atZone(ZoneId.of("Asia/Shanghai")).toInstant());

        LocalDateTime ldt2 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        Date ldtDate2 = Date.from(ldt2.atZone(ZoneId.of("Asia/Tokyo")).toInstant());

        LocalDateTime ldt3 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        Date ldtDate3 = Date.from(ldt3.atZone(ZoneId.of("America/Los_Angeles")).toInstant());

        LocalDateTime ldt4 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zdt4 = ldt4.atZone(ZoneId.of("Asia/Shanghai"));
        Date ldtDate4 = Date.from(zdt4.toInstant());

        System.out.println("ldt : " + ldt + " || Date : " + ldtDate1);
        System.out.println("ldt2 : " + ldt2 + " || Date : " + ldtDate2);
        System.out.println("ldt3 : " + ldt3 + " || Date : " + ldtDate3);
        System.out.println("ldt4 : " + ldt4 + " || Date : " + ldtDate4);

        //Calendar 获取当前时区的时间
        Calendar cal1 = Calendar.getInstance(Locale.CHINA);
        System.out.println("---Cal1 : " + cal1.getTimeZone() + " || Date1 : " + cal1.getTime());
        Calendar cal2 = Calendar.getInstance(Locale.JAPAN);
        System.out.println("---Cal2 : " + cal2.getTimeZone() + " || Date2 : " + cal2.getTime());

        TimeZone zone3 = TimeZone.getTimeZone(ZoneId.of("America/Los_Angeles"));
        Calendar cal3 = Calendar.getInstance(zone3);
        System.out.println("---Cal3 : " + cal3.getTimeZone() + " || Date3 : " + cal3.getTime());
        System.out.println("Date3 : " + cal3.getTime());
        System.out.println("sdf - Date3 : " + sdf.format(cal3.getTime()));
    }
}
