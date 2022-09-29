package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.Utilities.ConfigurationReader;
import com.cydeo.test.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void java_Faker_test() {


        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.name().name() = " + faker.name().name());
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.animal() = " + faker.animal());
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.address().countryCode() = " + faker.address().countryCode());
        System.out.println("faker.leagueOfLegends() = " + faker.leagueOfLegends());
        System.out.println("faker.letterify(\"????-???-??\") = " + faker.letterify("????-???-??"));
        System.out.println("faker.numerify(\"####-###-####\") = " + faker.numerify("####-###-####"));
        System.out.println("faker.bothify(\"(###) ###-####  + ???-???-????\" = " + faker.bothify("(410) ###-####  + ???-???-????"));


        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
      }
}