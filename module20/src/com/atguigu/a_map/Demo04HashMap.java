package com.atguigu.a_map;

import java.util.HashMap;

/**
 * ClassName: Demo04HashMap
 * Package: com.atguigu.a_map
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 21:46
 * @Version 1.0
 */
public class Demo04HashMap {
    public static void main(String[] args) {
        HashMap<Person, String> personStringHashMap = new HashMap<>();
        personStringHashMap.put(new Person("qq", 18), "hi");
        personStringHashMap.put(new Person("qq",18),"h3");
        System.out.println(personStringHashMap);
    }
}
