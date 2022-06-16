Feature: US09 Kullanici Arac Secimini test eder


  Scenario:TC01 kullanici sectigi araci goror
    Then kullanici "BlueRentaCarURL" sitesine gider
    And Kullanici Vehicles basligini gorur
    And kullanici 2 saniye bekler
    And Kullanici Vehicles bolumunden tum arac listesini gorur
    And kullanici 2 saniye bekler
    And Kullanici Vehicles bolumunden arac listesinden herhangibir butonu tiklar
    And kullanici 2 saniye bekler
    And Kullanici seciminin ozellikler tablosundaki arac ile ayni oldugunu gorur
    And kullanici 2 saniye bekler
    And Secilen aracin resmi gorunur olmali
    And sayfayi kapatir