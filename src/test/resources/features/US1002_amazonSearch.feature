



  # kullanici amazon anasayfasinda
  # kullanici Java icin arama yapar
  # sonuclarin Java icerdigini test eder
  # Sayfayi kapatir



  @java @smoke
  Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar






  Scenario: TC02 kullanici amazonda Java aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And Sayfayi kapatir