package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyRandomPractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));

        if (checkbox1.isSelected()){
            System.out.println("checkbox1 is already selected");
        }else{
            checkbox1.click();
        }
        System.out.println(checkbox1.isSelected());
    }
}
