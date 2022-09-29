package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.pages.DynamicallyLoadedPage7;
import com.cydeo.test.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyLoadedTest {
    @Test
    public void dynamicallyLoaded(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        DynamicallyLoadedPage7 dynamicallyLoadedPage7 = new DynamicallyLoadedPage7();

        Assert.assertTrue(dynamicallyLoadedPage7.doneMsg.isDisplayed());

        Assert.assertTrue(dynamicallyLoadedPage7.image.isDisplayed());
    }
}
