package com.atguigu.c_reflect;

/**
 * @author likang
 * @create 2024-11-30 22:52
 * @function
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Person(String name){
        this.name = name;
    }
    public Person(){
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    private void eat(){
        System.out.println("人要吃饭");
    }
}
