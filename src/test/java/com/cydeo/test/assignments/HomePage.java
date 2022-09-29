package com.cydeo.test.assignments;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends TestBase {


    //Front page WebElements
    WebElement shortcuts = driver.findElement(By.xpath("//a[@title='Shortcuts']"));
    WebElement shortcutAction = driver.findElement(By.xpath("//input[@type='text']"));
    WebElement mostUsedAction = driver.findElement(By.xpath("(//li[@class='current'])[2]"));
    WebElement learnHowToUse = driver.findElement(By.xpath("//a[@href='/pinbar/help']"));
    WebElement faQuestionCircle = driver.findElement(By.xpath("//i[@class='fa-question-circle']"));
    WebElement faBars = driver.findElement(By.xpath("//i[@class='fa-bars']"));
    WebElement recentMailIcon = driver.findElement(By.xpath("//i[@class='mail-icon']"));
    WebElement userOptionsDropdown = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
    WebElement myUser = driver.findElement(By.xpath("//a[@href='/user/profile/view']"));
    WebElement myConfiguration = driver.findElement(By.xpath("(//a[@href='/config/user/profile'])[1]"));
    WebElement myCalendar = driver.findElement(By.xpath("//a[@href='/calendar/default']"));
    WebElement logout = driver.findElement(By.xpath("//a[@href='/user/logout']"));


    //Fleet Module
    WebElement fleetModule = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
    WebElement vehicles = driver.findElement(By.xpath("//span[.='Vehicles']"));
    WebElement vehicleOdometer = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
    WebElement vehicleCosts = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
    WebElement vehicleContracts = driver.findElement(By.xpath("//span[.='Vehicle Contracts']"));
    WebElement vehiclesFuelLog = driver.findElement(By.xpath("//span[.='Vehicles Fuel Logs']"));
    WebElement vehicleServicesLog = driver.findElement(By.xpath("//span[.='Vehicles Services Logs']"));
    WebElement vehiclesModels = driver.findElement(By.xpath("//span[.='Vehicles Model']"));

    //Customers Module
    WebElement customersModule = driver.findElement(By.xpath("(//i[@class= 'fa-users menu-icon'])[1]"));
    WebElement accounts = driver.findElement(By.xpath("//span[.='Accounts']"));
    WebElement contacts = driver.findElement(By.xpath("//span[.='Contacts']"));

    //Activites Module
    WebElement activitiesModule = driver.findElement(By.xpath("(//span[@class= 'title title-level-1'])[3]"));
    WebElement calendarEvents = driver.findElement(By.xpath("//span[.= 'Calendar Events']"));

    //System Module
    WebElement systemModule = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[4]"));
    WebElement userManagement = driver.findElement(By.xpath("//span[.='User Management']"));
    WebElement jobs = driver.findElement(By.xpath("//span[.='Jobs']"));
    WebElement systemCalendars = driver.findElement(By.xpath("//span[.='System Calendars']"));

    //Quick Launchpad Header
    WebElement quickLaunchpad = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));

    //Accounts area
    WebElement accountsList = driver.findElement(By.xpath("(//a[.='List'])[1]"));

    //Contacts area
    WebElement contactList = driver.findElement(By.xpath("(//a[.='List'])[2]"));
    WebElement createContact = driver.findElement(By.xpath("//a[.='Create Contact']"));


}
