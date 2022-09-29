package com.cydeo.test.day2_Locating;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://facebook.com");
        driver.manage().window().maximize();

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Correct Title");
        }else {
            System.out.println("Incorrect title");
        }

    }
}
