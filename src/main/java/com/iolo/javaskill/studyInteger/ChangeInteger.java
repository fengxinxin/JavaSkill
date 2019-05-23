package com.iolo.javaskill.studyInteger;

import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * 学习Integer
 *
 * @author Fengxinxin
 * @date 2019-01-11
 */
public class ChangeInteger {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a, b;
        a = new Integer(4);
        b = new Integer(5);
        method4(a, b);
        System.out.println("a=" + a + ";" + "b=" + b);

        NumInteger numA = new NumInteger(4);
        NumInteger numB = new NumInteger(5);
        System.out.println("B : "+numA.num+";A : "+numB.num);
        change(numA, numB);
        System.out.println("B : "+numA.num+";A : "+numB.num);

    }

    private static void change(NumInteger numA, NumInteger numB) {
        numA.num = 400;
        numB.num = 500;

    }

    static class NumInteger {
        public NumInteger(int num) {
            this.num = num;
        }

        public int num;
    }


    private static void method(Integer a, Integer b) throws IllegalAccessException, NoSuchFieldException {
        Field fielda = a.getClass().getDeclaredField("value");
        fielda.setAccessible(true);
        fielda.set(a, 100);

        Field fieldb = b.getClass().getDeclaredField("value");
        fieldb.setAccessible(true);
        fieldb.set(b, 200);
        System.exit(0);
    }

    private static void method1(Integer a, Integer b) throws IllegalAccessException, NoSuchFieldException {
        System.out.println("a=" + 400 + ";" + "b=" + 500);
        System.exit(0);
    }

    private static void method2(Integer a, Integer b) throws IllegalAccessException, NoSuchFieldException {
        PrintStream stream = new PrintStream(System.out) {
            @Override
            public void print(String s) {
                super.print(s.replace(a + "", a * 100 + "").replace(b + "", b * 100 + ""));
            }
        };
        System.setOut(stream);
    }

    private static void method4(Integer a, Integer b){
//        Integer.toBinaryString(a);
//        Integer.toBinaryString(b);
//        System.out.println(a >> 1);
        a = new Integer(400);
//        System.out.println(b >> 1);
        b = new Integer(500);
    }
}
