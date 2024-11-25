package com.atguigu.a_collections.a_wait_notify.e_pool;

import java.util.concurrent.Callable;

/**
 * ClassName: Mycallable
 * Package: com.atguigu.a_wait_notify.e_pool
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:18
 * @Version 1.0
 */
public class Mycallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1;
    }
}
