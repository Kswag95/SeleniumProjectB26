package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyRandomPractice2 {
    public static void main(String[] args) {
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    driver.get("http://practice.cydeo.com/radio_buttons");

        List<WebElement> allcolors = driver.findElements(By.name("color"));
        System.out.println(allcolors.size());

        for (WebElement color: allcolors){
            System.out.println("Current radio button is: " + color.getAttribute("id"));

            System.out.println("Is it enabled? " + color.isEnabled());

            System.out.println("is it selected? :" + color.isSelected());
        }

driver.quit();
    }
}
