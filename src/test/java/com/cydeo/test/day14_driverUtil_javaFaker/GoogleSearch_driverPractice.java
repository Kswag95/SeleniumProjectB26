package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.Utilities.ConfigurationReader;
import com.cydeo.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch_driverPractice {


    @Test
    public void googleSearchDriverPractice(){

        Driver.getDriver().get(ConfigurationReader.getProperty("google_url"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        // Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        searchBox.sendKeys("apple" + Keys.ENTER);

        // Verify title:
        //Expected: apple - Google Search
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        String expectedTitle= "apple - Google Search";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
