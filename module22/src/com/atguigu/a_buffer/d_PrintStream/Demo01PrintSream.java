package com.atguigu.a_buffer.d_PrintStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * ClassName: Demo01PrintSream
 * Package: com.atguigu.a_buffer.d_PrintStream
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/10 21:31
 * @Version 1.0
 */
public class Demo01PrintSream {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("module22\\log.txt",true));
        System.setOut(ps);
        System.out.println("这个错误是今天晚上2点出现的");
        ps.close();
    }
}
