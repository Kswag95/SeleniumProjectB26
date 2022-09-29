package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefException {
    public static void main(String[] args) {

        //making a chrome driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //opening this website
        driver.get("https://practice.cydeo.com/add_remove_elements/");


        //find element by xpath
        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));

        //clicking on the add button
        addElementBtn.click();

        //finding delete button
        WebElement deleteBTN = driver.findElement(By.xpath("//button[@class ='added-manually']"));

        //verify delete button is displayed
        System.out.println("deleteBTN.isDisplayed() = " + deleteBTN.isDisplayed());

        //click delete.
        deleteBTN.click();

        //
        try {
            System.out.println("deleteBTN.isDisplayed() = " + deleteBTN.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("Stale element reference exception is thrown");
            System.out.println("This means the web element is deleted from the page and html");
        }
    }
}