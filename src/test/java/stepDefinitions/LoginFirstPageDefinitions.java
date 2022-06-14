package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginFirstPageDefinitions {
HomePage homPage=new HomePage();

    @Given ("kullanici verilen email ve passwordla giris yapar")
    public void kullanici_verilen_email_ve_passwordla_giris_yapar() {
        homPage.loginButton.click();
        homPage.loginEmailBox.sendKeys(ConfigReader.getProperty("clientEmail"));
        homPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("clientPassword"));
        homPage.loginOnayButton.click();




    }

    @And("ismi yazili dropdown menusunu test eder")
    public void ismiYaziliDropdownMenusunuTestEder() {
        homPage.nameDropdownButton.click();

        Assert.assertTrue(homPage.reservationDropdownButton.isDisplayed());
    }
}
