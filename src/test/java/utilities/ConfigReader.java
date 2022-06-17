package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
    public static Properties properties;
    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            //fis dosyaYolu nu tanimladigimiz configurations.properties dosyasini okudu
            properties = new Properties();
            properties.load(fis);//fis in okudugu bilgileri properties e ekledi
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        /*
        test methodundan yolladigimiz string key degerini alip
        Properties classindan getProperty() methodunu kullanarak
        bu key e ait value i bize getirdi
         */
        return properties.getProperty(key);
    }
}