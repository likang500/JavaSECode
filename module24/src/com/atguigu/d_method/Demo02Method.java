package com.atguigu.d_method;

import java.util.function.Supplier;

/**
 * @author likang
 * @create 2024-11-30 16:27
 * @function
 */
public class Demo02Method {
    public static void main(String[] args) {
        /*method(new Supplier<String>() {
            @Override
            public String get() {
                return " abc ".trim();
            }
        });*/
        method(" abc "::trim);
    }
    public static void method(Supplier<String> supplier){
        String s = supplier.get();
        System.out.println("s = "+ s);
    }
}
