package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;

public class US_009_StepDefinitionsVehicles {


    HomePage blueRantPage = new HomePage();
    String aracIsim = "";

    @And("Kullanici Vehicles basligini gorur")
    public void kullaniciVehiclesBasliginiGorur() {
        Assert.assertTrue(blueRantPage.vehiclesYazisi.isDisplayed());
    }

    @Then("Kullanici Vehicles bolumunden tum arac listesini gorur")
    public void kullanici_vehicles_bolumunden_tum_arac_listesini_gorur() {
        Assert.assertTrue(blueRantPage.araclar.isDisplayed());

    }

    @Then("Kullanici Vehicles bolumunden arac listesinden herhangibir butonu tiklar")
    public void kullanici_vehicles_bolumunden_arac_listesinden_herhangibir_butonu_tiklar() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        //String aracIsim = "";
        int sayi = (int) (Math.random() * 7 + 7);
        int sayi2 = (int) (Math.random() * 7 + 7);
        int sayi3 = (int) (Math.random() * 13 + 11);


        if (sayi != 13) {
            Driver.getDriver().findElement(By.xpath("(//div//ul//li)[" + sayi + "]")).click();
            Thread.sleep(2000);
            aracIsim = Driver.getDriver().findElement(By.xpath("(//div//ul//li)[" + sayi + "]")).getText();
        } else {
            for (int i = 0; i < 6; i++) {
                Driver.getDriver().findElement(By.xpath("(//div//ul//li)[13]")).click();
                Thread.sleep(2000);
            }
            if (sayi2 != 13) {
                Driver.getDriver().findElement(By.xpath("(//div//ul//li)[" + sayi2 + "]")).click();
                Thread.sleep(2000);
                aracIsim = Driver.getDriver().findElement(By.xpath("(//div//ul//li)[" + sayi2 + "]")).getText();

            } else {
                for (int i = 0; i < 2; i++) {
                    Driver.getDriver().findElement(By.xpath("(//div//ul//li)[13]")).click();
                    Thread.sleep(2000);
                }
                Driver.getDriver().findElement(By.xpath("(//div//ul//li)[" + sayi3 + "]")).click();
                Thread.sleep(2000);
                aracIsim = Driver.getDriver().findElement(By.xpath("(//div//ul//li)[" + sayi3 + "]")).getText();
            }
        }
        System.out.println(aracIsim);
    }

    @And("Kullanici seciminin ozellikler tablosundaki arac ile ayni oldugunu gorur")
    public void kullaniciSecimininOzelliklerTablosundakiAracIleAyniOldugunuGorur() {
        String actual=blueRantPage.secilenAracModel.getText();
        Assert.assertEquals(aracIsim,actual);
    }
    @And("Secilen aracin resmi gorunur olmali")
    public void secilenAracinResmiGorunurOlmali() {
        Assert.assertTrue(blueRantPage.aracResim.isDisplayed());
    }
    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
