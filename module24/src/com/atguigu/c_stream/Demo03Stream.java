package com.atguigu.c_stream;

import com.atguigu.a_lambda.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

/**
 * @author likang
 * @create 2024-11-30 11:43
 * @function
 */
public class Demo03Stream {
    public static void main(String[] args) {
        foreach();
        count();
        filter();
        limit();
        skip();
        concat();
        collect();
        distinct();
        map();
    }

    private static void map() {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        stream.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        }).forEach(s -> System.out.println(s+1));
    }

    private static void distinct() {
        Stream<String> stream1 = Stream.of("11", "22", "33","33");
        stream1.distinct().forEach(s -> System.out.println(s));
        Stream<Person> stream = Stream.of(new Person("li",12),new Person("li",12));
        stream.distinct().forEach(person->{System.out.println(person);});
    }

    private static void collect() {
        Stream<String> stream1 = Stream.of("11", "22", "33");
        List<String> list = stream1.collect(Collectors.toList());
        System.out.println(list);
    }

    private static void concat() {
        Stream<String> stream1 = Stream.of("11", "22", "33");
        Stream<String> stream2 = Stream.of("66", "55", "44");
        Stream.concat(stream2,stream1).forEach(s -> System.out.println(s));
    }

    private static void skip() {
        Stream<String> stream1 = Stream.of("11", "22", "33");
        stream1.skip(2).forEach(s -> System.out.println(s));
    }

    private static void limit() {
        Stream<String> stream1 = Stream.of("11", "22", "33");
        stream1.limit(2).forEach(s -> System.out.println(s));
    }

    private static void filter() {
        Stream<String> stream1 = Stream.of("11", "22", "33");
        /*stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("1");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        stream1.filter(s -> s.startsWith("1")).forEach(s -> System.out.println(s));
    }

    private static void count() {
        Stream<String> stream1 = Stream.of("11", "22", "33");
        System.out.println(stream1.count());
    }

    /**
     *
     */
    private static void foreach() {
        Stream<String> stream1 = Stream.of("11", "22", "33");
        /*stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        stream1.forEach(s -> System.out.println(s));
    }
}
