package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;
    @BeforeMethod //Set this up because it will create a driver first everytime, then you can test on google title or yahoo title or etsy title.
public void setUpMethod() {
     driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void googleTitle() {
        driver.get("https://google.com");

        String actual = driver.getTitle();
        String expected = "Google";

        Assert.assertEquals(actual,expected,"Title verification failed");
    }

    @Test
    public void yahooTitle(){

    }

    @Test
    public void etsyTitle(){

    }


}
