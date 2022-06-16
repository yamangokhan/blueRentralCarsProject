package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_008_StepDefinationCustomerServicesSubscription {
    HomePage homePage=new HomePage();
    @Given("Kullanıcı Custemer Services Başliğini görür")
    public void kullanıcı_custemer_services_başliğini_görür() throws InterruptedException {
     JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
     jse.executeScript("arguments[0].scrollIntoView(true)",homePage.customerServices);
     Thread.sleep(2000);
     //ayrıca tüm alt basliklar  görülüyor.


    }
    @Given("Kullanıcı Custemer Services Başliğinin altında Flex Renting başliginin görünürlüğünü test eder.")
    public void kullanıcı_custemer_services_başliğinin_altında_flex_renting_başliginin_görünürlüğünü_test_eder() {
        Assert.assertTrue(homePage.flexRenting.isDisplayed());
    }
    @Given("Kullanıcı Custemer Services Başliğinin altında Price Equalization başlıgini görünür oldugunu  test eder")
    public void kullanıcı_custemer_services_başliğinin_altında_price_equalization_başlıgini_görünür_oldugunu_test_eder() {
        Assert.assertTrue(homePage.priceEqualization.isDisplayed());
    }
    @Given("Kullanıcı Custemer Services Başliğinin altinda No Extra Price başlıgini görünür oldugunu test eder")
    public void kullanıcı_custemer_services_başliğinin_altinda_no_extra_price_başlıgini_görünür_oldugunu_test_eder() {
       Assert.assertTrue(homePage.noExtraPrice.isDisplayed());
    }
    @Given("Kullanıcı Custemer Services Başliğinin altinda Hygienic Car  başlıgini görünür oldugunu test eder")
    public void kullanıcı_custemer_services_başliğinin_altinda_hygienic_car_başlıgini_görünür_oldugunu_test_eder() {
      Assert.assertTrue(homePage.hygienicCars.isDisplayed());

    }
    @Given("Kulllanıcı Type you email texbox'un tıklanabilir oldugunu test eder")
    public void kulllanıcı_type_you_email_texbox_un_tıklanabilir_oldugunu_test_eder() throws InterruptedException {
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true)",homePage.newsletterSubscription);
        Thread.sleep(2000);
        Assert.assertTrue(homePage.mailBox.isEnabled());

    }
    @Given("Kullanıcı Subscribe butonunun görünürlüğünü test eder.")
    public void kullanıcı_subscribe_butonunun_görünürlüğünü_test_eder() {
        Assert.assertTrue(homePage.suscribeButonu.isDisplayed());

    }
    @Given("Kullanıcı Subscribe butonunun tıklanılabilirliğini test eder.")
    public void kullanıcı_subscribe_butonunun_tıklanılabilirliğini_test_eder() {
        Assert.assertTrue(homePage.suscribeButonu.isEnabled());

    }

    @Given("Kullanıcı Email texbox'a email adresini gönderir.")
    public void kullanıcı_email_texbox_a_email_adresini_gönderir() {
        homePage.mailBox.sendKeys(ConfigReader.getProperty("clientEmail"));

    }
    @Given("Kullanıcı subscribe butonunu tıklar.")
    public void kullanıcı_subscribe_butonunu_tıklar() {
        homePage.suscribeButonu.click();

    }
    @Given("Kullnıcı email adresine mail geldiğini test eder.")
    public void kullnıcı_email_adresine_mail_geldiğini_test_eder() {
        Assert.assertFalse(homePage.suscribeButonu.isDisplayed());
        //eger görünmüyorsa islem yapmamiş ve mesaj göndermemiş demektir.

    }

    }
