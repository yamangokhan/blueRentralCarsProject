Feature: US007 Kullanici Reservation islemini Gerceklestirebilmeli

  Scenario:TC01 Başarılı reservasyon işlemi sonrası kullanıcı açılan sayfada "Complete Reservation" yazısı icerdigini doğrular
    When kullanici blurentalcars sayfasinda login olup basarili reservasyon islemini gerceklestirir
    Given acilan sayfada "Complete Reservation" yazisi oldugunu test eder
    Then secilen arac resminin gorunur oldugunu dogrular
    And  kullanici Customer basligi altinda Name, Adress, Phone alt basliklarini dogrular
    And kullanici Location & Date basligi altinda ,Pick-Up Time, Drop-Off Time, Pick-Up Location,Drop-Off Location basliklarindaki bilgileri dogrular
    And kullanici Payment basligi  altinda Total price basliginin gorunur oldugunu dogrular
    And kullanici Close butonun fonksiyonel oldugunu  ve butona bastiginda bir onceki sayfaya geri geldigini test eder
    And Card number texbox ile  Name on Card textbox, Expire Date, CVC fonksiyonel oldugunu test eder ve doldurur
    And kullanici "I have read and aggree the sales contract" yazisini gorebilir ve checkbox tiklar
    And kullanici Complete Reservation butonunun fonksiyonel oldugunu ve tikladiktan sonra reservasyonun gerceklestigini test eder
    And kullanici basarili reservasyon islemi sonrasi ismi altinda bulunan dropdown menu Reservations butonu ile yapilan reservasyoni gorebilir
    And kullanici reservasyonuna tikladiginda Reservation Details acilir kapanir butonunun gorebilir ve tiklanabilir oldugunu test eder
    And kullanici Car Details acilir kapanir butonunun gorulebilir ve tiklanabilir oldugunu test eder
    And kullanici reservasyon islemine ait bilgileri Car Details basligi altindan dogrular
    And kullanici Back to reservations butonunun tiklanabilir oldugunu test eder
