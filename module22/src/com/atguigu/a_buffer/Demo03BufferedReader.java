package com.atguigu.a_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName: Demo03BufferedReader
 * Package: com.atguigu
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/8 19:32
 * @Version 1.0
 */
public class Demo03BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\java\\ideaProject\\io\\3.txt"));
        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
