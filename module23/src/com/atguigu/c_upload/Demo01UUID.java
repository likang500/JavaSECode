package com.atguigu.c_upload;

import java.util.UUID;

/**
 * ClassName: Demo01UUID
 * Package: com.atguigu.c_upload
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 21:16
 * @Version 1.0
 */
public class Demo01UUID {
    public static void main(String[] args) {
        String string = UUID.randomUUID().toString();
        System.out.println("String" + string);
    }
}
