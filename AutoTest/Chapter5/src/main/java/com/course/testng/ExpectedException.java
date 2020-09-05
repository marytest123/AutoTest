package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("failed exception");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucced(){
        System.out.println("success exception");
        throw new RuntimeException();
    }

}
