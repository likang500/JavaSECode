package com.atguigu.a_collections.a_wait_notify.e_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: Test01
 * Package: com.atguigu.a_wait_notify.e_pool
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:14
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.shutdown();
    }
}
