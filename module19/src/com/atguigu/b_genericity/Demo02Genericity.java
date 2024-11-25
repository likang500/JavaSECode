package com.atguigu.b_genericity;

/**
 * ClassName: Demo02Genericity
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:36
 * @Version 1.0
 */
public class Demo02Genericity {
    public static void main(String[] args) {
        MyArraylist<String> list = new MyArraylist<>();
        //list.add(1);
        list.add("sasa");
        list.add("sasaa");
        System.out.println(list);
        MyArraylist<Integer> list1 = new MyArraylist<>();
        list1.add(11);
        list1.add(45);
        System.out.println(list1);
    }
}
