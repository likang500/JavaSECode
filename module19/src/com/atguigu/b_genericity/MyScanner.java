package com.atguigu.b_genericity;

/**
 * ClassName: MyScanner
 * Package: com.atguigu.b_genericity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/20 17:05
 * @Version 1.0
 */
public class MyScanner implements MyInterator<String>{
    @Override
    public String next() {
        return "hello";
    }
}
