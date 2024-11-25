package com.atguigu.a_collections.a_wait_notify.c_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: MyTicket
 * Package: com.atguigu.h_ticket
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/29 17:15
 * @Version 1.0
 */
public class MyTicket implements Runnable{
    int ticket = 100;
    //创建lock对象
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);

                lock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"买了第"+ ticket+"张票");
                    ticket--;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }
    }
}
