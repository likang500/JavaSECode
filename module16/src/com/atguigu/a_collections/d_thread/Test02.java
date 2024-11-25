package com.atguigu.a_collections.d_thread;

/**
 * ClassName: Test02
 * Package: d.thrad
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/25 21:54
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        t1.setName("金莲");
        MyThread02 t2 = new MyThread02();
        t2 .setName("阿庆");
        //t2设置为守护线程，非守护线程结束时，守护线程才可以结束，稍等后结束，且不必等待执行完毕
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
