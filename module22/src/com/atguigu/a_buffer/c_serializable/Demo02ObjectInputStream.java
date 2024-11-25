package com.atguigu.a_buffer.c_serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * ClassName: Demo02ObjectInputStream
 * Package: com.atguigu.a_buffer.c_serializable
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/10 14:18
 * @Version 1.0
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws Exception{
        read();
    }

    private static void read() throws Exception{
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("module22\\person.txt"));
        ArrayList<Person>  list = (ArrayList<Person>) oos.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        oos.close();
    }
}