package com.aiguigu.acollection.a_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ClassName: Demon01Collection
 * Package: com.aiguigu.acollection
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/12 19:53
 * @Version 1.0
 */
public class Demon01Collection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("晓燕");
        collection.add("晓收");
        collection.add("收燕");
        System.out.println(collection);
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("qq");
        collection1.add("ww");
        collection.addAll(collection1);
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        boolean result = collection1.contains("rr");
        System.out.println(result);
        boolean result1 = collection.isEmpty();
        System.out.println(result1);
        System.out.println(collection1);
        collection1.remove("ww");
        System.out.println(collection1);
        int size = collection1.size();
        System.out.println(size);
        collection1.add("aa");
        System.out.println(collection1);
        //String[] strings = (String[]) collection1.toArray(); 错误写法
        String[] strings1 = collection1.toArray(new String[0]);
        Object[] strings2 = collection1.toArray();
        System.out.println(Arrays.toString(strings1));
    }
}
