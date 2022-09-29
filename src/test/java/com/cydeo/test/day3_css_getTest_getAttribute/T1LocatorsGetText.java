package com.cydeo.test.day3_css_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1LocatorsGetText {
    public static void main(String[] args) {
      //  C #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
   driver.get("https://login1.nextbasecrm.com");

     //   3- Enter incorrect username: “incorrect”
        WebElement loginbox = driver.findElement(By.name("USER_LOGIN"));
        loginbox.sendKeys("incorrect");

       // 4- Enter incorrect password: “incorrect”
        WebElement passbox = driver.findElement(By.name("USER_PASSWORD"));
passbox.sendKeys("incorrect");
        //5- Click to login button.
        WebElement loginClick = driver.findElement(By.className("login-btn"));
        loginClick.click();


        WebElement errormsg = driver.findElement(By.className("errortext"));
        String expectedtxt = "Incorrect login or password";
        String actualtext = errormsg.getText();
    if (actualtext.equals(expectedtxt)){
        System.out.println("Error msg verif passed");
        }else {
        System.out.println("Wrong msg bitch");
    }
        driver.quit();
     //   6- Verify error message text is as expected:
  //      Expected: Incorrect login or password
    }
}
