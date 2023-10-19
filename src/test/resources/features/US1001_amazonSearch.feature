

  # kullanici amazon anasayfasinda
  # kullanici Nutella icin arama yapar
  # sonuclarin Nutella icerdigini test eder
  # Sayfayi kapatir




  Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar





    @nutella
    Scenario: TC01 kullanici amazonda Nutella aratir

      Given kullanici amazon anasayfasinda
      Then kullanici Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And Sayfayi kapatir




