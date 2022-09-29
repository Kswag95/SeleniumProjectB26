package com.cydeo.test.day18_review;

import com.cydeo.test.Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JSExecuterScrollTest {
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/infinite_scroll
    //3- Use below JavaScript method and scroll
    //a.  750 pixels down 10 times.
    //b.  750 pixels up 10 times
    @Test
    public void js_executer_scroll_test() throws InterruptedException {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        Thread.sleep(3000);
        //3- Use below JavaScript method and scroll


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0;i < 10 ; i++) {
            js.executeScript("window.scrollBy(0,7500)");
        }
Thread.sleep(1000);
        for (int i = 0; i < 10; i++){
            js.executeScript("window.scrollBy(0,-7500");
        }
        //a.  750 pixels down 10 times.

        //b.  750 pixels up 10 times
    }




    public JSExecuterScrollTest(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
