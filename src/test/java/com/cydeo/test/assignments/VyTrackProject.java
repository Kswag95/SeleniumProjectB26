package com.cydeo.test.assignments;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class VyTrackProject extends HomePage{
  WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void login() throws InterruptedException {
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




        WebElement fleetOdometer = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        fleetOdometer.click();

        Thread.sleep(3000);
        logout.click();
        Thread.sleep(5000);
    }
    @AfterMethod
    public void tearDownMethod(){
driver.quit();
    }
}



class circle extends VyTrackProject{
    public double radius;
}
class Main{
    public static void main(String[] args) {
        Shape c1 = (Shape) new circle();
    }
}