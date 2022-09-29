package com.cydeo.test.day3_css_getTest_getAttribute;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttibute {
    public static void main(String[] args) {

//    1- Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        // 3- Verify header text is as expected:
        //USING CSS SELECTOR
     //   WebElement otherheader = driver.findElement(By.cssSelector("div[class='page-header']>h2"));
        WebElement headerText = driver.findElement(By.tagName("h2"));

        // Expected: Registration form
        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();


        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Good header");
        } else {
            System.out.println("Bad header");
        }

        // 4- Locate “First name” input box


        //    5- Verify placeholder attribute’s value is as expected: Expected: first name
        WebElement firstNameInput = driver.findElement(By.className("form-control"));
        String expectedPlaceHolder = "first name";

        //getAttribute() method helps us get the value of attributes;
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("passed placeholder test");
        }else{
            System.out.println("failed placeholder test");
        }
        driver.quit();
    }
}
