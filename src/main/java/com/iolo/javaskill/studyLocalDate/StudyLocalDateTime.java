package com.iolo.javaskill.studyLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * 学习 java.time包
 *
 * @author Fengxinxin
 * @date 2018-12-14
 */
public class StudyLocalDateTime {
    public static void main(String[] args) {
        //获取当前日期时间以及自定义日期时间
        //获取当前的日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当前的日期时间：" + localDateTime);
        //获取自定义的的日期时间
        LocalDateTime specifiedDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("自定义的日期时间：" + specifiedDateTime);
        //转化为日期和时间
        //转化为LocalDate和LocalTime
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("当前日期：" + localDate);
        System.out.println("当前时间：" + localTime);


    }
}
