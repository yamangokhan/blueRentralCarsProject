#   Kullanıcı profil sayfasını test edebilmeli	Kullanıcı verilen bilgiler ile siteye giriş yaptıktan sonra ismi yazılı dropdown menüsünün fonksiyonel olduğunu test etmeli
#	Kullanıcı "Profile" butonuna tıklayarak kendi profilin sayfasına gidebilmeli
#	Kullanıcı açılan sayfada Profile başılığı altında; 1- First Name, 2- Last Name, 3- Phone Number, 4- Email, 5- Address, 6- Zip Code text boxlarının tıklanabilir olduğu görebilmeli
#	Kullanıcı yapılan değişiklik sonrası SAVE butonunn tıklanabilir ve fonksiyonel olduğunu test edebilmeli
#	Kullanıcı açılan sayfada Update Password başılığı altında; 1- Old Password, 2- New Password, 3 -New Password(Retry)  text boxlarının tıklanabilir ve fonksiyonel olduğu görebilmeli
#	Kullanıcı yapılan islem sonrası guncel bilgilerinin görünürlüğü test edebilmeli

  # Mehmet Eren ERGİN

Feature: US012 kullanici profil sayfasini kontrol edebilir

  @US012
  Scenario: TC01 kullanici dropdown menusunu kullanabilir
    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen email ve passwordla giris yapar
    Then kullanici isminin yazdigi dropdown menusundeki "Reservations" butonuna basar
    And kullanici 2 saniye bekler
    And kullanici "https://www.bluerentalcars.com/reservations" url'ine ait sayfanin acildigini test eder
    Then kullanici isminin yazdigi dropdown menusundeki "Profile" butonuna basar
    And kullanici "https://www.bluerentalcars.com/profile" url'ine ait sayfanin acildigini test eder
    Then kullanici isminin yazdigi dropdown menusundeki "Logout" butonuna basar
    And kullanici "Are you sure want to logout?" sorusunun gorunur oldugunu test eder

  @US012
  Scenario: TC02 kullanici profile butonuna basarak kendi profil sayfasina gidebilir
    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen email ve passwordla giris yapar
    Then kullanici isminin yazdigi dropdown menusundeki "Profile" butonuna basar
    And kullanici acilan sayfanin kendi profile sayfasi oldugunu test eder

  @US012
  Scenario: TC03 kullanici profil sayfasindaki textBoxlarin tiklanabilir oldugunu test edebilir
    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen email ve passwordla giris yapar
    Then kullanici isminin yazdigi dropdown menusundeki "Profile" butonuna basar
    And kullanici profile sayfasindaki textBox'larin tiklanabilir oldugunu test eder

  @US012
  Scenario: TC04 kullanici profile sayfasindaki Save butonuna basarak bilgileri kaydedebilir
    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen yeni email ve passwordla giris yapar
    Then kullanici isminin yazdigi dropdown menusundeki "Profile" butonuna basar
    And  kullanici 2 saniye bekler
    Then kullanici firstname texbox'ina rastgele bir isim girer
    And kullanici 2 saniye bekler
    And kullanici Save butonunun tiklanabilir oldugunu test eder
    And kullanici Your profile updated successfully yazili alertin gorunur oldugununu kontrol eder
    Then kullanici firstname WebElementinin valuesunun dogru isim olmadigini test eder
    And kullanici firstname texbox'ina dogru ismi yeniden girer

  @US012
  Scenario: TC05 kullanici profile sayfasindaki Update Password basarak sifreyi degistirebilir
    Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici verilen yeni email ve passwordla giris yapar
    Then kullanici isminin yazdigi dropdown menusundeki "Profile" butonuna basar
    And kullanici Old Password, New Password, New Password(Retry) text boxlarının tıklanabilir oldugunu test eder
    Then kullanici Old Password text box'ina dogru sifreyi girer
    Then kullanici New Password text box'ina yeni sifreyi girer
    Then kullanici New Password(Retry) text box'ina yeni sifreyi girer
    And Update Password butonuna basar
    Then kullanici 2 saniye bekler
    And Successful upgreat password alertinin gorundugunu test eder
    Then kullanici sayfayi yeniler ve tekrardan sifreyi eski haline getirir


