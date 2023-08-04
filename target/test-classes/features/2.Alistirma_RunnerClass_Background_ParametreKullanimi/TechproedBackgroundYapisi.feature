@hepsi
Feature:US003 TechproEducation Arama Testi

  Background:Kullanici TechPro'ya gider
    Given kullanici techpro'a gider

  Scenario: TC01 Arama Kutusunda Bolum Aratma
    Then kullanici arama kutusunda qa aratir


  Scenario: TC02 Arama Kutusunda Bolum Aratma
    Then arama kutusunda mobile aratir
    But cikan dropdown menuden mobile developer secenegini tiklar
    And basligin Mobile icerdigini test eder


  Scenario: TC03 Arama Kutusunda Bolum Aratma
    Then arama kutusunda java aratir
    But cikan dropdown menuden free java secenegini tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir