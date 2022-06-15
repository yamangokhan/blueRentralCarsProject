#   Kullanıcı profil sayfasını test edebilmeli	Kullanıcı verilen bilgiler ile siteye giriş yaptıktan sonra ismi yazılı dropdown menüsünün fonksiyonel olduğunu test etmeli
#	Kullanıcı "Profile" butonuna tıklayarak kendi profilin sayfasına gidebilmeli
#	Kullanıcı açılan sayfada Profile başılığı altında; 1- First Name, 2- Last Name, 3- Phone Number, 4- Email, 5- Address, 6- Zip Code text boxlarının tıklanabilir olduğu görebilmeli
#	Kullanıcı yapılan değişiklik sonrası SAVE butonunn tıklanabilir ve fonksiyonel olduğunu test edebilmeli
#	Kullanıcı açılan sayfada Update Password başılığı altında; 1- Old Password, 2- New Password, 3 -New Password(Retry)  text boxlarının tıklanabilir ve fonksiyonel olduğu görebilmeli
#	Kullanıcı yapılan islem sonrası guncel bilgilerinin görünürlüğü test edebilmeli

  # Mehmet Eren ERGİN

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

