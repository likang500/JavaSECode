package com.atguigu.f_design;

/**
 * @author likang
 * @create 2024-11-28 21:53
 * @function
 */
public class Singleton1 {
    private static  Singleton1 singleton1 = null;
    public static Singleton1 getSingleton1(){
        if(singleton1==null){
            synchronized (Singleton1.class){
                if(singleton1==null){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
