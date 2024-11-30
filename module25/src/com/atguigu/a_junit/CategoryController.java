package com.atguigu.a_junit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author likang
 * @create 2024-11-30 18:10
 * @function
 */
public class CategoryController {
    public int add(String s){
        ArrayList<String> list = new ArrayList<>();
        list.add(s);
        return 1;
    }
    public List<String> findAllCategory(){
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("12");
        list.add("13");
        return list;
    }
}

