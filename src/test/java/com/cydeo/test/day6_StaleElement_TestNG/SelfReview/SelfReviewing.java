package com.cydeo.test.day6_StaleElement_TestNG.SelfReview;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelfReviewing {
    public static void main(String[] args) {

//        1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

//3. Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

//4. Refresh the page.
        driver.navigate().refresh();

        try {


            System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
//5. Verify it is displayed, again.

        } catch (Exception e) {
            System.out.println("Got a problem");
        }
    }
}
