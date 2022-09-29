package com.cydeo.test.day2_Locating;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsById {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google.com
        driver.get("Https://google.com");
        //Identify im feeling lucky element and save the element

        WebElement luckyText = driver.findElement(By.id("gbqfbb"));//We use WebElement the same way numbers go with int or characters go with string.

        //find value of attribute
       String text = luckyText.getAttribute("value");

       //Verify if value is "I'm feeling lucky"
        if (text.equals("I'm Feeling Lucky")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
    }
}
