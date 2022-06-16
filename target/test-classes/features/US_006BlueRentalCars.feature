Feature: US006 kullanici profil sayfasini kontrol edebilir
@blue
  Scenario: TC01 kullanici dropdown menusunu kullanabilir

    Given kullanici "BlueRentaCarURL" sitesine giderr
    Given Kullanıcı anasayfada bulunan Select a car menusunun gorunur oldugunu test eder
    Given kullanici select a car butonuna basar
    Given kullanici select a car menusunden araba secer
    Given Kullanıcı anasayfada bulunan pick up satirinin gorunur oldugunu test eder
    Given kullanici pick up satirina kayitli yer secer
    Given Kullanıcı anasayfada bulunan Drop Off satirinin gorunur oldugunu test eder
    Given kullanici Drop Off satirina kayitli yer secer
    Given Kullanıcı anasayfada bulunan pickUpDate satirinin gorunur oldugunu test eder
    Given kullanici pickUpDate satirina tarih girer
    Given Kullanıcı anasayfada bulunan PickUpTime satirinin gorunur oldugunu test eder
    Given kullanici PickUpTime satirina kayitli saat secer
    Given Kullanıcı anasayfada bulunan DropOffDate satirinin gorunur oldugunu test eder
    Given kullanici DropOffTime satirina tarih secer
    Given Kullanıcı anasayfada bulunan DropOffTime satirinin gorunur oldugunu test eder
    Given kullanici DropOffTime satirina  saat secer
    Given Kullanıcı anasayfada bulunan Continue Reservation satirinin gorunur oldugunu test eder
    Given kullanici Continue Reservation butonuna tiklar
    Given pleaseFirstLogin gorunur oldugunu test eder
