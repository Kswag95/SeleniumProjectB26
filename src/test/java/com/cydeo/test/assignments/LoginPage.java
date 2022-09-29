package com.cydeo.test.assignments;

import com.cydeo.test.Utilities.WebDriverFactory;
import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends TestBase {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://qa2.vytrack.com/user/login");
        WebElement usernameBox = driver.findElement(By.id("prependedInput"));
        usernameBox.sendKeys("User33");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("UserUser123");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement loginBox = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBox.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

