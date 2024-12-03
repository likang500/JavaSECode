package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

/**
 * @author likang
 * @create 2024-12-03 19:39
 * @function
 */
public class Demo06GetConstruct {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println("constructor = " + constructor);

        Person person = constructor.newInstance("lk", 23);
        System.out.println("person = " + person);
    }
}
