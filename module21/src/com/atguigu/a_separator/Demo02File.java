package com.atguigu.a_separator;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Demo02File
 * Package: com.atguigu.a_separator
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/24 10:06
 * @Version 1.0
 */
public class Demo02File {
    public static void main(String[] args) throws IOException {
        //file();
        //file01();
        //file02();
        //file03();
        file04();
    }

    private static void file04() {
        File file = new File("C:\\dev\\java\\ideaProject\\io");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void file03() {
        File file = new File("C:\\dev\\java\\ideaProject\\io\\2.txt");
        System.out.println("file.isDirectory()" + file.isDirectory());
        System.out.println("file.isFile()" + file.isFile());
        System.out.println("file.exists()" + file.exists());
    }

    private static void file02() throws IOException {
        File file =  new File("C:\\dev\\java\\ideaProject\\io\\2.txt");
        System.out.println("file.createNewFile()=" + file.createNewFile());

        File file1 = new File("C:\\dev\\java\\ideaProject\\io\\heihei\\haha");
        System.out.println("file1.mkdirs()=" + file1.mkdirs());
    }

    private static void file() {
        File file = new File("C:\\dev\\java\\ideaProject\\io","3.jpg");
        System.out.println(file);
        File file1 = new File("C:\\dev\\java\\ideaProject\\io");
        File file2 = new File(file1,"3.jpg");
        System.out.println(file2);
    }

    private static void file01() {
        File file = new File("1.txt");
        System.out.println("file.getAbsolutePath=" + file.getAbsolutePath());

        File file1 = new File("io\\1.txt");
        System.out.println("file1.getPath=" + file1.getPath());

        File file2 = new File("C:\\dev\\java\\ideaProject\\io\\3.jpg");
        System.out.println(file2.getName());

        File file3 = new File("C:\\dev\\java\\ideaProject\\io\\1.txt");
        System.out.println("file3.length()=" + file3.length());
    }
}
