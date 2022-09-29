package com.cydeo.test.day10.UtilitiesAndWindows;

import com.cydeo.test.Utilities.CRM_Utilities;
import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_iFame_crm_appreciationTest extends TestBase {

    @Test
    public void sendingAppreciationMsg(){
//1- Open a chrome browser
//2- Go to: https://login2.nextbasecrm.com/
 driver.get("https://login2.nextbasecrm.com");
//3- Login Homepage ( Login with valid username and
//password)
      //  CRM_Utilities.crm_login(driver);
        CRM_Utilities.crm_login(driver,"hr1@cydeo.com","UserUser");
//        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        username.sendKeys("hr14@cybertekschool.com");
//        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
//        password.sendKeys("UserUser");
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
//4- Click the MORE tab and select APPRECIATION
        WebElement moreBtn = driver.findElement(By.xpath("//span[contains(@id,'link-text')]"));
        moreBtn.click();
        WebElement appreciation = driver.findElement(By.xpath("//span[.='Appreciation']"));
        appreciation.click();
//5- Write an Appreciation message
        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys("Hello!");
//6- Click the SEND button
        driver.switchTo().defaultContent();
        WebElement sentBtn = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sentBtn.click();
//7- Verify the Appreciation message is displayed on
//the feed
        WebElement feedText = driver.findElement(By.xpath("//div[starts-with(@id,'blog_post_body')]"));
        String actualtext = feedText.getText();
        String expectedText = "Hello!";
        Assert.assertEquals(actualtext,expectedText,"feed message did not appear correctly");
    }
}
