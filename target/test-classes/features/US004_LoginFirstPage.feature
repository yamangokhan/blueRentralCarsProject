#1-Kullanıcı verilen bilgiler ile siteye giriş yaptıktan sonra ismi yazılı
 # dropdown menüsünün fonksiyonel olduğunu test etmeli
#2-Kullanıcı isminin sol tarafında bulunan sosyal medya ikonları görülür olmalı
#3-Home , Services, About Us ve Contact, Call Us  baslıklar görülebilir olmalı ve
 # tıklanabilir olmalı
#4-Kullanıcı sayfanın sol üst tarafında bulunan Bluerentalcars logosunun görünür olduğunu
 # test eder
#5-Kullanıcı logonun üzerinde bulunan Call Us +1 654 7889 45 textin görünür
# olduğunu test eder
#6-Kullanıcı anasayfadaki banner (değişen araç görselleri) görsellerinin
 # çalışıp çalışmadığını test eder

Feature:Kullanici verilen bilgilerle anasayfaya giris yapabilmeli
@loginFirstPage




  Scenario: TC01 kullanici anasayfaya giris yapabilir ve sayfayi kullanir


    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen email ve passwordla giris yapar
    And ismi yazili dropdown menusunu test eder
    And sosyal medya ikonlarinin görunurlugunu test eder
    And home,services,About Us ve Contact  calisitigini test eder

    And Bluerentalcars logosunun gorunur oldugunu test eder
    And Call Us textin gorunur oldugubu test eder
    And Degisen araclar gorselinin calisip calismadigini test eder