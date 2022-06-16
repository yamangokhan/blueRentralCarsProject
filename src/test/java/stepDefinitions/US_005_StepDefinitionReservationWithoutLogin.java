package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005_StepDefinitionReservationWithoutLogin {
    HomePage homePage = new HomePage();


    @Given("kullanici BlueRentaCarURL sitesine gider")
    public void kullanici_blue_renta_car_url_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));
    }
    @Given("kullanici dropdown butonundan araç seçer")
    public void kullanici_dropdown_butonundan_araç_seçer() {
        Select select=new Select(homePage.select);
        select.selectByIndex(5);

    }
    @Given("kullanici Pick up satırından kayıtlı yer seçer")
    public void kullanici_pick_up_satırından_kayıtlı_yer_seçer() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.pickUp).sendKeys("istanbul").perform();

    }
    @Then("kullanici Drop Off satırından kayıtlı yer seçer")
    public void kullanici_drop_off_satırından_kayıtlı_yer_seçer() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.DropOff).sendKeys("istanbul").perform();

    }
    @Then("kullanici Pick up tarih bölümüne takvimden tarih seçer")
    public void kullanici_pick_up_tarih_bölümüne_takvimden_tarih_seçer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.pickUpDate).sendKeys("20.06.2022").perform();


    }
    @Then("kullanici Pick up saat bölümüne takvimden saat seçer")
    public void kullanici_pick_up_saat_bölümüne_takvimden_saat_seçer() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.pickUpTime).sendKeys("14:00").perform();

    }
    @Then("kullanici Drop Off tarih bölümüne takvimden tarih seçer")
    public void kullanici_drop_off_tarih_bölümüne_takvimden_tarih_seçer() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.dropOffDate).sendKeys("22.06.2022").perform();

    }
    @Then("kullanici Drop Off saat bölümüne takvimden saat seçer")
    public void kullanici_drop_off_saat_bölümüne_takvimden_saat_seçer() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.dropOffTime).sendKeys("20:00").perform();

    }
    @Then("kullanici Contınue Reservation Butonuna tıklar")
    public void kullanici_contınue_reservation_butonuna_tıklar() {
        homePage.continueReservation.click();
    }
    @Then("Kullanıcı başarız işlem sonrası {string} uyarı mesajını görür")
    public void kullanıcı_başarız_işlem_sonrası_uyarı_mesajını_görür(String string) {

        Assert.assertTrue(homePage.pleaseFirstLogin.isDisplayed());

    }}
