package com.atguigu.a_collections.a_thread;

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
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main线程执行了"+i);
        }
    }
}
