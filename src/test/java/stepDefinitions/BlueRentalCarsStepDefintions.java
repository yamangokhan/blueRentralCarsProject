package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;


public class BlueRentalCarsStepDefintions {


    BlueRentalCarsPage blueRentalCarsPage = new BlueRentalCarsPage();

    @Given("user {string} sayfasinda")
    public void userSayfasinda(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("BlueRentaCarURL"));
    }

    @Given("user select a car menusunun fonksiyonel oldugunu test edebilmeli")
    public void user_select_a_car_menusunun_fonksiyonel_oldugunu_test_edebilmeli() {
       Select select=new Select(blueRentalCarsPage.selectCar);
        select.selectByIndex(3);




    }
    @Given("user pick up satirina veri giris yapabilmeli")
    public void user_pick_up_satirina_veri_giris_yapabilmeli() {

        blueRentalCarsPage.pickUp.sendKeys("New York");
       // Select select=new Select(blueRentalCarsPage.pickUp);
       // select.selectByIndex(1);


    }
    @Given("user drop off satirina veri giris yapabilmeli")
    public void user_drop_off_satirina_veri_giris_yapabilmeli() {

        blueRentalCarsPage.DropOff.sendKeys("New Jarsey");
        //Select select=new Select(blueRentalCarsPage.pickUpDropOff);
        //select.selectByIndex(5);

    }
    @Given("user Pick up date bolumune giris yapabilmeli")
    public void user_pick_up_date_bolumune_giris_yapabilmeli() {
        Select select = new Select(blueRentalCarsPage.pickUpDate);
        select.selectByVisibleText("12.06.2022");


    }

        @Given("user Pick up  time bolumune giris yapılabilmeli")
        public void user_pick_up_time_bolumune_giris_yapılabilmeli() {
            Select select=new Select(blueRentalCarsPage.pickUpTime);
            select.selectByVisibleText("10:00");


        }
        @Given("user drop off  date bolumune giris yapılabilmeli")
        public void user_drop_off_date_bolumune_giris_yapılabilmeli() {
            Select select=new Select(blueRentalCarsPage.dropOffDate);
            select.selectByVisibleText("15.06.2022");


        }
        @Then("user drop off time bolumune giris yapılabilmeli")
        public void user_drop_off_time_bolumune_giris_yapılabilmeli() {
            Select select=new Select(blueRentalCarsPage.dropOffTime);
            select.selectByVisibleText("23:00");


        }
        @Then("user Contınue Reservation Butonuna tıklayabilmeli")
        public void user_contınue_reservation_butonuna_tıklayabilmeli() {
            blueRentalCarsPage.continueReservation.click();

        }
        @Then("user {string} yazısını görebilirligini kontrol eder")
        public void user_yazısını_görebilirligini_kontrol_eder(String string) {
            Assert.assertTrue(blueRentalCarsPage.pleaseFirstLogin.isDisplayed());

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






//WebElement ddm= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
// Select select=new Select(ddm);
//  select.selectByVisibleText("Books");
// select.selectByVisibleText("Ford Kuga");









//   Driver.getDriver().get(ConfigReader.getProperty("blueRentalCars"));
// blueRentalCarsPage.selectACar.click();
// blueRentalCarsPage.pickUp.sendKeys("İzmir");
//blueRentalCarsPage.DropOff.sendKeys("İzmir");

// Select select=new Select(blueRentalCarsPage.pickUpDate);
//        select.selectByVisibleText("12.06.2022");

//  Select select=new Select(blueRentalCarsPage.pickUpTime);
//        select.selectByVisibleText("10:00");

// Select select=new Select(blueRentalCarsPage.dropOffDate);
//        select.selectByVisibleText("15.06.2022");

//  Select select=new Select(blueRentalCarsPage.DropOffTime);
//        select.selectByVisibleText("23:00");

//  blueRentalCarsPage.ContınueReservation.click();

//Assert.assertTrue(blueRentalCarsPage.PleaseFirstLogin.isDisplayed());
