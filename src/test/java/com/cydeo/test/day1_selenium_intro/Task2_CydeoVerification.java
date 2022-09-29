package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("Https://practice.cydeo.com");


        String expectedURL = "cydeo";  //Comes from requirements
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedURL)){
            System.out.println("URL verification passed");
        } else{
            System.out.println("URL verification failed");
        }


        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verificantion passed!");
        }else {
            System.out.println("Title verication failed");
        }





driver.quit();


    }
}
