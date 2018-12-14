package com.iolo.javaskill.studyLocalDate;

import java.time.LocalDate;
import java.time.Month;

/**
 * 学习 java.time包
 *
 * @author Fengxinxin
 * @date 2018-12-14
 */
public class StudyLocalDate {
    public static void main(String[] args) {
        //获取当前日期以及年、月、日
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        Month month = localDate.getMonth();
        int day = localDate.getDayOfMonth();
        System.out.println("当前时间： " + localDate);
        System.out.println("当前月份： " + monthValue);
        System.out.println("Year : " + year + " Month : " + monthValue + " Day : " + day);

        //获取指定的日期
        LocalDate specifiedDay = LocalDate.of(2008, 8, 18);
        System.out.println("指定日期：" + specifiedDay);

        LocalDate otherDate = LocalDate.of(2018, 11, 11);

        //equals方法用于比较两个日期是否相等
        if (localDate.equals(otherDate)) {
            System.out.println("localDate与otherDate相等！");
        } else {
            //isAfter和isBefore方法用于比较两个日期前后顺序
            if (localDate.isAfter(otherDate)) {
                System.out.println("localDate晚于otherDate！");
            }
            if (localDate.isBefore(otherDate)) {
                System.out.println("localDate早于otherDate！");
            }
        }
        //对日期做加减运算
        System.out.println("2年后日期：" + localDate.plusYears(2));
        System.out.println("6月后日期：" + localDate.plusMonths(6));
        System.out.println("3周后日期：" + localDate.plusWeeks(3));
        System.out.println("15天后日期：" + localDate.plusDays(15));

        System.out.println("2年前日期：" + localDate.minusYears(2));
        System.out.println("6月前日期：" + localDate.minusMonths(6));
        System.out.println("3周前日期：" + localDate.minusWeeks(3));
        System.out.println("15天前日期：" + localDate.minusDays(15));
        //获取日期间隔的天数
        //获取某年份的第N天的日期
        LocalDate specialDay = LocalDate.ofYearDay(2018, 100);
        System.out.println("2018年的第100天：" + specialDay);
        //获取两个日期的间隔天数
        long intervalDay = localDate.toEpochDay() - specialDay.toEpochDay();
        System.out.println("间隔天数： " + intervalDay);

    }
}
