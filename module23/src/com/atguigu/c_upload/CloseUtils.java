package com.atguigu.c_upload;

import java.io.Closeable;
import java.io.IOException;

/**
 * ClassName: CloseUtils
 * Package: com.atguigu.c_upload
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 21:29
 * @Version 1.0
 */
public class CloseUtils {
    private CloseUtils(){

    }
    public static void closeQ(Closeable... resources){
        for (Closeable resource : resources) {
            if (resource != null) {
                try {
                    resource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
