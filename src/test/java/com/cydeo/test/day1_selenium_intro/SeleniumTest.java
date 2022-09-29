package com.cydeo.test.day1_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

    //Set up webDriver manager;
      // WebDriverManager.chromedriver().setup();
System.setProperty("webdriver.chrome.driver","C:/Users/Kevin Vieira/Desktop/chromedriver.exe");
    //Create instance of chrome driver


        WebDriver driver = new ChromeDriver();

        driver.get("Https://www.google.com");
    }}
