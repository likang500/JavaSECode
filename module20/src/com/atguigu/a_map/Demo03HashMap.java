package com.atguigu.a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: Demo03HashMap
 * Package: com.atguigu.a_map
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 21:39
 * @Version 1.0
 */
public class Demo03HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(2,"asd");
        integerStringHashMap.put(3,"asd");
        integerStringHashMap.put(42,"asd");
        integerStringHashMap.put(25,"asd");
        Set<Integer> set = integerStringHashMap.keySet();
        for (Integer key : set) {
            System.out.println(key+".."+integerStringHashMap.get(key));
        }
        Set<Map.Entry<Integer,String>> set1 = integerStringHashMap.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : set1) {
            Integer key = integerStringEntry.getKey();
            String value = integerStringEntry.getValue();
            System.out.println(key+".."+value);
        }
    }
}
