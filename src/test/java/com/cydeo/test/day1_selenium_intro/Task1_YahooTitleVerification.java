package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //Before starting automation. First step...Set up webDriver manager!!
        WebDriverManager.chromedriver().setup();

        //Create the instance of a WebDriver
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        //Maximize the page
        driver.manage().window().maximize();

        driver.get("Https://yahoo.com");

        //actual title comes from selenium
        String actualTitle = driver.getTitle();
        System.out.println("Actual title of Yahoo: " + actualTitle);
        //expected title comes from requirements
        String expectedTitle = "Yahoo";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed:");
        }else {
            System.out.println("Title verification failed");
        }


        driver.quit();


    }
}
