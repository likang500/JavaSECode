package com.atguigu.a_map;

import java.util.LinkedHashMap;

/**
 * ClassName: Demo02LinkedHashMap
 * Package: com.atguigu.a_map
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 21:35
 * @Version 1.0
 */
public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> Map = new LinkedHashMap<>();
        Map.put(2,"1ss");
        Map.put(1,"3ss");
        Map.put(3,"2ss");
        System.out.println(Map);
    }
}
