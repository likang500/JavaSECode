package com.aiguigu.acollection.e_fori;

import java.util.LinkedList;

/**
 * ClassName: Demo01fori
 * Package: com.aiguigu.acollection.e_fori
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/12 20:40
 * @Version 1.0
 */
public class Demo01fori {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("aa");
        linkedList.add("ww");
        linkedList.add("ee");
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
