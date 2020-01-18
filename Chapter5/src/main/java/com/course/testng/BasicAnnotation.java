package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {

    // 最基本的注解，标识测试方法
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的");
    }
}
