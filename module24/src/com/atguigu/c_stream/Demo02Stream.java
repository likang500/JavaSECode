package com.atguigu.c_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author likang
 * @create 2024-11-30 11:37
 * @function 获取stream流对象
 */
public class Demo02Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("55");
        list.add("56");
        list.add("57");
        Stream<String> stream = list.stream();
        Stream<String> stream1 = Stream.of("11", "22", "33");

    }
}
