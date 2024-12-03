package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

/**
 * @author likang
 * @create 2024-12-03 19:36
 * @function
 */
public class Demo05GetConstruct {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println("person = " + person);
    }
}
