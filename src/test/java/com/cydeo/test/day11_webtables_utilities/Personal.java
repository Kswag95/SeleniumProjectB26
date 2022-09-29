package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Personal extends TestBase {

    @Test
    public void testing(){
        driver.get("https://practice.cydeo.com/tables");

        //Find the table
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));

        //P2_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF TABLE 1
        WebElement rows= driver.findElement(By.xpath("//table[@id='table1']//tr"));
        //P3_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF BODY - TABLE 1
        WebElement table1BodyRows = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr"));

        //P4_ WRITE A LOCATOR THAT RETURNS ONLY 3RD ROW IN THE BODY
        WebElement table1Row3 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]"));
//P5_ WRITE A LOCATOR THAT RETURNS ALL OF THE CELLS IN ALL OF THE ROW (IN
//BODY)
        WebElement allCells = driver.findElement(By.xpath("//table[@id='table1']//tbody//td"));

// WRITE A LOCATOR THAT RETURNS ALL OF THE FIRST NAMES FROM TABLE
WebElement firstnames = driver.findElement(By.xpath("//table[@id='table1']//tbody//td[2]"));

//P7_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY
WebElement franksName = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[2]//td[2] "));

//P8_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY USE FRANKS TEXT
WebElement usingFranksName = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[2]//td[.='Frank']"));

//P9_ WRITE A LOCATOR THAT RETURNS $51 CELL SPECIFICALLY USE FRANKS TEXT
WebElement moneyFromFrank = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[2]//td[.='Frank']/following-sibling::td[2]"));

//WRITE A LOCATOR THAT RETURNS JASONS DUE AMOUNT BASED ON JASONS NAME
        WebElement jasonsDueAmount = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[.='Jason']/following-sibling::td[2]")); // remember that you can use /following-sibling or /preceding-sibling
//P11_ WRITE A LOCATOR THAT RETURNS Tim's last name  BASED ON tim's NAME
        WebElement TimsLastName = driver.findElement(By.xpath("//table[@id='table1']//tbody//td[.='Tim']/../td[1]"));

        //P12_ WRITE A LOCATOR THAT RETURNS ALL EMAILS THAT HAS $50 DUE DATE

    }


}
