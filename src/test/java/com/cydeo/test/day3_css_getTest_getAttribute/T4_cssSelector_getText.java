package com.cydeo.test.day3_css_getTest_getAttribute;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes 3- Verify “Reset password” button text is as expected:
Expected: Reset password
T4_cssSelector_getText
 */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement ActualResetPw = driver.findElement(By.cssSelector("div[class=\"log-popup-footer\"]"));


    }
}
