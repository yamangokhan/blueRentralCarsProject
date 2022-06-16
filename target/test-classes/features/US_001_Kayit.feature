@blue
Feature:US001 kullanici anasayfada login olmadan arac secmek ister

  Scenario:TC001 kullanici ana sayfada login olmadan arac rezervesyon islemlerini gerceklestirebilmeli


    Given kullanici "BlueRentaCarURL" sitesine gider
    And user select a car menusunun fonksiyonel oldugunu test eder
    And kullanici 6 saniye bekler
    And user pick up satirina veri giris yapabilmeli
    And user drop off satirina veri giris yapabilmeli
    And user Pick up date bolumune giris yapabilmeli
    And user Pick up  time bolumune giris yapılabilmeli
    And user drop off  date bolumune giris yapılabilmeli
    Then user drop off time bolumune giris yapılabilmeli
    Then user Contınue Reservation Butonuna tıklayabilmeli
    And kullanici 3 saniye bekler
    Then user "Please first login" yazısını görebilirligini kontrol eder
