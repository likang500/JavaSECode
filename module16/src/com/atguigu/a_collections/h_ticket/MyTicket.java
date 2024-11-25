package com.atguigu.a_collections.h_ticket;

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

    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"买了第"+ ticket+"张票");
                ticket--;
            }
        }
    }
}
