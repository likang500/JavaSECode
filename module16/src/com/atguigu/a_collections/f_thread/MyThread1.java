package com.atguigu.a_collections.f_thread;

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
        Thread.yield();//礼让线程，尽量地使线程平衡，不是规律地交换执行
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了..." + i);
        }
    }
}
