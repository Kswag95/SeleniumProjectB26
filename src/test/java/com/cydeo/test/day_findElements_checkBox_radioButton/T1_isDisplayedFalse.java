package com.cydeo.test.day_findElements_checkBox_radioButton;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_isDisplayedFalse {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");

        //h1[contains(text(),
        WebElement solarHeader = driver.findElement(By.xpath("//h1[contains(text(),'Solar Panels')])[1]"));


        System.out.println("SolarHeader.isDisplayed() =" + solarHeader.isDisplayed());
    }
}
