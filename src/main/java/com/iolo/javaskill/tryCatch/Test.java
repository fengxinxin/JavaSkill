package com.iolo.javaskill.tryCatch;

/**
 * try catch finally
 *
 * @author Fengxinxin
 * @date 2019-05-31
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
        System.out.println(test5());
    }

    public static String test() {
        String str = "";
        try {
            str = "try";
            return str;
        } catch (Exception e) {
            str = "catch";
            return str;
        } finally {
            str = "finally";
        }
    }

    public static String test1() {
        String str = "";
        try {
            str = "try";
            return str;
        } catch (Exception e) {
            str = "catch";
            return str;
        } finally {
            str = "finally";
            return str;
        }
    }

    public static String test2() {
        String str = "";
        try {
            str = "try";
            Integer.parseInt(null);
            return str;
        } catch (Exception e) {
            str = "catch";
            return str;
        } finally {
            str = "finally";
        }
    }

    public static String test3() {
        String str = "";
        try {
            str = "try";
            Integer.parseInt(null);
        } catch (Exception e) {
            str = "catch";
            return str;
        } finally {
            str = "finally";
            return str;
        }
    }

    public static String test4() {
        String str = "";
        try {
            str = "test4 -- try";
            Integer.parseInt(null);
            return str;
        } catch (Exception e) {
            str = "test4 -- catch";
            return str;
        } finally {
            str = "finally";
            System.out.println("test4 -- finally");
        }
    }

    public static String test5() {
        String str = "";
        try {
//            str = "test5 -- try";
            System.out.println("test5 -- try -- sout");
            return str;
        } catch (Exception e) {
            str = "test5 -- catch";
            return str;
        } finally {
            str = "finally";
            System.out.println("test5 -- finally");
        }
    }
}
