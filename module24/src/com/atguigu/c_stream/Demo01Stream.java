package com.atguigu.c_stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author likang
 * @create 2024-11-30 10:52
 * @function
 */
public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1233");
        list.add("123");
        list.add("124");
        list.add("125");
        list.add("225");
        Stream<String> stream = list.stream();
        /*stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("1");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        stream.filter(s -> s.startsWith("1")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
    }
}
