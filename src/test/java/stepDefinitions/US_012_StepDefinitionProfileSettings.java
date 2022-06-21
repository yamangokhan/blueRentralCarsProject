package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_012_StepDefinitionProfileSettings {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    Actions actions= new Actions(Driver.getDriver());

    @Then("kullanici isminin yazdigi dropdown menusundeki {string} butonuna basar")
    public void kullaniciIsmininYazdigiDropdownMenusundekiButonunaBasar(String secenek) {
        homePage.isimDropDown.click();
        if (secenek.equals("Reservations")){
            homePage.dropDownReservations.click();
        }else if(secenek.equals("Profile")){
            homePage.dropDownProfile.click();
        }else if (secenek.equals("Logout")){
            homePage.dropDownLogout.click();
        }else System.out.println("tıklanamadi");

    }
    @And("kullanici {string} url'ine ait sayfanin acildigini test eder")
    public void kullaniciUrlIneAitSayfaninAcildiginiTestEder(String seciliSayfaUrl) {
        String expctedUrl=seciliSayfaUrl;
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expctedUrl);
    }


    @Then("kullanici {string} sorusunun gorunur oldugunu test eder")
    public void kullanici_sorusunun_gorunur_oldugunu_test_eder(String string) {
        Assert.assertTrue(homePage.LogoutSorusuElementi.isDisplayed());
    }


    @And("kullanici acilan sayfanin kendi profile sayfasi oldugunu test eder")
    public void kullaniciAcilanSayfaninKendiProfileSayfasiOldugunuTestEder() {
        Assert.assertTrue(homePage.profilSayEmailYaziElementi.isDisplayed());
    }

    @And("kullanici profile sayfasindaki textBox'larin tiklanabilir oldugunu test eder")
    public void kullaniciProfileSayfasindakiTextBoxLarinTiklanabilirOldugunuTestEder() {
        Assert.assertTrue(homePage.profilSayFirstnameTextBox.isEnabled());
        Assert.assertTrue(homePage.profilSayLastNameTextBox.isEnabled());
        Assert.assertTrue(homePage.profilSayPhoneNumberTextBox.isEnabled());
        //Assert.assertTrue(homePage.profilSayEmailTextBox.isEnabled());
        Assert.assertTrue(homePage.profilSayAdressTextBox.isEnabled());
        Assert.assertTrue(homePage.profilSayZipCodeTextBox.isEnabled());
    }

    @And("kullanici verilen yeni email ve passwordla giris yapar")
    public void kullaniciVerilenYeniEmailVePasswordlaGirisYapar() {
            homePage.loginButton.click();
            homePage.loginEmailBox.sendKeys(ConfigReader.getProperty("yeniKullaniciEmail"));
            homePage.loginPasswordBox.sendKeys(ConfigReader.getProperty("clientPassword"));
            homePage.loginOnayButton.click();
    }


    @And("kullanici Save butonunun tiklanabilir oldugunu test eder")
    public void kullaniciSaveButonununTiklanabilirOldugunuTestEder() {
        Assert.assertTrue(homePage.profilSaySaveButton.isEnabled());
    }

    @And("kullanici Your profile updated successfully yazili alertin gorunur oldugununu kontrol eder")
    public void kullaniciYourProfileUpdatedSuccessfullyYaziliAlertinGorunurOldugununuKontrolEder() {
        Assert.assertTrue(homePage.profileUpdatedSuccesfully.isDisplayed());
    }

    @Then("kullanici sayfada asagiya iner")
    public void kullaniciSayfadaAsagiyaIner() {
        actions.sendKeys(Keys.PAGE_DOWN);
    }

    @Then("kullanici firstname texbox'ina rastgele bir isim girer")
    public void kullaniciFirstnameTexboxInaRastgeleBirIsimGirer() {
        homePage.profilSayFirstnameTextBox.sendKeys(Keys.CONTROL+"a"+ Keys.DELETE);
        homePage.profilSayFirstnameTextBox.sendKeys(faker.name().firstName()
                +Keys.TAB
                +Keys.TAB
                +Keys.TAB
                +Keys.TAB
                +Keys.TAB
                +Keys.ENTER);
    }


    @Then("kullanici firstname WebElementinin valuesunun dogru isim olmadigini test eder")
    public void kullaniciFirstnameWebElementininValuesununDogruIsimOlmadiginiTestEder() {
        Driver.getDriver().navigate().refresh();
        System.out.println(homePage.profilSayFirstnameTextBox.getText());
    }

    @And("kullanici firstname texbox'ina dogru ismi yeniden girer")
    public void kullaniciFirstnameTexboxInaDogruIsmiYenidenGirer() {
        homePage.profilSayFirstnameTextBox.sendKeys(Keys.CONTROL+"a"+ Keys.DELETE);
        homePage.profilSayFirstnameTextBox.sendKeys(ConfigReader.getProperty("firstName")
                +Keys.TAB
                +Keys.TAB
                +Keys.TAB
                +Keys.TAB
                +Keys.TAB
                +Keys.ENTER);
    }

    @And("kullanici Old Password, New Password, New Password\\(Retry) text boxlarının tıklanabilir oldugunu test eder")
    public void kullaniciOldPasswordNewPasswordNewPasswordRetryTextBoxlarınınTıklanabilirOldugunuTestEder() {
        Assert.assertTrue(homePage.profilSayOldPassword.isDisplayed());
        Assert.assertTrue(homePage.profilSayNewPassword.isDisplayed());
        Assert.assertTrue(homePage.profilSayConfirmPassword.isDisplayed());
    }

    @Then("kullanici Old Password text box'ina dogru sifreyi girer")
    public void kullaniciOldPasswordTextBoxInaDogruSifreyiGirer() {
        homePage.profilSayOldPassword.sendKeys(ConfigReader.getProperty("clientPassword"));
    }


    @Then("kullanici New Password text box'ina yeni sifreyi girer")
    public void kullaniciNewPasswordTextBoxInaYeniSifreyiGirer() {
        homePage.profilSayNewPassword.sendKeys(ConfigReader.getProperty("degismisYeniSifre"));
    }

    @Then("kullanici New Password\\(Retry) text box'ina yeni sifreyi girer")
    public void kullaniciNewPasswordRetryTextBoxInaYeniSifreyiGirer() {
        homePage.profilSayConfirmPassword.sendKeys(ConfigReader.getProperty("degismisYeniSifre"));
    }

    @And("Update Password butonuna basar")
    public void updatePasswordButonunaBasar() {
        homePage.updatePasswordButton.click();
    }

    @And("Successful upgreat password alertinin gorundugunu test eder")
    public void successfulUpgreatPasswordAlertininGorundugunuTestEder() {
        Assert.assertTrue(homePage.passwordUpdateSuccessfulAlert.isDisplayed());
    }

    @Then("kullanici sayfayi yeniler ve tekrardan sifreyi eski haline getirir")
    public void kullaniciSayfayiYenilerVeTekrardanSifreyiEskiHalineGetirir() {
        Driver.getDriver().navigate().refresh();
        homePage.profilSayOldPassword.sendKeys(ConfigReader.getProperty("degismisYeniSifre"));
        homePage.profilSayNewPassword.sendKeys(ConfigReader.getProperty("clientPassword"));
        homePage.profilSayConfirmPassword.sendKeys(ConfigReader.getProperty("clientPassword"));
        homePage.updatePasswordButton.click();
    }
}
