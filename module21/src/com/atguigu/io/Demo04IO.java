package com.atguigu.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName: Demo04IO
 * Package: com.atguigu.io
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/24 18:52
 * @Version 1.0
 */
public class Demo04IO {
    public static void main(String[] args) throws IOException{
        //method01();
        method02();
    }

    private static void method02() throws IOException{
        FileReader fr = new FileReader("C:\\dev\\java\\ideaProject\\io\\1.txt");
        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars))!=-1){
            System.out.println((new String(chars,0,len)));
        }
        fr.close();
    }

    private static void method01() throws IOException {
        FileReader fr = new FileReader("C:\\dev\\java\\ideaProject\\io\\1.txt");
        int len;
        while ((len = fr.read())!=-1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
