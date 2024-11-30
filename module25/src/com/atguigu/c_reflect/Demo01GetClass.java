package com.atguigu.c_reflect;

import org.junit.Test;

/**
 * @author likang
 * @create 2024-11-30 22:54
 * @function
 */
public class Demo01GetClass {
    @Test
    public void get1() throws ClassNotFoundException {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println("aClass = " + aClass);

        Class<Person> personClass = Person.class;
        System.out.println("personClass = " + personClass);

        Class<?> aClass1 = Class.forName("com.atguigu.c_reflect.Person");
        System.out.println("aClass1 = " + aClass1);

        Class.forName("com.atguigu.c_reflect.Person");
        Class.forName("com.atguigu.c_reflect.Person");

        System.out.println(aClass1 == aClass);


    }
}
