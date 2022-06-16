Feature: Kullanıcı anasayfadaki özellikleri kullanabilir

  Scenario: TC01 Customer Services orta Baslıgı altındaki başlıkları görür

    Given kullanici "BlueRentaCarURL" sitesine giderr
    And  Kullanıcı Custemer Services Başliğini görür
    And Kullanıcı Custemer Services Başliğinin altında Flex Renting başliginin görünürlüğünü test eder.
    And Kullanıcı Custemer Services Başliğinin altında Price Equalization başlıgini görünür oldugunu  test eder
    And Kullanıcı Custemer Services Başliğinin altinda No Extra Price başlıgini görünür oldugunu test eder
    And Kullanıcı Custemer Services Başliğinin altinda Hygienic Car  başlıgini görünür oldugunu test eder

    Scenario:TC02 Newsletter Type your email textbox'a email bilgilerini girerek subscribe işlemini gerçekleştirir.
      Given kullanici "BlueRentaCarURL" sitesine giderr
      And Kulllanıcı Type you email texbox'un tıklanabilir oldugunu test eder
      And Kullanıcı Subscribe butonunun görünürlüğünü test eder.
      And Kullanıcı Subscribe butonunun tıklanılabilirliğini test eder.
      And Kullanıcı Email texbox''un tıklanabilir oldugunu test eder.
      And Kullanıcı Email texbox'a email adresini gönderir.
      And Kullanıcı subscribe butonunu tıklar.
      And Kullnıcı email adresine mail geldiğini test eder.

