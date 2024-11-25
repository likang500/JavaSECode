package com.atguigu.a_collections.h_ticket.j_synchronized;

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
    static int ticket = 100;
    Object object = new Object();
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            method01();
        }
    }
    //方式1，方式2都可以。一般是方式1
    public static synchronized void method01(){//静态同步方法
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"买了第"+ ticket+"张票");
            ticket--;
        }
    }
/*    public static synchronized void method01(){//静态同步方法
        synchronized (MyTicket.class) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                ticket--;
            }
        }
    }*/
    //方式1，方式2都可以。一般是方式1
/*    public synchronized void method01(){//普通的同步方法，非静态同步方法
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"买了第"+ ticket+"张票");
            ticket--;
        }
    }*/
/*    public void method01() {//普通的同步方法，非静态同步方法
        synchronized (this) {
            System.out.println(this);
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                ticket--;
            }
        }
    }*/
}
