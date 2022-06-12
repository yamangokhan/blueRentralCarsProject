package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//nav[@class=menubar navbar navbar-expand-md navbar-light")
    public static WebElement logoButonu;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public static WebElement loginButonu;

    @FindBy(id= "formBasicEmail")
    public static WebElement emailKutusu;

    @FindBy(xpath = "//input[@class='form-control is-invalid']")
    public static WebElement passwordKutusu;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu2;
}
