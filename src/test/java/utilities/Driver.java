package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    /*
    POM de Driver icin TestBase class ina extends etmek yerine
    driver class indan static method lar kullanarak
    driver olusturup ilgili ayarlarin yapilmasi
    ve en sonda driver in kapatilmasi tercih edilmistir

    POM Driver classindaki getDriver() nin obje olusturularak kullanilmasini engellemek icin
    Singleton pattern kullanimi benimsenmistir

    Singleton Pattern: tekli kullanim, bir classin farkli classlardan
    obje olusturularak kullanimini engellemek icin kullanilir

    Bunu saglamak icin yapmamiz gereken sey oldukca basit
    obje olusturmak icin kullanilan contructoru private yaptigimizda baska classlarda
    Driver classindan obje olusturulmasi mumkun OLAMAZ
     */

    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigReader.getProperty("browser")) {

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "headless-edge": //
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver(new EdgeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {//driver a deger atanmissa
            driver.close();
            driver = null;
        }

    }

}
