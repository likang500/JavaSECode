package com.atguigu.a_lambda;

/**
 * @author likang
 * @create 2024-11-29 11:10
 * @function
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我执行了");
            }
        }).start();
        new Thread(()-> System.out.println("我执行了")).start();
    }
}
