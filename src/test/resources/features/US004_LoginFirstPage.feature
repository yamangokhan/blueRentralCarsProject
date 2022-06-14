Feature:Kullanici verilen bilgilerle anasayfaya giris yapabilmeli

  Scenario: TC01 kullanici anasayfaya giris yapabilir ve sayfayi kullanir


    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen email ve passwordla giris yapar
    And ismi yazili dropdown menusunu test eder