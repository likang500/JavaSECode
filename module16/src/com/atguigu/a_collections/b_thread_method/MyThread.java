package com.atguigu.a_collections.b_thread_method;

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
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {//只能try，不能throws，因为继承的父类Thread中的run方法没有throws，所以不能throws，只能try
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"执行了"+i);
        }
    }
}
