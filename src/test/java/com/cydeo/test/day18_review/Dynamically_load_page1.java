package com.cydeo.test.day18_review;

import com.cydeo.pages.DynamicallyLoadedPage1;
import com.cydeo.test.Utilities.BrowserUtils;
import com.cydeo.test.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dynamically_load_page1 {


    @Test
    public void DynamicallyLoadPage() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");


        DynamicallyLoadedPage1 dynamicallyLoadedPage1 = new DynamicallyLoadedPage1();

        //2. Click to start

        dynamicallyLoadedPage1.startBtn.click();
        //3. Wait until loading bar disappears
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage1.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicallyLoadedPage1.loadingBar);
        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicallyLoadedPage1.userNameBox.isDisplayed());
        //5. Enter username: tomsmith
        dynamicallyLoadedPage1.userNameBox.sendKeys("tomsmith");
        //6. Enter password: incorrectpassword
        dynamicallyLoadedPage1.passwordBox.sendKeys("incorrectpassword");
        //7. Click to Submit button
        dynamicallyLoadedPage1.submitBtn.click();
        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicallyLoadedPage1.errorMsg.isDisplayed());
    }
}