package com.atguigu.a_collections.d_thread;

/**
 * ClassName: Test01
 * Package: com.atguigu.c_thread
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/25 21:45
 * @Version 1.0
 */
public class Test01{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");
        MyThread1 t2 = new MyThread1();
        t2 .setName("阿庆");
        //最小优先级1，默认5，最大10
        t1.setPriority(10);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }
}
