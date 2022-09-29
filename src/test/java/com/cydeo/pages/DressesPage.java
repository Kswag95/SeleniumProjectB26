package com.cydeo.pages;

import com.cydeo.test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {


    public DressesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[.='Dresses'])[2]")
   public WebElement dresses;

    @FindBy (xpath = "(//a[.='Casual Dresses'])[2]")
    public WebElement casualDresses;

    @FindBy (xpath = "(//a[.='Evening Dresses'])[2]")
    public  WebElement eveningDresses;

    @FindBy (xpath = "(//a[.='Summer Dresses'])[2]")
    public WebElement summerDresses;
}
