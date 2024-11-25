package com.atguigu.a_collections.g_runnable;

/**
 * ClassName: Test02
 * Package: com.atguigu.g_runnable
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/29 16:56
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        new Thread(new Runnable() {//匿名内部类
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"...执行了" + i);
                }
            }
        },"金莲").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"...执行了" + i);
                }
            }
        }).start();
    }
}
