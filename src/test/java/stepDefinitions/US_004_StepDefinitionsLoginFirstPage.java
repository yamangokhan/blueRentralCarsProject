package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;
import utilities.ConfigReader;

public class US_004_StepDefinitionsLoginFirstPage {


        HomePage homPage=new HomePage();

        @Given("kullanici verilen email ve passwordla giris yapar")
        public void kullanici_verilen_email_ve_passwordla_giris_yapar() {
            homPage.loginButton.click();
            homPage.loginEmailBox.sendKeys(ConfigReader.getProperty("clientEmail"));
            homPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("clientPassword"));
            homPage.loginOnayButton.click();}



        @And("ismi yazili dropdown menusunu test eder")
        public void ismiYaziliDropdownMenusunuTestEder() {
            homPage.nameDropdownButton.click();

            Assert.assertTrue(homPage.reservationDropdownButton.isDisplayed());
        }

    @And("sosyal medya ikonlarinin görunurlugunu test eder")
    public void sosyalMedyaIkonlarininGörunurlugunuTestEder() {

            Assert.assertTrue(homPage.youtubeIkonu.isDisplayed());
            Assert.assertTrue(homPage.facebookIkonu.isDisplayed());
            Assert.assertTrue(homPage.instagramIkonu.isDisplayed());
            Assert.assertTrue(homPage.twitterIkonu.isDisplayed());
    }

    @And("home,services,About Us ve Contact  calisitigini test eder")
    public void homeServicesAboutUsVeContactCalisitiginiTestEder() {

            Assert.assertTrue(homPage.contactBaslik.isDisplayed());
            Assert.assertTrue(homPage.servicesBaslik.isDisplayed());
            Assert.assertTrue(homPage.aboutUsBaslik.isDisplayed());
            Assert.assertTrue(homPage.homeBaslik.isDisplayed());

        Assert.assertTrue(homPage.contactBaslik.isEnabled());
        Assert.assertTrue(homPage.servicesBaslik.isEnabled());
        Assert.assertTrue(homPage.aboutUsBaslik.isEnabled());
        Assert.assertTrue(homPage.homeBaslik.isEnabled());
    }

    @And("Bluerentalcars logosunun gorunur oldugunu test eder")
    public void bluerentalcarsLogosununGorunurOldugunuTestEder() {
            Assert.assertTrue(homPage.blueRentalcarsLogo.isDisplayed());
    }

    @Given("Call Us textin gorunur oldugubu test eder")
    public void call_us_textin_gorunur_oldugubu_test_eder() {
            Assert.assertTrue(homPage.callUsBaslik.isDisplayed());
    }

    @And("Degisen araclar gorselinin calisip calismadigini test eder")
    public void degisenAraclarGorselininCalisipCalismadiginiTestEder() {

        Assert.assertTrue(homPage.degisenAracAudi.isDisplayed());
        homPage.controlButtonuSol.click();
        Assert.assertTrue(homPage.degisenAracVolvo.isDisplayed());
        Assert.assertTrue(homPage.controlButtonuSag.isEnabled());

    }






}
