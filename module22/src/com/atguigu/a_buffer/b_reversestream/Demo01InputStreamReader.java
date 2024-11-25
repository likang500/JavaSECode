package com.atguigu.a_buffer.b_reversestream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * ClassName: Demo01InputStreamReader
 * Package: com.atguigu.b_reversestream
 * Description:转换流，指定读写字符时的格式UTF-8 GBK等等
 *
 * @Author LiKang
 * @Create 2024/11/10 13:33
 * @Version 1.0
 */
public class Demo01InputStreamReader {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\dev\\java\\ideaProject\\io\\1.txt"),"GBK");
        int data = isr.read();
        System.out.println((char) data);
        isr.close();
    }
}
