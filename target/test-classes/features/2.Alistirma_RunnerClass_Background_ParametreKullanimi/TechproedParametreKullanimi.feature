@bahadirAlistirma
Feature: US004 TechproEducation Arama Testi

  Scenario:TC01 Arama Kutusunda Bolum Aratma
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then kullanici arama kutusunda "mobile" aratir
    Then kullanici 2 saniye bekler
    Then cikan dropdown menuden mobile developer secenegini tiklar
    And kullanici 1 saniye bekler
    And basligin "Mobile" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Google sayfasina gidilir
    Given kullanici "https://google.com" sayfasina gider

  Scenario:TC03 facebook sayfasina gidilir
    Given kullanici "https://facebook.com" sayfasina gider

  Scenario:TC04 techpro sayfasina gidilir
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then kullanici arama kutusunda "java" aratir
    And sayfayi kapatir


