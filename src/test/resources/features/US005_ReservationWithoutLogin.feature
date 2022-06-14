#Kullanıcı başarız arac reservasyon işlemini test edebilmeli	Select a car dropdown menu fonsiyonel olmalı
#Pick up satırına veri girişii yapılabilmeli ve kayıtlı yer seçilebilmeli
#Drop Off satırına veri girişi yapılabilmeli ve kayıtlı yer seçilebilmeli
#Pick up tarih bölümüne manuel veri girişi yapılabilmeli ve takvimden tarih seçilebilmeli
#Pick up saat bölümüne manuel veri girişi yapılabilmeli ve zaman çizelgesinden saat seçilebilmeli
#Drop Off tarih bölümüne manuel veri girişi yapılabilmeli ve takvimden tarih seçilebilmeli
#Drop Off saat bölümüne manuel veri girişi yapılabilmeli ve zaman çizelgesinden saat seçilebilmeli
#Contınue Reservation Butonu tıklanabilir görünür olmalı
#Kullanıcı başarız işlem sonrası " This car is not avaliable in these days. Please select another one." uyarı mesajını görebilmeli

  # Sevilay UYANIK


Feature: US005 Kullanıcı başarız arac reservasyon işlemini test edebilmeli
@reservation
  Scenario: TC01 Kullanıcı başarız arac reservasyon işlemini test edebilmeli


    Given kullanici BlueRentaCarURL sitesine gider
    And  kullanici dropdown butonundan araç seçer
    And  kullanici Pick up satırından kayıtlı yer seçer
    Then kullanici Drop Off satırından kayıtlı yer seçer
    Then kullanici Pick up tarih bölümüne takvimden tarih seçer
    Then kullanici Pick up saat bölümüne takvimden saat seçer
    Then kullanici Drop Off tarih bölümüne takvimden tarih seçer
    And  kullanici Drop Off saat bölümüne takvimden saat seçer
    And  kullanici Contınue Reservation Butonuna tıklar
    Then Kullanıcı başarız işlem sonrası " Please first Login" uyarı mesajını görür
