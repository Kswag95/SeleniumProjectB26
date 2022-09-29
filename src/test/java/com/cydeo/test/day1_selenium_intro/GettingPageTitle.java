package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPageTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://cydeo.com");

        String title = driver.getTitle();
        System.out.println("Title of the page:" + title);

        if (title.equals("Cydeo")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.manage().window().maximize();

        driver.findElement(By.id("application"));
    }
}
