package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KevinsPersonalPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

       WebDriver driver = new ChromeDriver();

       driver.manage().window().maximize();

       driver.navigate().to("Https://facebook.com");

        System.out.println(driver.getTitle() + " -Driver title");
        System.out.println(driver.getCurrentUrl() + " -CurrentUrl");

        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("True");
        }else {
            System.out.println("false");
        }







    }
}
