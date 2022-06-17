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
    @FindBy(xpath = "//*[text()='Complete Reservation']") public WebElement completeReservation;
    @FindBy(xpath = "//b[contains(text(),'Name')]") public WebElement name;
    @FindBy(xpath = "//b[contains(text(),'Address')]") public WebElement address;
    @FindBy(xpath = " //b[contains(text(),'Phone')]") public WebElement phone;
    @FindBy(xpath = "//div[text()='Total price: $']") public WebElement totalPrice;
    @FindBy(xpath = "//input[@name='cardNo']") public WebElement cardNumber;
    @FindBy(xpath = "//input[@name='nameOnCard']") public WebElement nameOnCard;
    @FindBy(xpath = "//input[@name='expireDate']") public WebElement expireDate;
    @FindBy(xpath = "//input[@name='cvc']") public WebElement cvc;
    @FindBy(xpath = "//label[text()='I have read and aggree the sales contract']") public WebElement iHaveReadandAgree;
    @FindBy(xpath = "//button[text()='Close']") public WebElement close;
    @FindBy(xpath = "//button[text()=' Complete Reservation']") public WebElement completeReservationButton;
    @FindBy(xpath = "//a[text()='Reservations']") public WebElement reservations;
    @FindBy(xpath = "//button[text()=' Back to reservations']") public WebElement backToReservation;
    @FindBy(xpath = "(//button[@class='w-100 btn btn-primary btn-lg'])") public WebElement conReservButonu;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']" ) public WebElement Login;
    @FindBy(xpath = "//input[@id='formBasicPassword']") public WebElement passwordBox;
    @FindBy(xpath = "//select[@name='car']") public WebElement selectACar;
    @FindBy(xpath = "//input[@name='pickUpLocation']") public WebElement pickUpPlace;
    @FindBy(xpath = "//input[@name='dropOfLocation']") public WebElement dropOfPlace;
    @FindBy(xpath = "//input[@name='pickUpDate']") public WebElement pickUpggayyyy;
    @FindBy(xpath = "//input[@name='pickUpTime']") public WebElement pickUpsaat;
    @FindBy(xpath = "//input[@name='dropOffDate']") public WebElement dropOfggaayyyy;
    @FindBy(xpath = "//input[@name='dropOffTime']") public WebElement dropOfsaat;
    @FindBy(xpath = "//button[text()=' Login']") public WebElement loginButtonu;
    @FindBy(xpath ="//b[text()='Pick-Up Time']") public WebElement pickUpTimeButonu;
    @FindBy(xpath ="//b[text()='Drop-Off Time']") public WebElement dropOffTimeButonu ;
    @FindBy(xpath ="//b[text()='Pick-Up Location']") public WebElement pickUpLocation ;
    @FindBy(xpath ="//b[text()='Drop-Off Location']") public WebElement dropOffLocation ;
    @FindBy(xpath ="//button[text()='Reservation Details']") public WebElement reservationDetailsButon  ;
    @FindBy(xpath ="//button[@class='accordion-button']") public WebElement reservationDetailsAcik  ;
    @FindBy(xpath ="//button[@class='accordion-button collapsed']") public WebElement reservationDetailsKapali  ;
    @FindBy(xpath ="//button[text()='Car Details']") public WebElement carDetailsButonu ;
    @FindBy(xpath ="//button[text()='Car Details']") public WebElement carDetailsAcik ;
    @FindBy(xpath ="//button[text()='Car Details']") public WebElement carDetailsKapali ;
    @FindBy(xpath ="(//img[@class='img-fluid'])[2]") public WebElement aracResmi;
    @FindBy(xpath ="//*[@id=\"root\"]/nav/div/a/img") public WebElement logomuz;
    @FindBy(xpath ="//button[@class='w-100 btn btn-primary btn-lg']") public WebElement continueReservButonu;
    @FindBy(xpath ="//input[@class='form-check-input is-invalid']") public WebElement iHaveReadCheckBox;
    @FindBy(xpath = "//div[text()='Reservation created successfully']") public WebElement successReserv;
    @FindBy(xpath = "//button[@id='dropdown-basic-button']") public WebElement isimliButon;
    @FindBy(xpath = "//div[text()='Reservation created successfully'") public WebElement tumbody;
    @FindBy(xpath = "(//tbody)[1]") public WebElement resTablebody;
    @FindBy(xpath = "(//tbody)[2]") public WebElement carTablebody;
    @FindBy(xpath = "//td[text()='Maseratittt']") public WebElement istenenRezervasyon;
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
    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Contact']")
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
    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Contact']")
    public WebElement harita;
    @FindBy(xpath = "(//input[@placeholder='name@example.com'])[1]")
    public WebElement contactName;
    // US_006 Oguzhan-Fatih
    @FindBy(xpath = "//select[@name='car']")
    public WebElement select;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUp;
    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement DropOff;
    //
//
    //US_04 MUSTAFA-EMRE
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;
    @FindBy(xpath="//input[@id='formBasicEmail']")
    public WebElement loginEmailBox;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement loginPasswordBox;
    @FindBy(xpath = " //button[@class='btn btn-primary']")
    public WebElement loginOnayButton;
    @FindBy(xpath ="//button[@id='dropdown-basic-button']")
    public WebElement nameDropdownButton;
    @FindBy(xpath = "//a[text()='Reservations']")
    public WebElement reservationDropdownButton;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[1]")
    public WebElement youtubeIkonu;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[2]")
    public WebElement facebookIkonu;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[3]")
    public WebElement twitterIkonu;
    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[4]")
    public WebElement instagramIkonu;
    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeBaslik;
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement servicesBaslik;
    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    public WebElement aboutUsBaslik;
    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public WebElement contactBaslik;
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement blueRentalcarsLogo;
    @FindBy(xpath = "//div[@class='col-7']")
    public WebElement callUsBaslik;
    @FindBy(xpath = "//img[@src='/assets/img/cars/volvo-s90.png']")
    public WebElement degisenAracVolvo;
    @FindBy(xpath = "//span[@class='carousel-control-prev-icon']")
    public WebElement controlButtonuSol;
    @FindBy(xpath = "//span[@class='carousel-control-next-icon']")
    public WebElement controlButtonuSag;
    @FindBy(xpath = "(//img[@class='d-block w-100'])[1]")
    public WebElement degisenAracAudi;

    //Huseyin
    @FindBy(xpath="//h2[text()='What do we offer?']")
    public WebElement whatDoWeOffer;
    @FindBy(xpath = "//div[@class=\"mt-2 row\"]")
    public WebElement ourPartners;

    //Zeynep US_003_yeni_kullanici
    @FindBy(xpath = "//a[normalize-space()='Login']")
    public WebElement LoginAnasayfa;
    @FindBy(xpath = "//a[contains(text(),'Create new user')]")
    public WebElement CreatNewUser;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement LoginButton;
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    public WebElement RegisterText;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement FirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement LastName;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement PhoneNumber;
    @FindBy(xpath = "//input[@name='address']")
    public WebElement AdresBox;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement ZipCode;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement PasswordConfirm;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement RegisterButton;
    @FindBy(xpath = "//div[contains(text(),'Please enter your first name')]")
    public WebElement Alertfirstname;
    @FindBy(xpath = " //div[contains(text(),'Please enter your last name')]")
    public WebElement AlertLastname;
    @FindBy(xpath = "//div[contains(text(),'Please enter your phone number')]")
    public WebElement AlertPhone;
    @FindBy(xpath = "//div[contains(text(),'Please enter your address')]")
    public WebElement AlertAdres;
    @FindBy(xpath = "//div[contains(text(),'Please enter your zip code')]")
    public WebElement AlertZipcode;
    @FindBy(xpath = "//div[contains(text(),'Please enter your email')]")
    public WebElement AlertMail;
    @FindBy(xpath = "//div[normalize-space()='Please enter your password']")
    public WebElement AlertPossword;
    @FindBy(xpath = "//div[normalize-space()='Please enter your password again']")
    public WebElement AlaertConfirmPassword;
    @FindBy(xpath = "//div[contains(text(),'You are registered successfully.')]")
    public  WebElement successfully;
    //seçkin
    @FindBy(xpath ="//div[@class='section-title']" )
    public WebElement customerServices;

    @FindBy(xpath ="//div[@class='col-lg-10']" )
    public WebElement flexRenting;

    @FindBy(xpath ="(//div[@class='col-lg-10'])[2]" )
    public WebElement noExtraPrice;

    @FindBy(xpath ="(//div[@class='col-lg-10'])[3]" )
    public WebElement priceEqualization;

    @FindBy(xpath ="(//div[@class='col-lg-10'])[4]" )
    public WebElement hygienicCars;

    @FindBy(xpath ="(//div[@class='col-lg-6'])[1]" )
    public WebElement newsletterSubscription;

    @FindBy(xpath ="//input[@type='email']" )
    public WebElement mailBox;

    @FindBy(xpath ="(//button[@type='button'])[2]" )
    public WebElement suscribeButonu;

    //Emrah

    @FindBy (xpath = "//*[@id=\"root\"]/div[8]/div[2]/div[1]/ul")
    public WebElement araclar;

    @FindBy (xpath = "//*[@id=\"root\"]/div[8]/div[1]/h2")
    public WebElement vehiclesYazisi;

    @FindBy (xpath = "//*[@id=\"root\"]/div[8]/div[2]/div[3]/table/tbody/tr[1]/td[2]")
    public WebElement secilenAracModel;

    @FindBy (xpath = "//*[@id=\"root\"]/div[8]/div[2]/div[2]/img")
    public WebElement aracResim;

}