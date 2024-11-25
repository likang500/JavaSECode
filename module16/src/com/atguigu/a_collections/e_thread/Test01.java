package com.atguigu.a_collections.e_thread;

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
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");
        t1.start();
        t1.join ();//插入线程，把t1插入到当前线程之前，即当前的main线程之前
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了..." + i);
        }
    }
}
