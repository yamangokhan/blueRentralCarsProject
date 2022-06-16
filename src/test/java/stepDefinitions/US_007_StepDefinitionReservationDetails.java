package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US_007_StepDefinitionReservationDetails {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());

    @When("kullanici blurentalcars sayfasinda login olup basarili reservasyon islemini gerceklestirir")
    public void kullaniciBlurentalcarsSayfasindaLoginOlupBasariliReservasyonIsleminiGerceklestirir() {
        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));
        homePage.Login.click();
        homePage.mailBox.sendKeys("customer@bluerentalcars.com");
        homePage.passwordBox.sendKeys("12345");
        homePage.loginButtonu.sendKeys(Keys.ENTER);
        waitFor(2);
        Select select=new Select(homePage.selectACar);
        select.selectByVisibleText("Maseratittt");
        homePage.pickUpPlace.sendKeys("London");
        waitFor(1);
        homePage.dropOfPlace.sendKeys("London");
        waitFor(1);
        homePage.pickUpggayyyy.sendKeys("10102022");
        waitFor(1);
        homePage.pickUpsaat.sendKeys("1000");
        waitFor(1);
        homePage.dropOfggaayyyy.sendKeys("10102022");
        waitFor(1);
        homePage.dropOfsaat.sendKeys("1100");
        waitFor(1);
        homePage.continueReservButonu.click();
        waitFor(5);
    }

    @Given("acilan sayfada {string} yazisi oldugunu test eder")
    public void acilanSayfadaYazisiOldugunuTestEder(String completeReservation) {
        String actualBaslik=homePage.completeReservation.getText();
        Assert.assertTrue(actualBaslik.contains(completeReservation));}

    @Then("secilen arac resminin gorunur oldugunu dogrular")
    public void secilenAracResmininGorunurOldugunuDogrular() {
        Assert.assertTrue(homePage.aracResmi.isDisplayed());
    }

    @And("kullanici Customer basligi altinda Name, Adress, Phone alt basliklarini dogrular")
    public void kullaniciCustomerBasligiAltindaNameAdressPhoneAltBasliklariniDogrular() {
        Assert.assertTrue(homePage.name.isDisplayed());
        Assert.assertTrue(homePage.address.isDisplayed());
        Assert.assertTrue(homePage.phone.isDisplayed());
    }

    @And("kullanici Location & Date basligi altinda ,Pick-Up Time, Drop-Off Time, Pick-Up Location,Drop-Off Location basliklarindaki bilgileri dogrular")
    public void kullaniciLocationDateBasligiAltindaPickUpTimeDropOffTimePickUpLocationDropOffLocationBasliklarindakiBilgileriDogrular() {
        Assert.assertTrue(homePage.pickUpTimeButonu.isDisplayed());
        Assert.assertTrue(homePage.dropOffTimeButonu.isDisplayed());
        Assert.assertTrue(homePage.pickUpLocation.isDisplayed());
        Assert.assertTrue(homePage.dropOffLocation.isDisplayed());
    }

    @And("kullanici Payment basligi  altinda Total price basliginin gorunur oldugunu dogrular")
    public void kullaniciPaymentBasligiAltindaTotalPriceBasligininGorunurOldugunuDogrular() {
        Assert.assertTrue(homePage.totalPrice.isDisplayed());
    }

    @And("kullanici Close butonun fonksiyonel oldugunu  ve butona bastiginda bir onceki sayfaya geri geldigini test eder")
    public void kullaniciCloseButonunFonksiyonelOldugunuVeButonaBastigindaBirOncekiSayfayaGeriGeldiginiTestEder() {
        waitFor(2);
        Assert.assertTrue(homePage.close.isEnabled());
        homePage.close.click();
        Assert.assertTrue(homePage.logomuz.isDisplayed());
        waitFor(3);
        homePage.conReservButonu.click();
        waitFor(3);
    }

    @And("Card number texbox ile  Name on Card textbox, Expire Date, CVC fonksiyonel oldugunu test eder ve doldurur")
    public void cardNumberTexboxIleNameOnCardTextboxExpireDateCVCFonksiyonelOldugunuTestEderVeDoldurur() {
        Assert.assertTrue(homePage.cardNumber.isEnabled());
        Assert.assertTrue(homePage.nameOnCard.isEnabled());
        Assert.assertTrue(homePage.expireDate.isEnabled());
        Assert.assertTrue(homePage.cvc.isEnabled());
        waitFor(5);
        actions.click(homePage.cardNumber)
                .sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys("0123456789123456").perform();
        waitFor(2);
        actions.click(homePage.nameOnCard).sendKeys(ConfigReader.getProperty("nameOnCard"))
                .sendKeys(Keys.TAB).sendKeys("0527")
                .sendKeys(Keys.TAB).sendKeys("222").perform();
        waitFor(2);
    }

    @And("kullanici {string} yazisini gorebilir ve checkbox tiklar")
    public void kullaniciYazisiniGorebilirVeCheckboxTiklar(String okudumKabulEttim) {
        String actualYazi=homePage.iHaveReadandAgree.getText();
        Assert.assertTrue(actualYazi.contains(okudumKabulEttim));
        homePage.iHaveReadCheckBox.click();
    }

    @And("kullanici Complete Reservation butonunun fonksiyonel oldugunu ve tikladiktan sonra reservasyonun gerceklestigini test eder")
    public void kullaniciCompleteReservationButonunaTikladiktanSonraIsleminBasariylaGerceklestiginiTestEder() {
        Assert.assertTrue(homePage.completeReservation.isEnabled());
        waitFor(3);
        homePage.completeReservationButton.click();
        waitFor(2);
        Assert.assertTrue(homePage.successReserv.isDisplayed());
    }

    @And("kullanici basarili reservasyon islemi sonrasi ismi altinda bulunan dropdown menu Reservations butonu ile yapilan reservasyoni gorebilir")
    public void kullaniciBasariliReservasyonIslemiSonrasiIsmiAltindaBulunanDropdownMenuReservationsButonuIleYapilanReservasyoniGorebilir() {
        waitFor(7);
        homePage.isimliButon.click();
        homePage.reservations.click();
        waitFor(5);
        //WEBTABLE
        System.out.println(homePage.tumbody.getText());
        String webTableData=homePage.tumbody.getText();
        Assert.assertTrue(webTableData.contains(ConfigReader.getProperty("secilenAraba")));
        waitFor(2);
    }

    @And("kullanici reservasyonuna tikladiginda Reservation Details acilir kapanir butonunun gorebilir ve tiklanabilir oldugunu test eder")
    public void kullaniciReservasyonunaTikladigindaReservationDetailsAcilirKapanirButonununGorebilirVeTiklanabilirOldugunuTestEder() {
        homePage.istenenRezervasyon.click();
        Assert.assertTrue(homePage.reservationDetailsButon.isDisplayed());
        Assert.assertTrue(homePage.reservationDetailsAcik.isDisplayed());
        homePage.reservationDetailsAcik.click();
        waitFor(2);
        Assert.assertTrue(homePage.reservationDetailsKapali.isDisplayed());
        homePage.carDetailsKapali.click();
        waitFor(2);
    }

    @And("kullanici reservasyon islemine ait bilgileri Reservation Details basligi altinda dogrular")
    public void kullaniciReservasyonIslemineAitBilgileriReservationDetailsBasligiAltindaDogrular() {
        Assert.assertTrue(homePage.resTablebody.getText().contains(ConfigReader.getProperty("selectedLocaation")));
    }

    @And("kullanici Car Details acilir kapanir butonunun gorulebilir ve tiklanabilir oldugunu test eder")
    public void kullaniciCarDetailsAcilirKapanirButonununGorulebilirVeTiklanabilirOldugunuTestEder() {
        Assert.assertTrue(homePage.carDetailsButonu.isDisplayed());
        Assert.assertTrue(homePage.carDetailsKapali.isDisplayed());
        homePage.carDetailsKapali.click();
        Assert.assertTrue(homePage.carDetailsAcik.isDisplayed());
        homePage.carDetailsAcik.click();
        waitFor(2);
    }

    @And("kullanici reservasyon islemine ait bilgileri Car Details basligi altindan dogrular")
    public void kullaniciReservasyonIslemineAitBilgileriCarDetailsBasligiAltindanDogrular() {
        homePage.carDetailsButonu.click();
        Assert.assertTrue(homePage.carTablebody.getText().contains(ConfigReader.getProperty("selectedCar")));
        waitFor(2);
    }

    @And("kullanici Back to reservations butonunun tiklanabilir oldugunu test eder")
    public void KullaniciBackToReservationsButonununTiklanabilirOldugunuTestEder() {
        Assert.assertTrue(homePage.backToReservation.isDisplayed());
        homePage.backToReservation.click();
        waitFor(3);
    }
}
