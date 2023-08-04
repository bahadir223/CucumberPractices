package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class googleStepDefinition {
    GooglePage googlePage = new GooglePage();

    @Given("kullanici {string} sayfasina properties ile gider")
    public void kullaniciSayfasinaPropertiesIleGider(String str) {
        Driver.getDriver().get(ConfigReader.getProperty(str));
    }

    @Then("kullanici arama kutusunda {string} aratti")
    public void kullaniciAramaKutusundaAratti(String str) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(str), Keys.ENTER);
    }

    @And("kullanici sayfa basliginin {string} icerdigini test eder")
    public void kullaniciSayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(str)));
    }

    @Then("kullanici google arama kutusunda {string} aratir")
    public void kullaniciGoogleAramaKutusundaAratir(String str) {
        googlePage.aramaKutusu.sendKeys(str, Keys.ENTER);
    }

    @And("kullanici sayfa basliginin {string} icerdigini test etti")
    public void kullaniciSayfaBasligininIcerdiginiTestEtti(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @Then("kullanici google arama kutusunda {string} ile propertiesten aratir")
    public void kullaniciGoogleAramaKutusundaIlePropertiestenAratir(String str) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(str),Keys.ENTER);
    }
}
