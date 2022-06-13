Feature: US012 kullanici profil sayfasini kontrol edebilir

  Scenario: TC01 kullanici dropdown menusunu kullanabilir

    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici login butonuna basar
    And kullanici istenilen bilgileri dogru bir sekilde doldurur ve login butonuna basar
    Then kullanici isminin yazdigi dropdown menusundeki Reservations butonuna basar
    And kullanici https://www.bluerentalcars.com/reservations url'ine ait sayfanin acildigini test eder
    Then kullanici isminin yazdigi dropdown menusundeki Profile butonuna basar
    And kullanici https://www.bluerentalcars.com/profile url'ine ait sayfanin acildigini test eder
    Then kullanici isminin yazdigi dropdown menusundeki Logout butonuna basar
    And kullanici "Are you sure want to logout?" sorusunun gorunur oldugunu test eder

