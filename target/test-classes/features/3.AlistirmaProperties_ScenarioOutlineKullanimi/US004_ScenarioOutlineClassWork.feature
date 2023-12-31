#https://editor.datatables.net adresine gidiniz
#Sayfadaki tabloda new butonuna basalım
#Çıkan pencerede verilen bilgileri girelim
#Create butonuna basalım
#Search bölümüne girdiğimiz firstname bilgisini girelim
#Başarılı bir şekilde giriş yapıldığını doğrulayalım
#Sayfayı kapatalım

Feature: US004 DataTables Sayfasi Testi

  Scenario Outline:TC01 DataTables Veri Girisi
    Given kullanici "dataTablesUrl" sayfasina properties ile gider
    Then kullanici sayfada tabloda new butonuna tiklar
    Then kullanici 3 saniye bekler
    Then kullanici bilgileri girer "<name>","<lastname>","<position>","<office>","<extention>","<date>","<salary>"
    Then kullanici 2 saniye bekler
    Then kullanici create butonuna tiklar
    Then kullanici 2 saniye bekler
    Then kullanici Search bolumune girdigi "<name>" bilgisini girer
    Then kullanici 2 saniye bekler
    Then kullanici "<name>" ile basarili giris yapildigini dogrular
    And sayfayi kapatir

    Examples:
      | name   | lastname | position    | office  | extention | date       | salary  |
      | john   | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
      | sam    | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
      | nancy  | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
      | george | bush     | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
      | barry  | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |

