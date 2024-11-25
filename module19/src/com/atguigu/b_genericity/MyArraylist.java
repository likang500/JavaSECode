package com.atguigu.b_genericity;

import java.util.Arrays;

/**
 * ClassName: MyArraylist
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:37
 * @Version 1.0
 */
public class MyArraylist <E>{
    Object[] objects = new Object[10];
    int size;
    public boolean add(E e){
        objects[size] = e;
        size++;
        return true;
    }
    public E get(int index){
        return (E) objects[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
