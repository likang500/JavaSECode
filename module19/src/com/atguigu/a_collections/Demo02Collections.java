package com.atguigu.a_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * ClassName: Demo02Collections
 * Package: com.atguigu.a_collections
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:10
 * @Version 1.0
 */
public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(12,"qq"));
        list.add(new Person(18,"qqa"));
        list.add(new Person(20,"qqb"));
        //Collections.sort(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age- o2.age;
            }
        });
        System.out.println(list);
    }
}
