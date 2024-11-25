package com.atguigu.c_upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
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
public class ServerPool2 {
    public static void main(String[] args) throws Exception {
        // 创建线程池
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
                threadPool.execute(() -> handleClient(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown(); // 关闭线程池
        }
    }

    private static void handleClient(Socket socket) {
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            is = socket.getInputStream();
            // 生成唯一文件名
            String s = UUID.randomUUID().toString();
            String name = s + System.currentTimeMillis();
            fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\" + name + ".jpg");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            // 返回上传成功消息
            os = socket.getOutputStream();
            os.write("上传成功".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CloseUtils.closeQ(socket, fos, is, os);
        }
    }
}
