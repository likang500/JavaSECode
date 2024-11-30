package com.atguigu.a_junit;

import org.junit.Test;

import java.util.List;

/**
 * @author likang
 * @create 2024-11-30 18:12
 * @function
 */
public class demo03junit {
    public static void main(String[] args) {
        /*CategoryController categoryController = new CategoryController();
        int result =categoryController.add("33");
        System.out.println("result = " + result);

        List<String> allCategory = categoryController.findAllCategory();
        System.out.println(allCategory);*/

    }
    /**
     * 此方法专门测试添加功能
     *
     *
     */
    @Test
    public void add(){
        CategoryController categoryController = new CategoryController();
        int result =categoryController.add("33");
        System.out.println("result = " + result);
    }
    /**
     * 此方法测查询功能
     */
    @Test
    public void finfAllCategory(){
        CategoryController categoryController = new CategoryController();
        List<String> allCategory = categoryController.findAllCategory();
        System.out.println(allCategory);
    }
}
