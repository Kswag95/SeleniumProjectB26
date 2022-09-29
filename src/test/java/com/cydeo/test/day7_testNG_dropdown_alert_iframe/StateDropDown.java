package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StateDropDown {

    WebDriver driver;

    @BeforeMethod
    public void SetupMethod() {

        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void test() throws InterruptedException {

        Select stateDropbox = new Select(driver.findElement(By.id("state")));
        //3. Select Illinois
        Thread.sleep(3000);
        stateDropbox.selectByValue("IL");
        //4. Select Virginia
        Thread.sleep(3000);
        stateDropbox.selectByVisibleText("Virginia");
        //5. Select California
        Thread.sleep(3000);
        stateDropbox.selectByIndex(5);
        //6. Verify final selected option is California.

        String actualStateOption = stateDropbox.getFirstSelectedOption().getText();
        String expectedStateOption ="California";

        Assert.assertEquals(actualStateOption,expectedStateOption,"Selected option verification has failed");
        //Use all Select options. (visible text, value, index)
    }

    @Test
    public void multipleDropDown() throws InterruptedException {
        Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        System.out.println("languages.isMultiple() = " + languages.isMultiple());

        Thread.sleep(3000);
        languages.selectByValue("java");
        Thread.sleep(3000);
        languages.selectByVisibleText("C#");
        Thread.sleep(3000);
        languages.selectByIndex(3);

        //print out all selected values

//        List<WebElement> alloption = languages.getOptions();

        for (WebElement each:languages.getOptions()) {
            if (each.getText().equals("JAVA"))
            each.click();
            Thread.sleep(3000);
            System.out.println("each.getText() = " + each.getText());
        }
        //deselect values5



    Thread.sleep(3000);
    languages.deselectAll();


    }
    }


