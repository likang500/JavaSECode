package com.atguigu.b_classloader;

import org.apache.commons.io.FileUtils;

/**
 * @author likang
 * @create 2024-11-30 21:49
 * @function
 */
public class Demo01ClassLoader {
    public static void main(String[] args) {
        app();
        ext();
        boot();
    }

    private static void boot() {

    }

    private static void ext() {

    }

    private static void app() {
        ClassLoader classLoader = Demo01ClassLoader.class.getClassLoader();
        System.out.println("classLoader = "+ classLoader);

        ClassLoader classLoader1 = FileUtils.class.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);
        ClassLoader parent = classLoader1.getParent();
        System.out.println("parent = " + parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println("parent1 = " + parent1);
    }
}
