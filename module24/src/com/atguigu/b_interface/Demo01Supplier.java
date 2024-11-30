package com.atguigu.b_interface;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @author likang
 * @create 2024-11-29 17:05
 * @function
 */
public class Demo01Supplier {
    public static void main(String[] args) {
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int[] arr = {3,5,67,7,2};
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        });

        method(()-> {
                int[] arr = {3,5,67,7,2};
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        );
    }
    public static void method(Supplier<Integer> supplier){
        Integer max = supplier.get();
        System.out.println("max = " + max);
    }
}
