package com.atguigu.a_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author likang
 * @create 2024-11-30 17:57
 * @function
 */
public class Demo01Junit {
    @Test
    public void add(){
        System.out.println("我是@Test执行的add方法");
    }
    @Test
    public void add1(){
        System.out.println("我是@Test执行的add1方法");
    }
    @Test
    public void add2(){
        System.out.println("我是@Test执行的add2方法");
    }
    @Before
    public void methodBefore(){
        System.out.println("我是@Test执行的methodBefore方法");
    }
    @After
    public void methodAfter(){
        System.out.println("我是@Test执行的methodAfter方法");
    }
}
