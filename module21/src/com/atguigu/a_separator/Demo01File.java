package com.atguigu.a_separator;

import java.io.File;

/**
 * ClassName: Demo01File
 * Package: com.atguigu.a_separator
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/24 9:52
 * @Version 1.0
 */
public class Demo01File {
    public static void main(String[] args) {
        file01();
        file02();
    }

    private static void file02() {
        String path = "C:\\Idea\\io";
        System.out.println(path);

        String path1 = "C:" + File.separator +"Idea" + File.separator +"io";
        System.out.println(path1);
    }

    private static void file01(){
        String separator = File.separator;
        System.out.println("separator=" + separator);
        String pathSeparator = File.pathSeparator;
        System.out.println("pathSeparator" + pathSeparator);
    }
}
