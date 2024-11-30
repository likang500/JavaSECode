package com.atguigu.c_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author likang
 * @create 2024-11-30 12:17
 * @function
 */
public class Demo04Stream {
    public static void main(String[] args) {
        Stream<String> TeamA  = Stream.of("1","22","222","333","444","441","442","443","555","6666");
        Stream<String> TeamB  = Stream.of("16","228","3339","440","441","442","443","55-","66664");
        Stream<String> list1 = TeamA.filter(s -> s.length()==3).limit(3);
        Stream<String> list2 = TeamB.filter(s -> s.startsWith("4")).skip(2);
        Stream.concat(list2,list1).forEach(s -> System.out.println(s));

    }
}
