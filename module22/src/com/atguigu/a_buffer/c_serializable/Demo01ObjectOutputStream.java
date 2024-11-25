package com.atguigu.a_buffer.c_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * ClassName: Demo01ObjectOutputStream
 * Package: com.atguigu.a_buffer.c_serializable
 * Description:序列化及反序列化，即存对象 取对象
 *
 * @Author LiKang
 * @Create 2024/11/10 14:15
 * @Version 1.0
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws Exception{
        write();
    }

    private static void write() throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("module22\\person.txt"));
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("涛",12);
        Person p2 = new Person("涛",13);
        Person p3 = new Person("涛",14);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        oos.writeObject(list);
        oos.close();
    }
}
