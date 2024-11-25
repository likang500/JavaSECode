package com.atguigu.a_collections.l_dielock;

/**
 * ClassName: Test01
 * Package: com.atguigu.l_dielock
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/29 20:32
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        DieLock dieLock1 = new DieLock(true);
        DieLock dieLock2 = new DieLock(false);
        new Thread(dieLock1).start();
        // Thread.sleep(1000L);
        new Thread(dieLock2).start();
    }
}
