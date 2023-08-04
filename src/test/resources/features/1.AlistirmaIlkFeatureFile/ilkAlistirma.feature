Feature:US001 Ilk Deneme Amazon Sayfasi Testi
  Scenario:TC01 Arama kutusunda herhangi bir urun aratma
    Given kullanici amazon'a gider
    Then kullanici arama kutusunda iphone aratir
    And sayfayi kapatir

    Scenario: TC02 Arama kutusunda herhangi bir urun aratma
      Given kullanici amazon'a gider
      Then kullanici arama kutusunda Samsung aratir
      And sayfayi kapatir