package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.Driver;

public class US_003_StepDefinations_yeni_kullanici {
    HomePage homePage=new HomePage();

    @Then("kullanici login tuşuna basar")
    public void kullanici_login_tuşuna_basar() {
        homePage.LoginAnasayfa.click();
    }
    @Then("kullanici Create New User butonu gorunur mu kontrol eder")
    public void create_new_user_butonu_gorunur_mu_kontrol_eder() {
        Assert.assertTrue(homePage.LoginButton.isDisplayed());
    }
    @Then("kullanici Create New User butonu tıklanir mu kontrol eder")
    public void create_new_user_butonu_tıklanir_mu_kontrol_eder() {
        homePage.CreatNewUser.click();
        Assert.assertTrue(homePage.RegisterText.isDisplayed());
    }
    @Then("kullanici First Name textbox tıklanabilir oldugunu test eder")
    public void first_name_textbox_tıklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(homePage.FirstName.isEnabled());
    }
    @Then("kullanici Last Name textbox tıklanabilir oldugunu test eder")
    public void last_name_textbox_tıklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(homePage.LastName.isEnabled());
    }
    @Then("kullanici Phone Number textbox tıklanabilir oldugunu test eder")
    public void phone_number_textbox_tıklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(homePage.PhoneNumber.isEnabled());
    }
    @Then("kullanici Address textbox tıklanabilir oldugunu test eder")
    public void address_textbox_tıklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(homePage.AdresBox.isEnabled());
    }
    @Then("kullanici Zip Code textbox tıklanabilir oldugunu test ede")
    public void zip_code_textbox_tıklanabilir_oldugunu_test_ede() {
        Assert.assertTrue(homePage.ZipCode.isEnabled());
    }
    @Then("kullanici Email textbox tıklanabilir oldugunu test eder")
    public void email_textbox_tıklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(homePage.email.isEnabled());
    }
    @Then("kullanici Password textbox tıklanabilir oldugunu test eder")
    public void password_textbox_tıklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(homePage.Password.isEnabled());
    }
    @Then("kullanici Password \\(Confirm) textboxlarının tıklanabilir oldugunu test eder")
    public void password_confirm_textboxlarının_tıklanabilir_oldugunu_test_eder() {
        Assert.assertTrue(homePage.PasswordConfirm.isEnabled());
    }
    @Then("Kullanıcı Register butonun tıklanabilir ve görünür olduğunu test eder")
    public void kullanıcı_register_butonun_tıklanabilir_ve_görünür_olduğunu_test_eder() {
        Assert.assertTrue(homePage.RegisterButton.isDisplayed());
        Assert.assertTrue(homePage.RegisterButton.isEnabled());

    }
    @Then("kullanici Sayfadaki ilgili textboxların boş bırakılılarak Register butonu tıklandığında boş bırakılan textboxların alt kısmında çıkan kırmızı renkli uyarı yazısını kullanıcı doğrular")
    public void sayfadaki_ilgili_textboxların_boş_bırakılılarak_register_butonu_tıklandığında_boş_bırakılan_textboxların_alt_kısmında_çıkan_kırmızı_renkli_uyarı_yazısını_kullanıcı_doğrular() {
        homePage.RegisterButton.sendKeys(Keys.ENTER);
        Assert.assertTrue(homePage.Alertfirstname.isDisplayed());
        Assert.assertTrue(homePage.AlertLastname.isDisplayed());
        Assert.assertTrue(homePage.AlertAdres.isDisplayed());
        Assert.assertTrue(homePage.AlertZipcode.isDisplayed());
        Assert.assertTrue(homePage.AlertMail.isDisplayed());
        Assert.assertTrue(homePage.AlertPhone.isDisplayed());
        Assert.assertTrue(homePage.AlertPossword.isDisplayed());
        Assert.assertTrue(homePage.AlaertConfirmPassword.isDisplayed());

    }
    @And("kullanici register olustur")
    public void registerOlustur() {
        Faker faker=new Faker();
        String fakeMail=faker.internet().emailAddress();
        homePage.FirstName.sendKeys(faker.name().firstName());
        homePage.LastName.sendKeys(faker.name().lastName());
        homePage.PhoneNumber.clear();
        homePage.PhoneNumber.sendKeys(faker.phoneNumber().subscriberNumber(10));
        homePage.AdresBox.sendKeys(faker.address().fullAddress());
        homePage.ZipCode.sendKeys(faker.code().ean8());
        homePage.email.sendKeys(faker.internet().emailAddress());
        homePage.Password.sendKeys(fakeMail);
        homePage.PasswordConfirm.sendKeys(fakeMail);
        homePage.RegisterButton.sendKeys(Keys.ENTER);
    }
    @Then("Kullanıcı başarılı kayıt işlemi sonrası {string} yazısının görüldüğünü test eder.")
    public void kullanıcı_başarılı_kayıt_işlemi_sonrası_yazısının_görüldüğünü_test_eder(String string) {
        Assert.assertTrue(homePage.successfully.isDisplayed());
    }

    @Then("Kullanıcı register olduktan sonra ilgili sayfaya yonlendirildiğini doğrular")
    public void kullanıcı_register_olduktan_sonra_ilgili_sayfaya_yonlendirildiğini_doğrular() {

        Assert.assertTrue(homePage.LoginAnasayfa.isDisplayed());
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
