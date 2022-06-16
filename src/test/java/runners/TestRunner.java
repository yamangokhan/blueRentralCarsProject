package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@",
        dryRun = false
)

public class TestRunner {

    /*
    bir framework te bir tek runner classi yeterli olabilir
    TestRunner class inda class bodysinde hicbirsey olmaz
    TestRunner classimizi onemli yapan 2 adet annotation vardir
     @RunWith(Cucumber.class) notasyonu runner classina calisma ozelligi katar
     bu notasyon oldugu icin cucumber framework umuzde Junit kullanmayi tercih ediyoruz


    features : TestRunner dosyasinin featyres dosyalarini nereden bulacagini tarif eder
    glue : stepDefinitions dosyalarini nereden bulacagimizi gosterir
    tags : o an hangi tag i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun = true yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
    dryRun = false yazdigimizda testlerimizi calistirir

     */
}
