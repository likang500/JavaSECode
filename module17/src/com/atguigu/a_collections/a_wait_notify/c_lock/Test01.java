package com.atguigu.a_collections.a_wait_notify.c_lock;

/**
 * ClassName: Test01
 * Package: com.atguigu.h_ticket
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/29 17:50
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 = new Thread(myTicket, "赵四");
        Thread t2 = new Thread(myTicket, "刘嫩");
        Thread t3 = new Thread(myTicket, "广泛");
        t1.start();
        t2.start();
        t3.start();
    }
}
