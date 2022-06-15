#   Kullanıcı anasayfayı test edebilmeli	Kullanıcı About US butonun görülür olduğunu ve tıklanabilir olduğunu doğrular
#	Kullanıcı açılan sayfada "Call Center" , "Make Reservation" ve "Cancel Reservation" başıklarının görünürlüğünü dogrular
#	Newsletter Subscription başlık karşında ; Tpe your email textbox'i tıklanabilir olmalı
#	Kullanıcı  Subscribe butonunu görebilmeli ve buton tıklanabilir olmalı
#	Kulllanıcı sayfa sonunda yer alan haritanın görünürlüğü ve fonksiyonel olup olmadığını doğrumalı
#	Kullanıcı sayfa sonundaki haritanın yanında bulunan Name, Phone, Email address ve Comments tezt boxlarının tıklanabilir olduğunu test edebilmeli
#	Kullanıcı SEND butonun görünürlüğü ve tıklanabilir olduğunu test edebilemeli
#	Kullanıcı gönderilen mailin doğruluğunu test eder

# Cemil Bey ve Yavuz Bey


Feature: US011 kullanici contactUs sayfasini kontrol edebilir
  @Contact
  Scenario: TC01 kullanici cagri merkezi ve rezarvasyon  menusunu kullanabilir


    Given kullanici "BlueRentaCarURL" sitesine gider
    And  kullanici contact butonunun görünür oldugunu ve tiklanabilir oldugunu test eder
    And  kullanici call center,make reservation,cancel reservation text'lerinin görünür oldugunu dogrular
    Then type your email text box tiklanabilir oldugunu test eder
    Then kullanici subscribe buttonunu görünür oldugunu ve tıklanabilirligini dogrular
    When haritanin görünür oldugunu ve fonksiyonel oldugunu test eder
    Then kullanici name,phone,emailaddress,comments textbox'ların tiklanabilir oldugunu ve veri girildgini dogrular
    And  kullanici Send buttonun görünür oldugunu ve tiklanabilir oldugunu test eder
    And  kullanici gönderilen mailin dogrulugunu test eder