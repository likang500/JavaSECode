package com.atguigu.b_genericity;

import java.util.ArrayList;

/**
 * ClassName: Demo01Genericity
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:27
 * @Version 1.0
 */
public class Demo01Genericity {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add("a");
//        list.add(2.56);
//        list.add(true);
//        for (Object o : list) {
//            String s = (String) o;
//            System.out.println(s.length());
//        }
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("nm");
        for (Object o : list) {
            String s = (String) o;
            System.out.println(s.length());
        }
    }
}
