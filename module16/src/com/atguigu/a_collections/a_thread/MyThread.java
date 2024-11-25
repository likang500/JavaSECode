package com.atguigu.a_collections.a_thread;

/**
 * ClassName: MyThread
 * Package: com.atguigu.a_thread
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/25 21:14
 * @Version 1.0
 */
public class MyThread extends Thread{
    @Override
    public void run()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread...执行了"+i);
        }
    }
}
