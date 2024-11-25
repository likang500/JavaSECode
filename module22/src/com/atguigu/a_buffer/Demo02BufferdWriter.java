package com.atguigu.a_buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: Demo02BufferdWriter
 * Package: com.atguigu
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/8 19:26
 * @Version 1.0
 */
public class Demo02BufferdWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\dev\\java\\ideaProject\\io\\3.txt", true));
        bw.write("床前明月光");
        bw.newLine();
        bw.write("疑是地上霜");
        bw.newLine();
        bw.close();
    }
}
