package com.cydeo.test.day13_configuration_reader;

import com.cydeo.test.Utilities.BrowserUtils;
import com.cydeo.test.Utilities.ConfigurationReader;
import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_config_practice extends TestBase {

    @Test
    public void login_Crm_app() {
        //2. Go to : http://login1.nextbasecrm.com/
//        driver.get("http://login1.nextbasecrm.com");
        driver.get(ConfigurationReader.getProperty("env"));
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        inputUsername.sendKeys("h1@cybertekschool.com");
        //4. Enter valid password
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"Portal");
        //Expected: Portal
    }
}