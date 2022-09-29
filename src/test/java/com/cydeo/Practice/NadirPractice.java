package com.cydeo.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NadirPractice {
    public static void main(String[] args) throws InterruptedException {
        // 1.Open Chrome
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2.  go to website

        driver.navigate().to("https://login2.nextbasecrm.com");

        Thread.sleep(1000);
//  3. Verify title equals
        //  Expected: Authorization
        String expectedTitle = "Authorization";
        String actualTitle = driver.getTitle();

        System.out.println(expectedTitle.equals(actualTitle) ? "Passed" : "Failed");


        //   5 fill form with the following information by using name locator
        WebElement emailBox = driver.findElement(By.name("USER_LOGIN"));
        emailBox.sendKeys("helpdesk22@cybertekschool.com");
        //    email: helpdesk22@cybertekschool.com
        // password = UserUser
        WebElement passBox = driver.findElement(By.name("USER_PASSWORD"));
        Thread.sleep(1000);
        passBox.sendKeys("UserUser");
        //    6 click on Log in Button by using namen
        WebElement loginBtm = driver.findElement(By.className("login-btn"));
        loginBtm.click();

        //   7 verify title equals:
        // Expected: (19)Portal

        expectedTitle = "(16)Portal";
        System.out.println(actualTitle.equals(expectedTitle) ? "Correct Title" : "Incorrect title");

        Thread.sleep(3000);
        driver.quit();
    }
}