package com.cydeo.test.day6_StaleElement_TestNG.SelfReview;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reviewing {
    public static void main(String[] args) throws InterruptedException {


//    1. Go to https://www.etsy.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");
//2. Search for “wooden spoon”
        WebElement searchBar = driver.findElement(By.id("global-enhancements-search-query"));
        searchBar.sendKeys("wood spoon " + Keys.ENTER);

//3. Click on filters
WebElement filters = driver.findElement(By.xpath("//span[@class='wt-hide-xs wt-show-md filter-expander']"));
        filters.click();

//4. Select free shipping, on sale
        WebElement freeShippingBtn = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        System.out.println(freeShippingBtn.isDisplayed());
        freeShippingBtn.click();

        WebElement onSaleBtn = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
onSaleBtn.click();
//5. Select under $25 Click on apply filters
        WebElement under25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        under25.click();
WebElement apply = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']"));
apply.click();

        Thread.sleep(2000);
//6. Print count of results
WebElement results = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']"));



        System.out.println("results.getText() = " + results.getText());


    }


}
