package com.atguigu.a_collections;

/**
 * ClassName: Students
 * Package: com.atguigu.a_collections
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:18
 * @Version 1.0
 */
public class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Students() {
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
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return this.getAge()-o.getAge();
    }
}
