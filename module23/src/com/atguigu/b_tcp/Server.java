package com.atguigu.b_tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * ClassName: Server
 * Package: com.atguigu.b_tcp
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 18:51
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(6666);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os = socket.getOutputStream();
        os.write("给你一个小电影".getBytes(StandardCharsets.UTF_8));
        os.close();
        is.close();
        socket.close();
        ss.close();
    }
}
