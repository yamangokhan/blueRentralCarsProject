Feature:Kullanici verilen bilgilerle anasayfaya giris yapabilmeli
@loginFirstPage




  Scenario: TC01 kullanici anasayfaya giris yapabilir ve sayfayi kullanir


    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen email ve passwordla giris yapar
    And ismi yazili dropdown menusunu test eder
 And sosyal medya ikonlarinin görunurlugunu test eder
  And home,services,About Us ve Contact  calisitigini test eder