package com.atguigu.a_collections.g_runnable;

/**
 * ClassName: Test01
 * Package: com.atguigu.g_runnable
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/29 16:48
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        //Thread(Runnable target);
        Thread thread = new Thread(myRunnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"...执行了" + i);
        }
    }
}
