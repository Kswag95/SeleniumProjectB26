package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException{

    //.Setting up webdriver manager
        WebDriverManager.chromedriver().setup();
//creating instance of webDriver
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);
        //3 make our page fullscreen
        driver.manage().window().maximize();

        driver.get("" +
                "https://www.etsy.com");

        //navigate(). to () method is for navigating to web page
        //driver.navigate(). to (https://www.etsy.com");

        //it is using for stopping application. we are giving time to application to see steps
        Thread.sleep(3000);

        //navigate().back() method is for navigating to back from the webpage
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        //navigate.forward() method is for navigating
        driver.navigate().forward();
        Thread.sleep(3000);


        //navigate().refresh() method if for refreshing the page
        driver.navigate().refresh();

System.out.println("Etsy page  driver.getTitle() = " + driver.getTitle());
        System.out.println("Etsy page driver.getCurrentUrl() = " + driver.getCurrentUrl());

driver.get("https://tesla.com");

        System.out.println("Tesla page driver.getTitle()= " + driver.getTitle());

        System.out.println("Telsa page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //this will close the currently opened page
        driver.close();
        //this will close all of the tabs
        driver.quit();
    }
}
