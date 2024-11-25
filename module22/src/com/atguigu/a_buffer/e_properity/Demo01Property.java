package com.atguigu.a_buffer.e_properity;

import java.util.Properties;
import java.util.Set;

/**
 * ClassName: Demo01Property
 * Package: com.atguigu.a_buffer.e_properity
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/12 20:04
 * @Version 1.0
 */
public class Demo01Property {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("PASSWORD","123456");
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(properties.getProperty(key));
        }
    }
}
