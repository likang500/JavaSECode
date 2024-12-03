package com.atguigu.c_reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author likang
 * @create 2024-12-03 20:40
 * @function
 */
public class Demo08GetMethod {
    public static void main(String[] args) throws Exception{
        //method01();
        //method02();
        //method03();
        method04();
    }

    private static void method04() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method eat = personClass.getDeclaredMethod("eat");
        eat.setAccessible(true);
        eat.invoke(person);
    }

    private static void method03() {
        Class<Person> personClass = Person.class;
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod);
        }
    }

    private static void method02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method setName = personClass.getMethod("setName", String.class);
        System.out.println("setName = " + setName);
        setName.invoke(person,"liuyan");
        System.out.println("person = " + person);
        Method getName = personClass.getMethod("getName");
        Object invoke = getName.invoke(person);//返回值是getName（）的返回值
        System.out.println("invoke = " + invoke);
    }

    private static void method01() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
          }
    }
}
