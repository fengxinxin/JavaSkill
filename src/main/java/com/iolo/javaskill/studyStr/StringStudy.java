package com.iolo.javaskill.studyStr;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author Fengxinxin
 * @date 2018-12-07
 */
public class StringStudy {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        String f = e.intern();
//        System.out.println((b == d));
        System.out.println((a == c));
        System.out.println((a == e));
        System.out.println((a == f));
//        System.out.println((d == e));

        String number = "129935353453";
        StringBuilder sb = new StringBuilder(number);
        sb.insert(sb.length() - 3, ".");
        System.out.println(sb.toString());

    }
}
