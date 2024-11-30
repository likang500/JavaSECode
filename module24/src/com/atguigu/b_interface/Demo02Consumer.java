package com.atguigu.b_interface;

import java.util.function.Consumer;

/**
 * @author likang
 * @create 2024-11-29 17:11
 * @function
 */
public class Demo02Consumer {
    public static void main(String[] args) {
        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        },"abcde");

        method( s-> System.out.println(s.length()),"abcde");
    }
    public static void method(Consumer<String> consumer,String s){
        consumer.accept(s);
    }
}
