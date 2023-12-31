package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();
    }




    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("Nutella"));
    }


    @Then("Sayfayi kapatir")
    public void Sayfayi_kapatir() {
        Driver.closeDriver();
    }















    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }


    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("Java"));
    }
















    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("iphone"));
    }














    @Given("kullanici {string} icin arama yapar")  // Nutella
    public void kullanici_icin_arama_yapar(String istenenKelime) {
     amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }
    @Given("sonuclarin {string} icerdigini test eder")   // Nutella
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(istenenKelime));
    }













    @Given("kullanici {string} anasayfasinda") // amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {
      Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }



    @Then("kullanici {int} sn bekler")  // 3
    public void kullaniciSnBekler(int istenenSaniye ) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @And("url'in {string} icerdigini test eder")   // amazon
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenenKelime));
    }

}
