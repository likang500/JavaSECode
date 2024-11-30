package com.atguigu.g_lombok;

/**
 * @author likang
 * @create 2024-11-29 10:44
 * @function
 */
public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("李四");
        person.setAge(12);
        System.out.println(person.getAge()+"..."+person.getName());
        Person person1 = new Person("sanshang", 28);
        System.out.println(person1.getAge()+"..."+person1.getName());
    }
}
