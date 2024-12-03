package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

/**
 * @author likang
 * @create 2024-12-03 15:21
 * @function
 */
public class Demo04GetConstruct {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        System.out.println("constructor = " + constructor);
        Person person = constructor.newInstance();
        System.out.println("person = " + person);
    }
}
