package com.atguigu.a_buffer;

import java.io.*;

/**
 * ClassName: Demo01BufferedInputStream_OutputStream
 * Package: com.atguigu
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/8 15:54
 * @Version 1.0
 */
public class Demo01BufferedInputStream_OutputStream {
    public static void main(String[] args) throws IOException{
        //methord01();
        methord02();
    }

    //字节缓冲流复制文件 更快
    private static void methord02() throws IOException{
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\dev\\java\\ideaProject\\io\\2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\3.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len;
        while((len = bis.read())!=-1){
            bos.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        bos.close();
        bis.close();
    }

    //基本流复制文件
    private static void methord01() throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\dev\\java\\ideaProject\\io\\2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\3.txt");
        int len;
        while((len = fis.read())!=-1){
            fos.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        fos.close();
        fis.close();
    }
}
