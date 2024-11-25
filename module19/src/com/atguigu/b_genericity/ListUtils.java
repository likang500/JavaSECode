package com.atguigu.b_genericity;

import java.util.ArrayList;

/**
 * ClassName: ListUtils
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:46
 * @Version 1.0
 */
public class ListUtils {
    //这里的<E>是声明含有泛型的方法
    public static <E> void addAll(ArrayList<E> list,E...e){
        for (E element : e) {
            list.add(element);
        }
    }
}
