package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups="server")
    public void test1(){
        System.out.println("server1");
    }

    @Test(groups="server")
    public void tes2(){
        System.out.println("server2");
    }

    @Test(groups="client")
    public void test3(){
        System.out.println("client1");
    }

    @Test(groups="client")
    public void test4(){
        System.out.println("client2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("beforeGroupsOnServer");
    }

    @AfterGroups("server")
    public void afterGroupsOneSrver(){
        System.out.println("afterGroupsOnServer");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnclient(){
        System.out.println("beforeGroupsOnServer");
    }

    @AfterGroups("client")
    public void afterGroupsOnclient(){
        System.out.println("afterGroupsOnServer");
    }
}
