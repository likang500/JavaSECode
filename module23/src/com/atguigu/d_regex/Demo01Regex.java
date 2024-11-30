package com.atguigu.d_regex;

import java.util.Scanner;

/**
 * @author likang
 * @create 2024-11-27 20:32
 * @function
 */
public class Demo01Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        boolean result = method(data);
        System.out.println(result);
    }

    private static boolean method(String data) {
        boolean result  = data.matches("[1-9][0-9]{4,14}");//第一位1-9，后面4-14位的0-9
        return result;
    }
}
