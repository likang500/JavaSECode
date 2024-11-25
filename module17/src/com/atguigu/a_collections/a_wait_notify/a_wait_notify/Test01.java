package com.atguigu.a_collections.a_wait_notify.a_wait_notify;

/**
 * ClassName: Test01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/9 22:18
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();
        Product product = new Product(baoZiPu);
        Consumer consumer = new Consumer(baoZiPu);
        Thread thread1 = new Thread(product);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
