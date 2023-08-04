Feature: US003 Google Sayfasi Testi

  Scenario Outline: TC01 Arama kutusunda Araclar aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" ile propertiesten aratir
    Then kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | aranacakAraclar |
      | arac1           |
      | arac2           |
      | arac3           |
      | arac4           |

    #Bu örnekte Scenario outline: yapisi ile verileri properties dosyasindan cektik