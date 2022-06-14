package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

    public class BlueRentalCarsStepdefinitions {
        HomePage homePage = new HomePage();


        @Given("kullanici {string} sitesine gider")
        public void kullanici_sitesine_gider(String string) {
            Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));
        }

        @Given("Kullanıcı anasayfada bulunan Select a car menusunun gorunur oldugunu test eder")
        public void kullanıcı_anasayfada_bulunan_select_a_car_menusunun_gorunur_oldugunu_test_eder() {
            Assert.assertTrue(homePage.select.isDisplayed());
        }

        @Given("kullanici select a car butonuna basar")
        public void kullanici_select_a_car_butonuna_basar() {
            homePage.select.click();
        }

        @Given("kullanici select a car menusunden araba secer")
        public void kullanici_select_a_car_menusunden_araba_secer() {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.select).
                    sendKeys("Ford Kuga").perform();

        }

        @Given("Kullanıcı anasayfada bulunan pick up satirinin gorunur oldugunu test eder")
        public void kullanıcıAnasayfadaBulunanPickUpSatirininGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.pickUp.isDisplayed());
        }

        @Given("kullanici pick up satirina kayitli yer secer")
        public void kullaniciPickUpSatirinaKayitliYerSecer() {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.pickUp).
                    sendKeys("New York").perform();
        }

        @Given("Kullanıcı anasayfada bulunan Drop Off satirinin gorunur oldugunu test eder")
        public void kullanıcıAnasayfadaBulunanDropOffSatirininGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.DropOff.isDisplayed());
        }

        @Given("kullanici Drop Off satirina kayitli yer secer")
        public void kullaniciDropOffSatirinaKayitliYerSecer() {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.DropOff).
                    sendKeys("Alaska").perform();
        }
    }

