package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_ActionsPractices {

    CydeoPracticePage cydeoPracticePage;
    Actions actions;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        cydeoPracticePage = new CydeoPracticePage();
            actions = new Actions(Driver.getDriver());
    }
    @Test
    public void drag_small_circle_text(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drag the small circle here.");
    }

    @Test
    public void drop_here_text(){
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();
actions.moveToElement(cydeoPracticePage.smallCircle).clickAndHold().pause(2000).moveByOffset(100,0).pause(2000).perform();

Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drop here.");
    }
}
