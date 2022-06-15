package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_StepDefinitionKayit {

    HomePage homePage = new HomePage();




    @And("user select a car menusunun fonksiyonel oldugunu test eder")
    public void userSelectACarMenusununFonksiyonelOldugunuTestEder() {
        Select select=new Select(homePage.select);
        select.selectByIndex(3);


    }

    @And("user pick up satirina veri giris yapabilmeli")
    public void userPickUpSatirinaVeriGirisYapabilmeli() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.pickUp).
                sendKeys("New York").perform();

    }

    @And("user drop off satirina veri giris yapabilmeli")
    public void userDropOffSatirinaVeriGirisYapabilmeli() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.DropOff).
                sendKeys("New York").perform();

    }

    @And("user Pick up date bolumune giris yapabilmeli")
    public void userPickUpDateBolumuneGirisYapabilmeli() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.pickUpDate).
                sendKeys("15.06.2022").perform();
        // "15.06.2022"

    }

    @And("user Pick up  time bolumune giris yapılabilmeli")
    public void userPickUpTimeBolumuneGirisYapılabilmeli() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.pickUpTime).
                sendKeys("10:00").perform();

        /*
           Select select=new Select(blueRentalCarsPage.pickUpTime);
            select.selectByVisibleText("10:00");

         */
    }

    @And("user drop off  date bolumune giris yapılabilmeli")
    public void userDropOffDateBolumuneGirisYapılabilmeli() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.dropOffDate).
                sendKeys("15.06.2022").perform();
        /*
          Select select=new Select(blueRentalCarsPage.dropOffDate);
            select.selectByVisibleText("15.06.2022");

         */

    }

    @Then("user drop off time bolumune giris yapılabilmeli")
    public void userDropOffTimeBolumuneGirisYapılabilmeli() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(homePage.dropOffTime).
                sendKeys("23:00").perform();


    }

    @Then("user Contınue Reservation Butonuna tıklayabilmeli")
    public void userContınueReservationButonunaTıklayabilmeli() {
        homePage.continueReservation.click();

    }

    @Then("user {string} yazısını görebilirligini kontrol eder")
    public void userYazısınıGörebilirliginiKontrolEder(String arg0) {
        Assert.assertTrue(homePage.pleaseFirstLogin.isDisplayed());

    }
    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}