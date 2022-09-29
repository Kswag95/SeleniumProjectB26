package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.Utilities.BrowserUtils;
import com.cydeo.test.base.TestBase;
import org.testng.annotations.Test;

public class T1_MultipleWindows extends TestBase {


    @Test
    public void windowsHandleTest() {
//2. Goto:https://www.amazon.com/

        driver.get("https://www.amazon.com");

//3. Copypastethelinesfrombelowintoyourclass
//4. CreatealogictoswitchtothetabwhereEtsy.comisopen 5. Assert:Titlecontains“Etsy”
//Lines to be pasted:
//        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
//        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
//        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
//
//    Set<String> allWindowHandles = driver.getWindowHandles();
//
//    for (String eachWindow : allWindowHandles){
//        driver.switchTo().window(eachWindow);
//        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//
//    if (driver.getCurrentUrl().contains("etsy")){
//        break;
//    }
//         }
//    String actualTitle = driver.getTitle();
//    String expectedTitle = "Etsy";
//        Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification56 failed");

  //      BrowserUtils.switchWindowAndVerify(driver,"amazon","Amazon");
        BrowserUtils.verifyTitle(driver,"Etsy");


    }
        }






























