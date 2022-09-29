package com.cydeo.test.day2_Locating;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2LinkTextPractice {
    /*
    1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        WebDriver driver = new ChromeDriver();

        //go to practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Click A/B Testing from top of the list.
      WebElement ABtesting =driver.findElement(By.linkText("A/B Testing"));

      ABtesting.click();
      Thread.sleep(2000);


      //Verify expected title "No A/B Test"
      String actualtitle = driver.getTitle();
      String expectedTitle = "No A/B Test";

      if (expectedTitle.equals(actualtitle)){
          System.out.println("Correct Title");
      }else {
          System.out.println("Incorrect title");
      }

      driver.navigate().back();
Thread.sleep(2000);

expectedTitle="Practice";
actualtitle =driver.getTitle();
      if (actualtitle.equals(expectedTitle)){
          System.out.println("Good");
      }else {
          System.out.println("Bad");
      }
      driver.quit();

    }
}
