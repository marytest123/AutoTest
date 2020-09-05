package com.course.testng;

import org.testng.annotations.Test;

public class ignoreTest {

    @Test
    public void ignoreTest(){
        System.out.println("ignore1");
    }

    @Test(enabled=false)
    public void ignoreTest2(){
        System.out.println("ignore2");
    }

    @Test(enabled=true)
    public void ignoreTest3(){
        System.out.println("ignore3");
    }
}
