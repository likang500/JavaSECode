package com.aiguigu.acollection.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName: Demo01Iterator
 * Package: com.aiguigu.acollection.b_iterator
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/12 20:08
 * @Version 1.0
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        //获取迭代器对象
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
