package com.atguigu.a_collections;

/**
 * ClassName: Person
 * Package: com.atguigu.a_collections.a_collections
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:08
 * @Version 1.0
 */
public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
