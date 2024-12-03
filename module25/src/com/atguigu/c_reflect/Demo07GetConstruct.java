package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

/**
 * @author likang
 * @create 2024-12-03 19:58
 * @function
 */
public class Demo07GetConstruct {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("declaredConstructor = " + declaredConstructor);
        }
    }
}
