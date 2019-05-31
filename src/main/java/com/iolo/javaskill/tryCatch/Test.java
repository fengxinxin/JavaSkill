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

    public static String test4() throws Exception {
        String str = "";
        try {
            str = "try";
            Integer.parseInt(null);
        } catch (Exception e) {
            str = "catch";
            return str;
        } finally {
            str = "finally";
            throw new Exception();
        }
    }
}
