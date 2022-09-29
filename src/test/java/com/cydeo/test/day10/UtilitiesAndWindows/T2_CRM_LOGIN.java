package com.cydeo.test.day10.UtilitiesAndWindows;

import com.cydeo.test.Utilities.CRM_Utilities;
import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T2_CRM_LOGIN extends TestBase {
    @Test
    public void crm_login_test() {
        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='PASSWORD_LOGIN']"));
        inputPassword.sendKeys("UserUser");
    }
    @Test
    public void crm_login_text2(){
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);
    }
    @Test
    public void crm_login_text3(){
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");
    }
}
