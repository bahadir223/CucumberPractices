Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidildi
    Given kullanici "googleUrl" sayfasina properties ile gider

  Scenario: TC01 Arama kutusunda Volvo aratilir
    Then kullanici arama kutusunda "arac1" aratti
    Then kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac1" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda Ford Aratilir
    * kullanici arama kutusunda "arac2" aratti
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac2" icerdigini test eder
    * sayfayi kapatir

  Scenario: TC03 Arama kutusunda BMW Aratilir
    * kullanici arama kutusunda "arac5" aratti
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac5" icerdigini test eder
    * sayfayi kapatir

    #Daha önce yazdığınız steplerin methodlarını tekrar kullanmak istediğinizde
    # And,Then ... yerine *(yıldız) kullanabilirsiniz