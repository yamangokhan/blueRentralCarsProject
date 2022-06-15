package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    }
    @Given("kullanici call center,make reservation,cancel reservation text'lerinin görünür oldugunu dogrular")
    public void kullanici_call_center_make_reservation_cancel_reservation_text_lerinin_görünür_oldugunu_dogrular() {

    }
    @Then("type your email text box tiklanabilir oldugunu test eder")
    public void type_your_email_text_box_tiklanabilir_oldugunu_test_eder() {

    }
    @Then("kullanici subscribe buttonunu görünür oldugunu ve tıklanabilirligini dogrular")
    public void kullanici_subscribe_buttonunu_görünür_oldugunu_ve_tıklanabilirligini_dogrular() {

    }
    @When("haritanin görünür oldugunu ve fonksiyonel oldugunu test eder")
    public void haritanin_görünür_oldugunu_ve_fonksiyonel_oldugunu_test_eder() {

    }
    @Then("kullanici name,phone,emailaddress,comments textbox'ların tiklanabilir oldugunu ve veri girildgini dogrular")
    public void kullanici_name_phone_emailaddress_comments_textbox_ların_tiklanabilir_oldugunu_ve_veri_girildgini_dogrular() {

    }
    @Then("kullanici Send buttonun görünür oldugunu ve tiklanabilir oldugunu test eder")
    public void kullanici_send_buttonun_görünür_oldugunu_ve_tiklanabilir_oldugunu_test_eder() {

    }
    @Then("kullanici gönderilen mailin dogrulugunu test eder")
    public void kullanici_gönderilen_mailin_dogrulugunu_test_eder() {

    }

}
