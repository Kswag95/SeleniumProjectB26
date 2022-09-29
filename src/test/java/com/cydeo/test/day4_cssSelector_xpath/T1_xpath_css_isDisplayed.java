package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");
//
//        TC #1: XPATH and cssSelector Practices
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/forgot_password
//3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)


//a. “Home” link //Locating home link using cssSelector,Class value
        WebElement homeLink = driver.findElement(By.cssSelector("a[class = 'nav-link']"));
        //lOCATE HOME LINK USING HREF VALUE
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));
        //LOCATE HOME LINK USING  cssSelector SYNTAX 2 for class "."
        WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));


        //Locate homelink Using XPATH with text of element.
        WebElement homelink4 = driver.findElement(By.xpath("//a[.='Home']"));//xpath(text() = 'Home');



//b. “Forgot password” header c.
        //Locate forgotPassword using cssSelector from parent to child with ">"
        WebElement forgetPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));
        //Locate forgotPassword using cssSelector syntax2 from parent to child with "."
        WebElement forgetPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

        //Locate ForgotPassword using xpath
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


        //E-mail.text
        WebElement emailtext = driver.findElement(By.cssSelector("label[for = 'email']"));
        WebElement emailtext2 = driver.findElement(By.xpath("//label[@for='email']"));

//d. E-mail input box
        //Locating emailInputBox using cssSelector
        WebElement EmailInputBox = driver.findElement(By.cssSelector("input[type = 'text']"));
        WebElement EmailInputBox2 = driver.findElement(By.cssSelector("input.text"));

//e. “Retrieve password”

        //Locating by using cssSelector with ID
        WebElement retrievePassword = driver.findElement(By.cssSelector("button#form_submit"));
        //locate using class
        WebElement retrievePassword2 = driver.findElement(By.cssSelector("button.radius"));

        //button f. “Powered by Cydeo text
        WebElement poweredTxt = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

//4. Verify all web elements are displayed.
        System.out.println("homelink1 can see" + homeLink.isDisplayed());
        System.out.println("Forgot password is displayed- " + forgetPassword.isDisplayed());
        System.out.println("Email text displayed: " + emailtext.isDisplayed());
        System.out.println("Retrieve pw is displayed: " +retrievePassword.isDisplayed());
        System.out.println("Powered by cydeo is displayed: " + poweredTxt);

        //Syntax for xpath

    }
}
