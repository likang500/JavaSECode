package com.atguigu.a_buffer.c_serializable;

import java.io.Serializable;

/**
 * ClassName: Person
 * Package: com.atguigu.a_buffer.c_serializable
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/10 14:11
 * @Version 1.0
 */
public class Person implements Serializable {//将对象实现一个序列化接口，对象才能变成二级制，在网络上传输
    public static final long serialVersionUID = 42L;
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
