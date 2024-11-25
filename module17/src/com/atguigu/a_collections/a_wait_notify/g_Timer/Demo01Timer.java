package com.atguigu.a_collections.a_wait_notify.g_Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ClassName: Demo01Timer
 * Package: com.atguigu.a_wait_notify.g_Timer
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/10 22:38
 * @Version 1.0
 */
public class Demo01Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("哥哥快起床");
            }
        },new Date(),2000L);
    }
}
