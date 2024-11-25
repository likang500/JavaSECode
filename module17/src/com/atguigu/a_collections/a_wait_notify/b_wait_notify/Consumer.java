package com.atguigu.a_collections.a_wait_notify.b_wait_notify;

/**
 * ClassName: Consumer
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/9 21:56
 * @Version 1.0
 */
public class Consumer implements Runnable{
    private BaoZiPu baoZiPu;
    public Consumer(BaoZiPu baoZiPu){
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
            synchronized (baoZiPu){
            baoZiPu.getCount();
            }
        }
    }
}
