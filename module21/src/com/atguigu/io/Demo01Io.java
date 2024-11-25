package com.atguigu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * ClassName: Demo01Io
 * Package: com.atguigu.io
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/24 16:19
 * @Version 1.0
 */
public class Demo01Io {
    public static void main(String[] args) throws IOException {
        //method01();
        //method02();
        //method03();
        //method04();
        method05();

    }

    private static void method05() throws IOException{
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\1.txt",true);
        fos.write("窗前明月光\n".getBytes(StandardCharsets.UTF_8));
        fos.write("疑是地上霜\n".getBytes(StandardCharsets.UTF_8));
        fos.write("举头望明月\n".getBytes(StandardCharsets.UTF_8));
        fos.write("低头思故乡\n".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }

    private static void method04() throws IOException{
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\1.txt");
        fos.write("qqqqq".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }

    private static void method03() throws IOException{
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\1.txt");
        byte[] bytes = {97,98,99,100,101,102};
        fos.write(bytes);
        fos.close();
    }

    private static void method02() throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\1.txt");
        byte[] bytes = {97,98,99,100,101,102};
        fos.write(bytes,0,2);
        fos.close();
    }

    private static void method01() throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\1.txt");
        fos.write(97);
        fos.close();
    }
}
