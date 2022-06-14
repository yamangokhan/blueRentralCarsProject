package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
                //Sule Jasmina  //
    @FindBy(xpath ="//*[text()='Complete Reservation']")
    public WebElement completeReservation;

    @FindBy(xpath =" //b[contains(text(),'Name')]")
    public WebElement name;

    @FindBy(xpath ="//b[contains(text(),'Address')]")
    public WebElement address;

    @FindBy(xpath =" //b[contains(text(),'Phone')]")
    public WebElement phone;

    @FindBy(xpath ="//b[text()='Pick-Up Time']")
    public WebElement pickUpTime;

    @FindBy(xpath ="//b[text()='Drop-Off Time']")
    public WebElement dropOffTime ;

    @FindBy(xpath ="//div[text()='Total price: $']")
    public WebElement totalPrice;

    @FindBy(xpath ="//label[text()='Card number']")
    public WebElement  cardNumber;

    @FindBy(xpath ="//label[text()='Name on Card']")
    public WebElement nameOnCard  ;

    @FindBy(xpath ="//label[text()='Expire Date']")
    public WebElement expireDate ;

    @FindBy(xpath ="//label[text()='CVC']")
    public WebElement cvc;

    @FindBy(xpath ="//label[text()='I have read and aggree the sales contract']")
    public WebElement iHaveReadandAgree ;

    @FindBy(xpath ="//button[text()='Close']")
    public WebElement close ;

    @FindBy(xpath ="//button[text()=' Complete Reservation']")
    public WebElement completeReservationButton ;

    @FindBy(xpath ="//span[text()='CALL US']")
    public WebElement callUS ;

    @FindBy(xpath ="//a[text()='Reservations']")
    public WebElement  reservations;

    @FindBy(xpath ="//tbody/tr[2]/td[2]")//click yapilip diger sayfaya gec
    public WebElement webTableElement ;

    @FindBy(xpath ="//button[text()='Reservation Details']")
    public WebElement reservationDetails  ;

    @FindBy(xpath ="//button[text()='Car Details']")
    public WebElement carDetails ;

    @FindBy(xpath ="//button[text()=' Back to reservations']")
    public WebElement backToReservation ;


}
