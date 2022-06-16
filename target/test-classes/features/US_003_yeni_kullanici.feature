Feature: UUS003 Kullanıcı yeni kayıt olarak siteye giriş yapabilmeli

  Scenario: S01 Create New User butonu görülür ve tıklanabilir olmalı
   Given kullanici "BlueRentaCarURL" sitesine gider
    And kullanici login tuşuna basar
    And kullanici Create New User butonu gorunur mu kontrol eder
    And kullanici Create New User butonu tıklanir mu kontrol eder
    And kullanici First Name textbox tıklanabilir oldugunu test eder
    And kullanici Last Name textbox tıklanabilir oldugunu test eder
    And kullanici Phone Number textbox tıklanabilir oldugunu test eder
    And kullanici Address textbox tıklanabilir oldugunu test eder
    And kullanici Zip Code textbox tıklanabilir oldugunu test ede
    And kullanici Email textbox tıklanabilir oldugunu test eder
    And kullanici Password textbox tıklanabilir oldugunu test eder
    And kullanici Password (Confirm) textboxlarının tıklanabilir oldugunu test eder
    And Kullanıcı Register butonun tıklanabilir ve görünür olduğunu test eder
    And kullanici Sayfadaki ilgili textboxların boş bırakılılarak Register butonu tıklandığında boş bırakılan textboxların alt kısmında çıkan kırmızı renkli uyarı yazısını kullanıcı doğrular
    And kullanici register olustur
    And 3 saniye bekler
    And Kullanıcı başarılı kayıt işlemi sonrası "You are registertered succesfully" yazısının görüldüğünü test eder.
    And Kullanıcı register olduktan sonra ilgili sayfaya yonlendirildiğini doğrular