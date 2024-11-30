package com.atguigu.b_interface;

import java.util.function.Function;

/**
 * @author likang
 * @create 2024-11-29 17:17
 * @function
 */
public class Demo03Function {
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        },45);
        method(integer -> integer+"",45);
    }
    public static void method(Function<Integer,String> function,Integer integer){
        String s = function.apply(integer);
        System.out.println("s = "+(s+1));
    }
}
