Feature: US002 Google Sayfasi Testi

  Scenario Outline: TC01 Arama kutusunda Araclar aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" aratir
    Then kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test etti
    And sayfayi kapatir

    Examples:
      | aranacakAraclar |
      | volvo           |
      | ford            |
      | audi            |
      | mercedes        |

    #Scenario Outline: kullanimi testNg'deki data provider mantigiyla ayni calisir.
#Yukaridaki ornekteki gibi birden fazla veriyi loop kullanmadan test edebiliriz.
#Scenario Outline kullaniminda Examples yapisini kendimiz yazmamiza gerek yok,
#Scenario Outline yazdigimiz zaman altini kirmizi cizer ve muose ile uzerine geldigimizde
#Example yapisini create edebiliriz.

