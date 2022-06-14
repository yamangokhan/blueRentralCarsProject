Feature: US_010 Kullanici anasayfayi test eder
  @About
  Scenario: TC_001 Kullanici anasayfayi Login olmadan test eder
    Given kullanici "blueRentaCarUrl" sitesine gider
    And  kullanici About Us  butonunu gorur ve tiklar
    And kullanici What do ve offer yazini gorur
    And kullanici calisma ortaklarinin Our Partners altinda oldugunu gorur ve dogrular