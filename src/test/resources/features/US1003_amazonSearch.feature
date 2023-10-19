

  # kullanici amazon anasayfasinda
  # kullanici iphone icin arama yapar
  # sonuclarin iphone icerdigini test eder
  # Sayfayi kapatir




Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar



  @iphone
Scenario: TC03 kullanici iphone aratir

Given kullanici amazon anasayfasinda
Then kullanici iphone icin arama yapar
And sonuclarin iphone icerdigini test eder
And Sayfayi kapatir