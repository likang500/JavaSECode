package com.atguigu.a_collections.g_runnable;

/**
 * ClassName: MyRunnable
 * Package: com.atguigu.g_runnable
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/29 16:46
 * @Version 1.0
 */
public class MyRunnable implements Runnable{//Runable 接口实现多线程
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"...执行了" + i);
        }
    }
}














