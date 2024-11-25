package com.atguigu.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: Demo02IO
 * Package: com.atguigu.io
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/24 16:35
 * @Version 1.0
 */
public class Demo02IO {
    public static void main(String[] args) throws Exception {
        //method01();
        method02();
    }
    private static void method02() throws Exception {
        FileInputStream fis = new FileInputStream("C:\\dev\\java\\ideaProject\\io\\2.txt");

        byte[] bytes = new byte[2];
//        int len1 = fis.read(bytes);
//        System.out.println(len1);//2
//        System.out.println(new String(bytes,0,len1));
//        System.out.println("===============");
//        int len2 = fis.read(bytes);
//        System.out.println(len2);//2
//        System.out.println(new String(bytes,0,len2));
//        System.out.println("===============");

        //定义一个变量len,接收读取的字节个数
        int len;
        while((len = fis.read(bytes))!=-1){
            //System.out.println(new String(bytes,0,len));
            System.out.println(new String(bytes));
        }
        fis.close();
    }

    private static void method01() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\dev\\java\\ideaProject\\io\\2.txt");
//        int data1 = fis.read();
//        System.out.println(data1);
//        int data2 = fis.read();
//        System.out.println(data2);
//        int data3 = fis.read();
//        System.out.println(data3);
//        int data4 = fis.read();
        System.out.println("---------------");
        int len;
        while ((len = fis.read())!=-1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
