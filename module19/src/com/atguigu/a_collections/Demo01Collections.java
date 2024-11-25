package com.atguigu.a_collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName: Demo01Collections
 * Package: com.atguigu.a_collections
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:01
 * @Version 1.0
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //批量添加元素
        Collections.addAll(list,"zhangsan","lisi","wangwu","zhuba");
        System.out.println(list);
        //打乱元素顺序
        Collections.shuffle(list);
        System.out.println(list);
        //按默认规则排序，ASCCII码表
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a.qq");
        list1.add("b.qq");
        list1.add("c.qq");
        list1.add("d.qq");
        System.out.println(list1);
        //添加比较器进行比较,o1-o2,升序；o2-o1，降序；

    }
}
