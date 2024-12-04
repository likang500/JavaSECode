package com.atguigu.c_reflect;


import java.lang.reflect.Field;

/**
 * @author likang
 * @create 2024-12-04 20:49
 * @function
 */
public class Demo10GetField {
    public static void main(String[] args) throws Exception{
        //method01();
        //method02();
        method03();
    }

    private static void method03() throws Exception{
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Field name = studentClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(student,"hi");
        Object o = name.get(student);
        System.out.println("o = " + o);
    }

    private static void method02() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Field age = studentClass.getField("age");
        age.set(student,10);
        Object o = age.get(student);
        System.out.println("o = " + o);
    }

    private static void method01() {
        Class<Student> studentClass = Student.class;
        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        Field[] declaredFields = studentClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
