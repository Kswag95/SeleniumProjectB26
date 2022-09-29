package com.cydeo.test.day9;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
     driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts ");

    }

@Test
public void alert() throws InterruptedException {



    //3. Click to “Click for JS Prompt”
    WebElement jsPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
    jsPrompt.click();


    //4 send hello text to alert
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("hello");
    Thread.sleep(3000);

    //5. Click to OK button from the alert
    alert.accept();
    Thread.sleep(3000);

    //6. Verify “You entered:  hello” text is displayed.
    WebElement resultText = driver.findElement(By.id("result"));
    Assert.assertTrue(resultText.isDisplayed(),"result text did not appear!");


    String actualText = resultText.getText();
    String expectedText = "You entered: hello";
    Assert.assertEquals(actualText,expectedText,"result text did not appear correctly!");

}}
