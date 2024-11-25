package com.atguigu.a_buffer.b_reversestream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * ClassName: Dome02OutputStreamWriter
 * Package: b_reversestream
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/10 13:48
 * @Version 1.0
 */
public class Dome02OutputStreamWriter {
    public static void main(String[] args) throws Exception{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\dev\\java\\ideaProject\\io\\1.txt"),"GBK");//默认UTF-8.  GBK又叫做ANSI
        osw.write("你好");
        osw.close();
    }
}
