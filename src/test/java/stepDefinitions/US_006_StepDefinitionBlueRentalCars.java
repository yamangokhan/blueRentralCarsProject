package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

    public class US_006_StepDefinitionBlueRentalCars {
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

        @Given("Kullanıcı anasayfada bulunan pickUpDate satirinin gorunur oldugunu test eder")
        public void kullanıcıAnasayfadaBulunanPickUpDateSatirininGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.pickUpDate.isDisplayed());
        }

        @Given("kullanici pickUpDate satirina tarih girer")
        public void kullaniciPickUpDateSatirinaTarihGirer() {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.pickUpDate).
                    sendKeys("10")
                    .sendKeys("12")
                    .sendKeys("2022")
                    .perform();

        }

        @Given("Kullanıcı anasayfada bulunan PickUpTime satirinin gorunur oldugunu test eder")
        public void kullanıcıAnasayfadaBulunanPickUpTimeSatirininGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.pickUpTime.isDisplayed());
        }

        @Given("kullanici PickUpTime satirina kayitli saat secer")
        public void kullaniciPickUpTimeSatirinaKayitliSaatSecer() {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.pickUpTime).
                    sendKeys("23")
                    .sendKeys("23")
                    .perform();

        }

        @Given("Kullanıcı anasayfada bulunan DropOffDate satirinin gorunur oldugunu test eder")
        public void kullanıcıAnasayfadaBulunanDropOffDateSatirininGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.dropOffDate.isDisplayed());
        }

        @Given("kullanici DropOffTime satirina tarih secer")
        public void kullaniciDropOffTimeSatirinaTarihSecer() {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.dropOffDate).
                    sendKeys("10")
                    .sendKeys("12")
                    .sendKeys("2023")
                    .perform();
        }

        @Given("Kullanıcı anasayfada bulunan DropOffTime satirinin gorunur oldugunu test eder")
        public void kullanıcıAnasayfadaBulunanDropOffTimeSatirininGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.pickUpTime.isDisplayed());
        }

        @Given("kullanici DropOffTime satirina  saat secer")
        public void kullaniciDropOffTimeSatirinaSaatSecer() {
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.dropOffTime).
                    sendKeys("23")
                    .sendKeys("23")
                    .perform();
        }

        @Given("Kullanıcı anasayfada bulunan Continue Reservation satirinin gorunur oldugunu test eder")
        public void kullanıcıAnasayfadaBulunanContinueReservationSatirininGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.continueReservation.isDisplayed());
        }

        @Given("kullanici Continue Reservation butonuna tiklar")
        public void kullaniciContinueReservationButonunaTiklar() {
            homePage.continueReservation.click();
        }

        @Given("pleaseFirstLogin gorunur oldugunu test eder")
        public void pleasefirstloginGorunurOldugunuTestEder() {
            Assert.assertTrue(homePage.pleaseFirstLogin.isEnabled());
        }
    }



