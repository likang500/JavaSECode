package com.atguigu.a_collections.a_wait_notify.f_pool;

import java.util.concurrent.Callable;

/**
 * ClassName: MyString
 * Package: com.atguigu.a_wait_notify.f_pool
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:23
 * @Version 1.0
 */
public class MyString implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "那一夜，你没有拒绝我，那一夜，你伤害了我";
    }
}
