package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US_005 by Sevilay --

    @FindBy(xpath = "//select[@name='car']")
    public WebElement dropDown;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUpDropDown;
    @FindBy(xpath = "//input[@title='Drop Off']")
    public WebElement pickUpDropOff;
    @FindBy(xpath = "//input[@name='pickUpDate']")
    public WebElement pickUpDate;
    @FindBy(xpath = "//input[@name='pickUpTime']")
    public WebElement pickUpTime;
    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;
    @FindBy(xpath = "//input[@name='dropOffTime']")
    public WebElement dropOffTime;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueReservation;
    @FindBy(xpath = "//*[text()='Please first login']")
    public WebElement pleaseFirstLogin;




    // merhaba




}


