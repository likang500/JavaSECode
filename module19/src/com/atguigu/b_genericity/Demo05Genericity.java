package com.atguigu.b_genericity;

/**
 * ClassName: Demo05Genericity
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 17:06
 * @Version 1.0
 */
public class Demo05Genericity {
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        String s = myScanner.next();
        System.out.println(s);
    }
}
