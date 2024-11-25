package com.atguigu.a_collections.a_wait_notify.a_wait_notify;

/**
 * ClassName: Product
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/9 21:56
 * @Version 1.0
 */
public class Product implements Runnable{
    private BaoZiPu baoZiPu;
    public Product(BaoZiPu baoZiPu){
        this.baoZiPu = baoZiPu;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            baoZiPu.setCount();
        }
    }
}
