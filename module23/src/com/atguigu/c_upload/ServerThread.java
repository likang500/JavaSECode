package com.atguigu.c_upload;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * ClassName: ServerThread
 * Package: com.atguigu.c_upload
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 21:20
 * @Version 1.0
 */
public class ServerThread {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(6666);
        while (true){
            Socket socket = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    InputStream is  = null;
                    FileOutputStream fos =null;
                    OutputStream os =null;
                    try {
                        is  = socket.getInputStream();
                        //UUID
                        String s = UUID.randomUUID().toString();
                        String name = s + System.currentTimeMillis();
                        fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\"+name+".jpg");
                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }
                        os = socket.getOutputStream();
                        os.write("上传成功".getBytes(StandardCharsets.UTF_8));
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        CloseUtils.closeQ(socket,fos,is,os);
                    }
                }
            }).start();

        }
    }
}
