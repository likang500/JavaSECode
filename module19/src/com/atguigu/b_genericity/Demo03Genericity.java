package com.atguigu.b_genericity;

import java.util.ArrayList;

/**
 * ClassName: Demo03Genericity
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:52
 * @Version 1.0
 */
public class Demo03Genericity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtils.addAll(list,"s","bb");
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        ListUtils.addAll(list1,12,22);
        System.out.println(list1);
    }
}
