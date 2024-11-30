package com.atguigu.a_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author likang
 * @create 2024-11-29 11:33
 * @function
 */
public class Demo03Lambda {
    public static void main(String[] args) {
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("jack",19));
        list1.add(new Person("lose",13));
        list1.add(new Person("macle",20));

        Collections.sort(list1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        Collections.sort(list1, (Person o1, Person o2)->{
                return o1.getAge()-o2.getAge();
            }
        );

        Collections.sort(list1, ( o1,  o2)-> o1.getAge()-o2.getAge());

        System.out.println(list1);
    }
}
