package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;

public class US_010_StepDefinitionAbout {
    HomePage homePage = new HomePage();

    @Given("kullanici About Us  butonunu gorur ve tiklar")
    public void kullanici_about_us_butonunu_gorur_ve_tiklar() {
        Assert.assertTrue(homePage.aboutUsBaslik.isEnabled());
        homePage.aboutUsBaslik.click();
    }
    @Given("kullanici What do ve offer yazini gorur")
    public void kullanici_what_do_ve_offer_yazini_gorur() {
        Assert.assertTrue(homePage.whatDoWeOffer.isDisplayed());
    }
    @Given("kullanici calisma ortaklarinin Our Partners altinda oldugunu gorur ve dogrular")
    public void kullanici_calisma_ortaklarinin_our_partners_altinda_oldugunu_gorur_ve_dogrular() {
        Assert.assertTrue(homePage.ourPartners.isDisplayed());
    }

}
