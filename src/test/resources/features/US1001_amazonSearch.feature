

  # kullanici amazon anasayfasinda
  # kullanici Nutella icin arama yapar
  # sonuclarin Nutella icerdigini test eder
  # Sayfayi kapatir



  @nutella @smoke
  Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar






    Scenario: TC01 kullanici amazonda Nutella aratir


      Given kullanici amazon anasayfasinda
      Then kullanici Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And Sayfayi kapatir




