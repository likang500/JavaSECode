package com.atguigu.a_buffer.e_properity;

import java.io.FileInputStream;
import java.io.IOException;
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
public class Demo02Property {
    public static void main(String[] args) throws IOException {//从配置文件读取
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("module22\\xxx.properties");
        properties.load(fis);
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"..."+properties.getProperty(key));
        }
    }
}



public interface test1<Integer>{
    public void method(Integer integer){
        System.out.println(integer);
    }
}

public interface test2{
    public void method(Object object){
        System.out.println(object);
    }
}