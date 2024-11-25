package com.atguigu.b_genericity;

/**
 * ClassName: Demo04Genericity
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:59
 * @Version 1.0
 */
public class Demo04Genericity {
    public static void main(String[] args) {
        MyArraylist1<String> list1 = new MyArraylist1<>();
        list1.add("asa");
        list1.add("acc");
        System.out.println(list1.get(0));
    }
}
