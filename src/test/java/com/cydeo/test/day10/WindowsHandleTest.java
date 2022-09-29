package com.cydeo.test.day10;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandleTest extends TestBase {
    @Test
    public void windowHandleTest() {
        //2. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

        String mainwindow = driver.getWindowHandle();
        System.out.println("main window = " + mainwindow);        //    3. Assert: Title is “Windows”

        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle,expectedTitle,"incorrect title");
        //4. Click to: “Click Here” link

        WebElement clickHereLink = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereLink.click();
        //5. Switch to new Window.
        Set<String> allWindowHandles =driver.getWindowHandles();

        for(String each: allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        //6. Assert: Title is “New Window”
    }
}