package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnotherTestNGintro {

    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }
    @BeforeClass
    public void setUpMethod(){
        System.out.println("Before method  class is running");
    }
    @AfterClass
    public void tearDownMethod(){
        System.out.println("After method class is running");
    }

    @Test(priority = 2)
    public void test1() {
        System.out.println("Test1 is running");
        String actual = "applse";
        String expected = "apple";
        Assert.assertEquals(actual,expected, "Test1 did not pass");
    }
@Test (priority = 1)
    public void test2(){
    System.out.println("Test 2 is running");
     Assert.assertEquals("orange","orange","2 didnt pass");
    }
}
