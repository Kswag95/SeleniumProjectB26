package com.cydeo.test.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    public static void crm_login(WebDriver driver) {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("hr14@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }

    public static void crm_login(WebDriver driver,String username, String password) {
        WebElement  Inputusername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        Inputusername.sendKeys(username);

        WebElement Inputpassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        Inputpassword.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }
}