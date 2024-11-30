package com.atguigu.e_design;

/**
 * @author likang
 * @create 2024-11-28 20:41
 * @function
 */
public abstract class Hotel {
    public void eat(){
        System.out.println("点菜");
        eatCai();
        System.out.println("买单");
    }
    public  abstract void eatCai();
}
