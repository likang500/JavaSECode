package com.atguigu.a_collections.c_thread;

/**
 * ClassName: MyThread1
 * Package: com.atguigu.c_thread
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/25 21:43
 * @Version 1.0
 */
public class MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了..." + i);
        }
    }
}
