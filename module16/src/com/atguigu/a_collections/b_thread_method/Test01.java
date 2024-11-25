package com.atguigu.a_collections.b_thread_method;

/**
 * ClassName: Test01
 * Package: com.atguigu.a_thread
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/25 21:17
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setName("金莲");
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("大郎");
        t2.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"执行了"+i);
        }
    }
}
