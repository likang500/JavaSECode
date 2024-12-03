package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

/**
 * @author likang
 * @create 2024-12-03 15:12
 * @function
 */
public class Demo03GetConstruyctor {
    public static void main(String[] args) {
        Class<Person> aClass = Person.class;
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

    }
}
