package com.atguigu.a_collections.a_wait_notify.f_pool;

import java.util.concurrent.Callable;

/**
 * ClassName: Mysum
 * Package: com.atguigu.a_wait_notify.f_pool
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:24
 * @Version 1.0
 */
public class Mysum implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
