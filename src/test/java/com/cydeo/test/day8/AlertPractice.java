package com.cydeo.test.day8;

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
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void confirmAlertTest(){
        WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
confirmAlertBtn.click();

Alert alert = driver.switchTo().alert();
alert.accept();

WebElement resultText = driver.findElement(By.id("result"));


        Assert.assertTrue(resultText.isDisplayed(),"result text did not appear");

        String actualtext = resultText.getText();
        String expectedText = "You clicked: Ok";

    }
}
