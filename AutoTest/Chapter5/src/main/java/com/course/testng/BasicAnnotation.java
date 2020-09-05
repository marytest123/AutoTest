package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite");
    }

    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("AfterSuite");
    }

}
