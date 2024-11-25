package com.atguigu.a_collections.a_wait_notify.e_pool;

/**
 * ClassName: MyRunnable
 * Package: com.atguigu.a_wait_notify.e_pool
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:13
 * @Version 1.0
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"。。。执行了");
    }
}
