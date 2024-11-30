package com.atguigu.f_design;

/**
 * @author likang
 * @create 2024-11-28 21:57
 * @function
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton1 singleton1 = Singleton1.getSingleton1();
            System.out.println(singleton1);
        }
    }
}
