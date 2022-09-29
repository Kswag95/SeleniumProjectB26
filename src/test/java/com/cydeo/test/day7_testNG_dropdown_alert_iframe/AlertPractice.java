package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

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
    public void infortmationAlerts(){
        WebElement jsAlertBTN = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertBTN.click();

        Alert alert =driver.switchTo().alert();
        alert.accept();


        WebElement resultText = driver.findElement(By.id("result"));

        Assert.assertTrue(resultText.isDisplayed());

        String actualResult = resultText.getText();
        String expectedResultText = "You successfully clicked an alert";
        Assert.assertEquals(actualResult,expectedResultText,"Result text did not appear correctly");
    }


}
