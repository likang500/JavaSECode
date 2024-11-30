package com.atguigu.d_regex;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author likang
 * @create 2024-11-27 20:41
 * @function
 */
public class Demo02Regex {
    public static void main(String[] args) {
        //method01();
        //method02();
        //method03();
        //method04();
        //method05();
        method06();
    }

    private static void method06() {
        String s1 = "abc hahah hehe hdhshsh";
        String[] arr1 =s1.split(" +");
        System.out.println(Arrays.toString(arr1));
        String s2 = s1.replaceAll(" +","z");
        System.out.println(s2);
    }

    private static void method05() {
        boolean result01 = "abcabc".matches("(abc)*");
        System.out.println(result01);

    }

    private static void method04() {
        boolean result01 = "111".matches("\\{3}");
        System.out.println(result01);
        boolean result02 = "13377778888".matches("[1][358]\\d{9}");
        System.out.println(result02);
        boolean result03 = "1111111".matches("[1-9][0-9]{4,14}");
        System.out.println(result03);
    }

    private static void method03() {
        boolean result01 = "111".matches("[0-9][0-9][0-9]");
        System.out.println(result01);
        boolean result02 = "111".matches("\\d\\d\\d");
        System.out.println(result02);
        boolean result03 = "15638333754".matches("[1][358]\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        System.out.println(result03);
        boolean result04 = "had".matches("[h].[d]");
        System.out.println(result04);
    }

    private static void method02() {
        boolean result01 = "mad".matches("[[a-z]&&[^aeiou]][a][d]");
        System.out.println(result01);
        boolean result02 = "ead".matches("[a|e|i|o|u][a][d]");
        System.out.println(result02);
        boolean result03 = "ead".matches("[aeiou][a][d]");
        System.out.println(result03);
    }

    private static void method01() {
        boolean result01 = "had".matches("[h][aeiou][d]");
        System.out.println(result01);
        boolean result02 = "hfd".matches("[h][^aeiou][d]");
        System.out.println(result02);
        boolean result03 = "bad".matches("[a-z][a][d]");
        System.out.println(result03);
    }
}
