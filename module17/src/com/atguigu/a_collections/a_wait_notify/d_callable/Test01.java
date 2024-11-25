package com.atguigu.a_collections.a_wait_notify.d_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: Test01
 * Package: com.atguigu.a_wait_notify.d_callable
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 21:16
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Mycallable mycallable = new Mycallable();
        /*
        * FutureTask(Callable<V> callable)
        * */
        FutureTask<String> futureTask = new FutureTask<>(mycallable);
        //创建Thread对象-》Thread（Runnable target)
        Thread thread = new Thread(futureTask);
        thread.start();
        //调用get方法获取call方法返回值
        System.out.println(futureTask.get());
    }
}
