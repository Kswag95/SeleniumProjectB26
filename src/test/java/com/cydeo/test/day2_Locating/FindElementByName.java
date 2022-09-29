package com.cydeo.test.day2_Locating;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("Https://google.com");
        driver.manage().window().maximize();

        //Identifying and save the searchbox engine
        WebElement searchBox = driver.findElement(By.name("q"));

        //enter text "selenium" and search for it
        searchBox.sendKeys("selenium" + Keys.ENTER);

        //Close the browser
        driver.quit();

    }
}
