#Kullanıcı anasayfayı test edebilmeli 	Kullanıcı About US butonun görülür olduğunu ve tıklanabilir olduğunu doğrular
#Kullanıcı açılan sayfada "What do we offer?" ve "Our Partners" başıklarının görünürlüğü doğrular
#Kullanıcı "Our Partners" başlığu altında bulunan çalışma ortaklarının olduğunu ve görünürlüğü doğrular

  #Huseyin Ercık



Feature: US_010 Kullanici anasayfayi test eder

  Scenario: TC_001 Kullanici anasayfayi Login olmadan test eder
    Given kullanici "blueRentaCarUrl" sitesine gider
    And  kullanici About Us  butonunu gorur ve tiklar
    And kullanici What do ve offer yazini gorur
    And kullanici calisma ortaklarinin Our Partners altinda oldugunu gorur ve dogrular