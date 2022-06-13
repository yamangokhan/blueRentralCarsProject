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

//US-11 by yavuz-cemil


    @FindBy(xpath = "((//a[@class='nav-link'])[4]")
    public WebElement contact;

    @FindBy(xpath = "(//div[@class='card-title h5'])[1]")
    public WebElement cellCenter;

    @FindBy(xpath = "(//div[@class='card-title h5'])[2]")
    public WebElement makeReservation;

    @FindBy(xpath = "(//div[@class='card-title h5'])[3]")
    public WebElement cancelReservation;

    @FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[1]")
    public WebElement subscribe;

    @FindBy(xpath = "(//input[@class=\"form-control\"])[1]")
    public WebElement textBoxt;

    @FindBy(xpath = "(//input[@class=\"form-control\"])[2]")
    public WebElement name;

    @FindBy(xpath = "(//input[@class=\"form-control\"])[3]")
    public WebElement phone;

    @FindBy(xpath = "(//input[@class=\"form-control\"])[4]")
    public WebElement eMail;

    @FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[2]")
    public WebElement send;

    @FindBy(xpath = "//textarea[@class=\"form-control\"]")
    public WebElement comments;

    @FindBy(xpath = "//a[@class=\"google-maps-link\"]")
    public WebElement harita;



}


