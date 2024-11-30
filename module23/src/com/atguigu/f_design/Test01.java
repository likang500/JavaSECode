package com.atguigu.f_design;

/**
 * @author likang
 * @create 2024-11-28 21:52
 * @function
 */
public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println(singleton);
        }
    }
}
