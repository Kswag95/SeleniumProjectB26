package com.cydeo.test.day8.Dropdown;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdown {
    WebDriver driver;
    @BeforeMethod

    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @Test
    public void dateDropDownTest(){
        Select yearDropdown = new Select(driver.findElement(By.id("year")));
       Select monthDropdown = new Select(driver.findElement(By.id("month")));
       Select dayDropdown = new Select(driver.findElement(By.id("day")));

        for (WebElement eachYearOption : yearDropdown.getOptions()) {
            System.out.println(eachYearOption.getText());
        }


       yearDropdown.selectByVisibleText("1923");
       monthDropdown.selectByValue("11");
       dayDropdown.selectByIndex(0);

       String actualYear = yearDropdown.getFirstSelectedOption().getText();
       String actualMonth = monthDropdown.getFirstSelectedOption().getText();
       String actualDay = monthDropdown.getFirstSelectedOption().getText();

       String expectedYear ="1923";
       String expectedMonth = "December";
       String expectedDay = "1";

       Assert.assertTrue(actualYear.equals(expectedYear));
       Assert.assertTrue(actualMonth.equals(expectedMonth));
       Assert.assertTrue(actualDay.equals(expectedDay));
       Assert.assertEquals(actualYear,expectedYear,"you messed up");
    }



}

