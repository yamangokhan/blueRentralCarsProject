package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //US_008 Sule Jasmina  //
    @FindBy(xpath = "//*[text()='Complete Reservation']")
    public WebElement completeReservation;

    @FindBy(xpath = " //b[contains(text(),'Name')]")
    public WebElement name;

    @FindBy(xpath = "//b[contains(text(),'Address')]")
    public WebElement address;

    @FindBy(xpath = " //b[contains(text(),'Phone')]")
    public WebElement phone;

    @FindBy(xpath = "//div[text()='Total price: $']")
    public WebElement totalPrice;

    @FindBy(xpath = "//label[text()='Card number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//label[text()='Name on Card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//label[text()='Expire Date']")
    public WebElement expireDate;

    @FindBy(xpath = "//label[text()='CVC']")
    public WebElement cvc;

    @FindBy(xpath = "//label[text()='I have read and aggree the sales contract']")
    public WebElement iHaveReadandAgree;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement close;

    @FindBy(xpath = "//button[text()=' Complete Reservation']")
    public WebElement completeReservationButton;

    @FindBy(xpath = "//span[text()='CALL US']")
    public WebElement callUS;

    @FindBy(xpath = "//a[text()='Reservations']")
    public WebElement reservations;

    @FindBy(xpath = "//tbody/tr[2]/td[2]")//click yapilip diger sayfaya gec
    public WebElement webTableElement;

    @FindBy(xpath = "//button[text()='Reservation Details']")
    public WebElement reservationDetails;

    @FindBy(xpath = "//button[text()='Car Details']")
    public WebElement carDetails;

    @FindBy(xpath = "//button[text()=' Back to reservations']")
    public WebElement backToReservation;


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

//US_011 by yavuz-cemil


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

    @FindBy(xpath = "(//input[@class=\"form-control\"])[4]")
    public WebElement eMail;

    @FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[2]")
    public WebElement send;

    @FindBy(xpath = "//textarea[@class=\"form-control\"]")
    public WebElement comments;

    @FindBy(xpath = "//a[@class=\"google-maps-link\"]")
    public WebElement harita;

// US_006 Oguzhan-Fatih

    @FindBy(xpath = "//select[@name='car']")
    public WebElement select;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUp;
    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement DropOff;

    //silme


}






