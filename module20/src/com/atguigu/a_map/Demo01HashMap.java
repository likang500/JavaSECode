package com.atguigu.a_map;

import java.util.Collection;
import java.util.HashMap;

/**
 * ClassName: Demo01HashMap
 * Package: com.atguigu.a_map
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 21:20
 * @Version 1.0
 */
public class Demo01HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // v put() 返回被覆盖的value,key重复会被覆盖
        String value = map.put("猪八","嫦娥");
        System.out.println(value);
        String value1 = map.put("猪八","二嫦");
        System.out.println(value1);
        map.put("后裔","嫦娥");
        map.put("后裔1","嫦娥1");
        map.put(null,null);
        System.out.println(map);
        // v remove（）根据key删除，返回value
        String value2 = map.remove("后裔");
        System.out.println(value2);
        //boolean containsKey()是否包含value
        boolean value3 = map.containsValue("嫦娥1");
        System.out.println(value3);
        //转存
        Collection<String> collection = map.values();
        System.out.println(collection);
    }
}
