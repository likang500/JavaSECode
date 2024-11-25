package com.atguigu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: Demo03IO
 * Package: com.atguigu.io
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/24 18:40
 * @Version 1.0
 */
public class Demo03IO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\dev\\java\\ideaProject\\io\\1.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\11.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
