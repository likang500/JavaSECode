package com.atguigu.d_method;

import java.util.function.Function;

/**
 * @author likang
 * @create 2024-11-30 16:38
 * @function
 */
public class Demo04Method {
    public static void main(String[] args) {
        /*method(new Function<String, Person>() {
            @Override
            public Person apply(String s) {
                return new Person(s);
            }
        },"kk");*/
        method(Person::new,"kk");
    }
    public static void method(Function<String,Person> function,String name){
        Person person = function.apply(name);
        System.out.println(person);
    }
}
