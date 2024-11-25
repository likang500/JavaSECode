package com.atguigu.a_collections.a_wait_notify.e_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ClassName: Test02
 * Package: com.atguigu.a_wait_notify.e_pool
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:18
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService  = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(new Mycallable());
        System.out.println(future.get());
        executorService.shutdown();
    }
}
