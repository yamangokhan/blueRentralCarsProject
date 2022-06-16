#Kullanıcı site anasayfasında reservation işlemini başarıyla gerçekleştirebilmeli	Select a car dropdown menu fonsiyonel olmalı
#Pick up satırına veri girişii yapılabilmeli ve kayıtlı yer seçilebilmeli
#Drop Off satırına veri girişi yapılabilmeli ve kayıtlı yer seçilebilmeli
#Pick up tarih bölümüne manuel veri girişi yapılabilmeli ve takvimden tarih seçilebilmeli
#Pick up saat bölümüne manuel veri girişi yapılabilmeli ve zaman çizelgesinden saat seçilebilmeli
#Drop Off tarih bölümüne manuel veri girişi yapılabilmeli ve takvimden tarih seçilebilmeli
#Drop Off saat bölümüne manuel veri girişi yapılabilmeli ve zaman çizelgesinden saat seçilebilmeli
#Contınue Reservation Butonu tıklanabilir görünür olmalı
#Kullanıcı reservasyon işleminin başarıyla gerçekleştirdiğini doğrular.

# Oguzhan ve Fatih bey





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