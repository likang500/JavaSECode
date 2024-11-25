package com.aiguigu.acollection.d_LinkedList;

import java.util.LinkedList;

/**
 * ClassName: Demo01LinkedList
 * Package: com.aiguigu.acollection.d_LinkedList
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/12 20:35
 * @Version 1.0
 */
public class Demo01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("qq");
        linkedList.add("ww");
        linkedList.add("ee");
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        linkedList.push("vv");
        System.out.println(linkedList);
    }
}
