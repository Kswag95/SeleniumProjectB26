package com.cydeo.test.day9;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePractice extends TestBase {

    @Test
    public void iFrameTest() throws InterruptedException {
        //2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

        //3- Clear text from comment body



        //we can use frame(id) method with id arg.
     driver.switchTo().frame("mce_0_ifr");

        //we can use frame(locator)
     //   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //we can use frame(index) count how many iframe to figure out which index it is.
     // driver.switchTo().frame(0);

        WebElement body = driver.findElement(By.id("tinymce")); //nosuchElement exception reason- Not located correctly

        body.clear();
        Thread.sleep(3000);

        body.sendKeys("Hello World");
Thread.sleep(2000);
        Assert.assertEquals(body.getText(),"Hello World");


        //4- Type "Hello World" in comment body


        //5- Verify "Hello World" text is written
        // in comment body
        driver.switchTo().defaultContent();
        //6- Verify header "An iFrame containing the TinyMCE
        //WYSIWYG Editor" is displayed
        WebElement headertxt = driver.findElement(By.tagName("h3"));
        Thread.sleep(2000);
        Assert.assertTrue(headertxt.isDisplayed(),"header txt did not appear");

        String actualheader = headertxt.getText();
        String expectedheader = "An iFrame containing the TinyMCE" +
                " WYSIWYG Editor";
        Assert.assertEquals(actualheader,expectedheader,"wrong header");
    }


}
