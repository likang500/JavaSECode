package com.atguigu.c_upload;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ClassName: Client
 * Package: com.atguigu.c_upload
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 19:20
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 6666);
        FileInputStream fis = new FileInputStream("C:\\dev\\java\\ideaProject\\io\\2.jpg");
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis .read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = is.read(bytes1);
        System.out.println(new String(bytes1,0,len1));
        os.close();
        is.close();
        socket.close();
    }
}
