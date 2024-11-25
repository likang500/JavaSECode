package com.atguigu.b_genericity;

/**
 * ClassName: MyList
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 16:56
 * @Version 1.0
 */

//含有泛型的接口在实现类不确定类型，在new实现类时确定类型,比如ArrayList
//含有泛型的接口在实现类时确定类型,比如Scanner
public interface MyList <E>{
    public  boolean add(E e);
}
