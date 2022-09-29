package com.cydeo.pages;

import com.cydeo.test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FakeMailPage {

    public FakeMailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (xpath = "//span[@id='email']")
    public WebElement email;

    @FindBy (xpath = "//input[@type='text']")
  public  WebElement fullnamebox;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailbox;

    @FindBy (xpath = "//button[@class='radius']")
    public WebElement submitBtn;

    @FindBy (xpath = "//h3")
    public WebElement mainMsg;

    @FindBy (xpath = "//button[@id='details-button']")
    public WebElement advancedBtn;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedBtn;

    @FindBy (xpath = "(//span[@class='odMobil'])[1]")
    public String DaursProblem;

}
