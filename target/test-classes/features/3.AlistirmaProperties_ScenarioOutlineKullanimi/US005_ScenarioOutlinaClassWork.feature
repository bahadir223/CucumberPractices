#USER STORY : US167854_manager_login_test
  #NAME:kullanici tum manager login bilgileri ile giris yapabilmeli
  #AC
    #Given kullanici ana sayfada
    #When kullanici login sayfasina gider
    #And kullanici adini girer ->>>>> parametre
    #And sifreyi girer ->>>>>parametre
    #And login butonuna basar
    #Then login islemi gerceklesir
    #Giris yapildigini dogrula
    #Cikis Yap
    #url : https://www.bluerentalcars.com/

  #| email                         | password  |
  #| sam.walker@bluerentalcars.com | c!fas_art |
  #| kate.brown@bluerentalcars.com | tad1$Fas  |

Feature: US167854_manager_login_test

  Scenario Outline:kullanici tum manager login bilgileri ile giris yapabilmeli
    Given kullanici "bluerentalcarsuRL" sayfasina properties ile gider
    Then kullanici 2 saniye bekler
    Then kullanici login butonuna tiklar
    Then kullanici bilgileri girer "<emailAdres>","<sifre>"
    Then kullanici 2 saniye bekler
    Then kullanici girisYap butonuna tiklar
    Then kullanici 2 saniye bekler
    Then kullanici basarili giris yapildigini dogrular
    #And kullanici cikis yapar
    And sayfayi kapatir
    Examples:
      | emailAdres                    | sifre     |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |


