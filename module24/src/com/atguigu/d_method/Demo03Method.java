package com.atguigu.d_method;

import javax.swing.*;
import java.util.function.Supplier;

/**
 * @author likang
 * @create 2024-11-30 16:34
 * @function
 */
public class Demo03Method {
    public static void main(String[] args) {
        /*method(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        });*/
        /*method(()->Math.random());*/
        method(Math::random);
    }
    public static void method(Supplier<Double> supplier){
        Double aDouble  = supplier.get();
        System.out.println("adouble"+ aDouble);
    }
}
