package com.aiguigu.acollection.c_ArrayList;

import java.util.ArrayList;

/**
 * ClassName: Demo01ArrayList
 * Package: com.aiguigu.acollection.c_ArrayList
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/12 20:23
 * @Version 1.0
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        System.out.println(list);
        list.add(0,"ling");
        System.out.println(list);
        list.remove("ling");
        System.out.println(list);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
        integers.remove(0);
        System.out.println(integers);
        integers.remove(new Integer(1));
        System.out.println(integers);
        integers.add(7);
        integers.add(3);
        integers.add(4);
        integers.set(0,999);
        System.out.println(integers);
        System.out.println(integers.get(0));
        System.out.println(integers.size());
    }
}
