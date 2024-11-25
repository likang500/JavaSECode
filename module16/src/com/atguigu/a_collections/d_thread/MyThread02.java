package com.atguigu.a_collections.d_thread;

/**
 * ClassName: MyThread02
 * Package: d.thrad
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/25 21:53
 * @Version 1.0
 */
public class MyThread02 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了..." + i);
        }
    }
}
