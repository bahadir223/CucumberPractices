package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class amazonStepDefinition {
    AmazonPage page = new AmazonPage();
    @Given("kullanici amazon'a gider")
    public void kullaniciAmazonAGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici arama kutusunda iphone aratir")
    public void kullaniciAramaKutusundaIphoneAratir() {
        page.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici arama kutusunda Samsung aratir")
    public void kullaniciAramaKutusundaSamsungAratir() {
        page.aramaKutusu.sendKeys("Samsung", Keys.ENTER);
    }


}
