package com.cydeo.test.assignments.PracticeAhmet;

import com.cydeo.test.Utilities.WebDriverFactory;
import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VytackProject2 extends TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
    }

        @Test
        public void login () throws InterruptedException {

            WebElement usernameBox = driver.findElement(By.id("prependedInput"));
            usernameBox.sendKeys("User33");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
            passwordBox.sendKeys("UserUser123");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement loginBox = driver.findElement(By.xpath("//button[@type='submit']"));
            loginBox.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            WebElement fleetModule = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
            fleetModule.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            WebElement vehiclesModels = driver.findElement(By.xpath("//span[.='Vehicles Model']"));
            vehiclesModels.click();
            Thread.sleep(3000);

            String currentPageTitle = driver.getTitle();
            String expectedPagetitle = "Vehicles Model - Entities - System - Car - Entities - System";
            Assert.assertEquals(currentPageTitle, expectedPagetitle, "Wrong page title");
            Thread.sleep(3000);

            WebElement userDropdown = driver.findElement(By.xpath("//li[@id='user-menu']"));
            userDropdown.click();
            WebElement logout = driver.findElement(By.xpath("//a[@href='/user/logout']"));
            logout.click();



        }
}