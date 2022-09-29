package com.cydeo.Practice;

import com.cydeo.pages.DressesPage;
import com.cydeo.test.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BtnPractice {
    // - Go to  "http://automationpractice.com/index.php"

    @Test
    public void goingIn() throws InterruptedException {
        Driver.getDriver().get("http://automationpractice.com/index.php");
        Actions actions = new Actions(Driver.getDriver());

        DressesPage dressesPage = new DressesPage();
        actions.moveToElement(dressesPage.dresses).perform();

        Thread.sleep(3000);
        Assert.assertTrue(dressesPage.dresses.isDisplayed());

        Assert.assertTrue(dressesPage.casualDresses.isDisplayed());

        Assert.assertTrue(dressesPage.summerDresses.isDisplayed());

        Assert.assertTrue(dressesPage.eveningDresses.isDisplayed());


        //       - Hover over on Dresses button
        actions.moveToElement(dressesPage.dresses);

        //       - Verify following subCategories are
        //       displayed
        Assert.assertTrue(dressesPage.casualDresses.isDisplayed());
        Assert.assertTrue(dressesPage.eveningDresses.isDisplayed());
        Assert.assertTrue(dressesPage.summerDresses.isDisplayed());

        //
        //                       Casual Dresses
        //                       Evening Dresses
        //                       Summer Dresses
    }
}