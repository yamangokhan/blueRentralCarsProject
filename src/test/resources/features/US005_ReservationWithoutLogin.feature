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
