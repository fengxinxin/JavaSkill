package com.iolo.javaskill.studyLocalDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * 学习 java.time包
 *
 * @author Fengxinxin
 * @date 2018-12-14
 */
public class StudyLocalTime {
    public static void main(String[] args) {
        //获取当前时间以及自定义时间
        LocalDate localDate = LocalDate.now();
        //获取当前时间、时、分、秒以及自定义时间
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        System.out.println("当前时间：" + localTime);
        System.out.println("时：" + hour + "  分：" + minute + "  秒：" + second);
        //获取自定义时间
        LocalTime specifiedTime = LocalTime.of(15, 30, 45);
        System.out.println("自定义时间：" + specifiedTime);

        //比较两个时间的先后顺序
        //equals方法比较两个时间是否相等
        if(localTime.equals(specifiedTime)) {
            System.out.println("localTime与specifiedTime相等！");
        } else {
            //isAfter、isBefore方法比较两个时间的先后顺序
            if(localTime.isAfter(specifiedTime)) {
                System.out.println("localTime晚于specifiedTime！");
            }
            if(localTime.isBefore(specifiedTime)) {
                System.out.println("localTime早于specifiedTime！");
            }
        }
        //对时间做加减运算
        System.out.println("当前时间：" + localTime);
        System.out.println("2小时后时间：" + localTime.plusHours(2));
        System.out.println("30分钟后时间：" + localTime.plusMinutes(30));
        System.out.println("500秒后日时间：" + localTime.plusSeconds(500));

        System.out.println("2小时前时间：" + localTime.minusHours(2));
        System.out.println("30分钟前时间：" + localTime.minusMinutes(30));
        System.out.println("500秒前时间：" + localTime.minusSeconds(500));
    }
}
