package com.atguigu.d_Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author likang
 * @create 2024-12-04 21:26
 * @function
 */
public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream resourceAsStream = Demo01Reflect.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
