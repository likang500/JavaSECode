package com.atguigu.c_upload;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * ClassName: ServerPool
 * Package: com.atguigu.c_upload
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 21:58
 * @Version 1.0
 */
public class ServerPool {
    public static void main(String[] args) throws Exception{
        int corePoolSize = 4; // 核心线程数
        int maximumPoolSize = 10; // 最大线程数
        long keepAliveTime = 60; // 空闲线程存活时间
        ExecutorService threadPool = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(50), // 队列容量
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy() // 拒绝策略
        );
        try (ServerSocket ss = new ServerSocket(6666)) {
            System.out.println("Server started on port 6666...");
            while (true) {
                Socket socket = ss.accept();
                // 提交任务到线程池
                threadPool.execute(new MyRunnable(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown(); // 关闭线程池
        }
    }
}
