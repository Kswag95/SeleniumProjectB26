package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_SimpleDropDown {

    WebDriver driver;

    @BeforeMethod
    public void SetupMethod(){

  driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void dropDownTest() {


        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

        String actualDropdown = simpleDropdown.getFirstSelectedOption().getText();

        String expectedDropdown = "Please select an option";

        Assert.assertEquals(actualDropdown, expectedDropdown, "wrong!");
    }
    @Test
    public void setStateDropdownTest(){

        Select stateDropdown = new Select(driver.findElement(By.id("state")));
        String actualStateText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateText = "Select a State";

        Assert.assertEquals(actualStateText,expectedStateText,"wrong assert");

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();


    }


    }

