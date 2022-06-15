package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_011_StepDefinitionContact {
HomePage pgs = new HomePage();
    @Given("kullanici {string} sitesine giderr")
    public void kullanici_sitesine_giderr(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));
    }

    @Given("kullanici contact butonunun görünür oldugunu ve tiklanabilir oldugunu test eder")
    public void kullanici_contact_butonunun_görünür_oldugunu_ve_tiklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(pgs.contact.isDisplayed());
        Assert.assertTrue(pgs.contact.isEnabled());
        pgs.contact.click();
    }

    @Given("kullanici call center,make reservation,cancel reservation text'lerinin görünür oldugunu dogrular")
    public void kullanici_call_center_make_reservation_cancel_reservation_text_lerinin_görünür_oldugunu_dogrular() {
        Assert.assertTrue(pgs.cellCenter.isDisplayed());
        Assert.assertTrue(pgs.cancelReservation.isDisplayed());
        Assert.assertTrue(pgs.makeReservation.isDisplayed());
    }

    @Then("type your email text box tiklanabilir oldugunu test eder")
    public void type_your_email_text_box_tiklanabilir_oldugunu_test_eder() {
    Assert.assertTrue(pgs.textBoxt.isEnabled());
    }

    @Then("kullanici subscribe buttonunu görünür oldugunu ve tıklanabilirligini dogrular")
    public void kullanici_subscribe_buttonunu_görünür_oldugunu_ve_tıklanabilirligini_dogrular() {
    Assert.assertTrue(pgs.subscribe.isDisplayed());
    Assert.assertTrue(pgs.subscribe.isEnabled());
    }

    @When("haritanin görünür oldugunu ve fonksiyonel oldugunu test eder")
    public void haritanin_görünür_oldugunu_ve_fonksiyonel_oldugunu_test_eder() {
        Assert.assertTrue(pgs.harita.isDisplayed());
    }

    @Then("kullanici name,phone,emailaddress,comments textbox'ların tiklanabilir oldugunu ve veri girildgini dogrular")
    public void kullanici_name_phone_emailaddress_comments_textbox_ların_tiklanabilir_oldugunu_ve_veri_girildgini_dogrular() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView();",pgs.name);
        Thread.sleep(3000);
        Actions actions =new Actions(Driver.getDriver());
        actions.click(pgs.name).sendKeys("ali")
                .sendKeys(Keys.TAB)
                .sendKeys("025959514")
                .sendKeys(Keys.TAB)
                .sendKeys("mail@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("hizmetinizden memnun kaldik")
                .perform();
    }

    @Then("kullanici Send buttonun görünür oldugunu ve tiklanabilir oldugunu test eder")
    public void kullanici_send_buttonun_görünür_oldugunu_ve_tiklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(pgs.send.isDisplayed());
        pgs.send.click();
    }

    @Then("kullanici gönderilen mailin dogrulugunu test eder")
    public void kullanici_gönderilen_mailin_dogrulugunu_test_eder() throws InterruptedException {
        Thread.sleep(7000);
    Assert.assertFalse(pgs.cellCenter.isDisplayed());
    }

}
