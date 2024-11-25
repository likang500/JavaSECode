package com.atguigu.a_collections.i_synchronized;

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
    Object object = new Object();
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (object){//只能是同一把锁1。这是同步代码块。
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"买了第"+ ticket+"张票");
                    ticket--;
                }
            }
        }
    }
}
