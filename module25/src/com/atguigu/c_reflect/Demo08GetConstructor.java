package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author likang
 * @create 2024-12-03 20:18
 * @function
 */
public class Demo08GetConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);

        declaredConstructor.setAccessible(true);//解除私有权限--暴力反射

        System.out.println("personClass = " + personClass);
        Person person = declaredConstructor.newInstance("三山");
        System.out.println("person = " + person);

    }
}
