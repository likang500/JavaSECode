package com.atguigu.c_genericity;

import java.util.ArrayList;

/**
 * ClassName: Demo01Genericity
 * Package: com.atguigu.c_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 17:16
 * @Version 1.0
 */
public class Demo01Genericity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ss");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        method(list);
        method(list1);
    }

    private static void method(ArrayList<?> list) {//泛型通配符，上限下限
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
