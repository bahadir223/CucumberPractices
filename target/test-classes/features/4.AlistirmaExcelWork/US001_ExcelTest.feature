Feature: US002 BlueRentalCar Excel Login

  Scenario: TC01 Pozitif Login Testi
    Given kullanici "bluerentalcarsuRL" sayfasina properties ile gider
    Then kullanici 2 saniye bekler
    Then exceldeki "customer_info" sayfasindaki bilgiler ile giris yapip giris yapildigini test eder
    And sayfayi kapatir