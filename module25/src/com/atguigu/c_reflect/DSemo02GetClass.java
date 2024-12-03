package com.atguigu.c_reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author likang
 * @create 2024-12-03 14:39
 * @function
 */
public class DSemo02GetClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("module25\\pro.properties");
        properties.load(fileInputStream);

        String className = properties.getProperty("className");
        System.out.println("className = " + className);

        Class<?> aClass = Class.forName(className);
        System.out.println("aClass = " + aClass);
    }
}
