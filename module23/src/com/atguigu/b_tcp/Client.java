package com.atguigu.b_tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * ClassName: Client
 * Package: com.atguigu.b_tcp
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 18:44
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 6666);
        OutputStream os = socket.getOutputStream();
        os.write("我想下载一个小电影".getBytes(StandardCharsets.UTF_8));
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        is.close();
        os.close();
        socket.close();
    }

}
