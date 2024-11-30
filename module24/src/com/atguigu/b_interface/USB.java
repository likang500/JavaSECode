package com.atguigu.b_interface;

/**
 * @author likang
 * @create 2024-11-29 16:54
 * @function
 */
@FunctionalInterface
public interface USB {
    void open(String strign);
    //void open2(); interface的抽象方法只能有一个
}
