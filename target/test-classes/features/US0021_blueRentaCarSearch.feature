Feature: Kullanicinin verilen bilgiler ile ilgili sayfaya giris islemi basarili olmali


  @brc
  Scenario:TC01 Kullanici verilen bilgilerle ilgili anasayfaya giris yapabilmeli
    Given kullanici "BlueRentaCarUrl" anasayfasina giris yapar
    Then url'in "BlueRentaCarUrl" oldugunu test eder
    Then kullanici 5 sn bekler
    And Kullanıcı sayfaya giriş aşamasında ekranda görülen sitenin logosunun varlıgını test eder
    And Anasayfanin sag ust kosesinde bulunan Login butonu gorunur ve tıklanabilir olmali
    And sayfayi kapatir







