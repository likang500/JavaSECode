package com.atguigu.a_collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName: Demo03Collection
 * Package: com.atguigu.a_collections
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:21
 * @Version 1.0
 */
public class Demo03Collections {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(12,"aa"));
        list.add(new Students(7,"bb"));
        list.add(new Students(72,"cc"));
        Collections.sort(list);
        System.out.println(list);
    }
}
