package com.atguigu.d_method;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author likang
 * @create 2024-11-30 16:23
 * @function
 */
public class Demo01Method {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("11", "22", "33", "44");
        /*stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        stream.forEach(s -> System.out.println(s));*/
        stream.forEach(System.out::println);

    }
}
