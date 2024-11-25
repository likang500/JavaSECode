package com.atguigu.a_collections.a_wait_notify.d_callable;

import java.util.concurrent.Callable;

/**
 * ClassName: Mycallable
 * Package: com.atguigu.a_wait_notify.d_callable
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 21:08
 * @Version 1.0
 */
public class Mycallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello";
    }
}
