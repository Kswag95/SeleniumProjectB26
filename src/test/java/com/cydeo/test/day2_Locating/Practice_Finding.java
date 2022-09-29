package com.cydeo.test.day2_Locating;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Finding {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("Https://duckduckgo.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.name("q"));

        Thread.sleep(3000);
        searchBox.sendKeys("I love my babyusha sasha" + Keys.ENTER);

        driver.quit();

















    }
}
