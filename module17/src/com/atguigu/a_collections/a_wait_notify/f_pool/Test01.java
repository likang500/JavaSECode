package com.atguigu.a_collections.a_wait_notify.f_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ClassName: Test01
 * Package: com.atguigu.a_wait_notify.f_pool
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:25
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(new MyString());
        Future<Integer> future1 = executorService.submit(new Mysum());
        System.out.println(future.get());
        System.out.println(future1.get());
        executorService.shutdown();
    }
}
