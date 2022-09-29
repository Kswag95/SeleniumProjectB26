package com.cydeo.test.day2_Locating;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    /*
    - Open a chrome browser
2- Go to: https://google.com/
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("Https://google.com");
        Thread.sleep(3000);

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("apple" + Keys.ENTER);

        Thread.sleep(3000);
        WebElement clickbox = driver.findElement(By.className("gNO89b"));
        clickbox.click();

Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Correct");
        }else {
            System.out.println("Wrong");
        }
        driver.quit();
    }
}

