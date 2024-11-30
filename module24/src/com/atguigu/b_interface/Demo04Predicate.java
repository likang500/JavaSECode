package com.atguigu.b_interface;

import java.util.function.Predicate;

/**
 * @author likang
 * @create 2024-11-29 17:24
 * @function
 */
public class Demo04Predicate {
    public static void main(String[] args) {
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("kk");
            }
        },"kk");

        method(s -> s.equals("lk"),"lk");
    }
    public static void method(Predicate<String> stringPredicate,String s){
        boolean result = stringPredicate.test(s);
        System.out.println("result = "+result);
    }
}
