package com.atguigu.d_method;

import java.util.function.Function;

/**
 * @author likang
 * @create 2024-11-30 16:45
 * @function
 */
public class Demo05Method {
    public static void main(String[] args) {
        /*method(new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        },5);*/
        /*method(integer -> new int[integer],5);*/
        method(int[]::new,5);
    }
    public static void method(Function<Integer,int[]>function,Integer len){
        int[] arr = function.apply(len);
        System.out.println(arr.length);
    }
}
