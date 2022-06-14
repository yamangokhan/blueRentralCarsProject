Feature: US006 kullanici profil sayfasini kontrol edebilir
  @blue
  Scenario: TC01 kullanici dropdown menusunu kullanabilir

    Given kullanici "BlueRentaCarURL" sitesine gider
    Given Kullanıcı anasayfada bulunan Select a car menusunun gorunur oldugunu test eder
    Given kullanici select a car butonuna basar
    Given kullanici select a car menusunden araba secer
    Given Kullanıcı anasayfada bulunan pick up satirinin gorunur oldugunu test eder
    Given kullanici pick up satirina kayitli yer secer
    Given Kullanıcı anasayfada bulunan Drop Off satirinin gorunur oldugunu test eder
    Given kullanici Drop Off satirina kayitli yer secer