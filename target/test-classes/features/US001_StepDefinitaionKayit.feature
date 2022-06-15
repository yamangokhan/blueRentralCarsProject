      #Select a car dropdown menu fonsiyonel olmalı
      #Pick up satırına veri girişi yapılabilmeli ve kayıtlı yer seçilebilmeli
      #Drop Off satırına veri girişi yapılabilmeli ve kayıtlı yer seçilebilmeli
      #Pick up tarih bölümüne manuel veri girişi yapılabilmeli ve takvimden tarih seçilebilmeli
      #Pick up saat bölümüne manuel veri girişi yapılabilmeli ve zaman çizelgesinden saat seçilebilmeli
      #Drop Off tarih bölümüne manuel veri girişi yapılabilmeli ve takvimden tarih seçilebilmeli
      #Drop Off saat bölümüne manuel veri girişi yapılabilmeli ve zaman çizelgesinden saat seçilebilmeli
      #Contınue Reservation Butonu tıklanabilir görünür olmalı
      #İlgili bilgiler ile form dolduruldugunda kullanıcı Contınue Reservation Butonu tıkladığında "Please first login" yazısını görebilmeli



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
    Then user "Please first login" yazısını görebilirligini kontrol eder

