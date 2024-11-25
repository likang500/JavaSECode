package com.atguigu.a_separator;

import java.io.File;

/**
 * ClassName: Demo03File
 * Package: com.atguigu.a_separator
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/24 10:46
 * @Version 1.0
 */
public class Demo03File {
    public static void main(String[] args) {
        File file = new File("C:\\dev\\java\\ideaProject\\io");
        method(file);
    }

    private static void method(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                String name = file1.getName();
                if(name.endsWith(".txt")){
                    System.out.println(name);
                }else {
                    method(file1);
                }
            }
        }
    }
//    1.绝对路径:从盘符开始写的路径
//    E:\\idea\\io\\1.txt
//2.相对路径:不从盘符名开始写的路径
//
//3.针对idea中写相对路径:
//    a.口诀:哪个路径是参照路径,哪个路径就可以省略不写,剩下的就是在idea中的相对路径写法
//            在idea中参照路径其实就是当前project的绝对路径
//
//    b.比如:在module21下创建了一个1.txt
//    先找1.txt的绝对路径:E:\Idea\idea2022\workspace\javase\module21\1.txt
//    再找参照路径:E:\Idea\idea2022\workspace\javase
//    参照路径可以省略:module21\1.txt
//
//4.总结:
//    在idea中写的相对路径,其实就是从模块名开始写
//
//5.注意:
//    如果直接写一个文件名1.txt,它所在的位置默认是在当前project下
}
