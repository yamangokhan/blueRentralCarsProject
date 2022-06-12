Feature:US101 Kullanici login butonu ile sayfaya giris yapabilmeli

@brc
  Scenario:TC01 Kullanicinin verilen bilgiler ile giris islemi basarili olmali

    Given kullanici "BlueRentaCarURL" anasayfasinda
    Then kullanici "BlueRentaCarUrl" anasayfasinda oldugunu test eder
    And kullanici sitenin logosunun gorunurlugunu  test eder
    And sayfayi kapatir

  @lgn
  Scenario: TC02 positive Login test
    Given kullanici BlueRentaCar anasayfasinda
    Then Log in butonunun gorunur olgugunu test eder
    And Log in butonuna basar
    Then sayfaya giris yaptigini test eder
    And sayfayi kapatir


















