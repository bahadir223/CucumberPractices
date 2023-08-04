package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class techproStepDefinition {
    TechproPage page = new TechproPage();

    @Given("kullanici techpro'a gider")
    public void kullaniciTechproAGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @Then("kullanici arama kutusunda qa aratir")
    public void kullaniciAramaKutusundaQaAratir() {
        page.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @Then("arama kutusunda mobile aratir")
    public void aramaKutusundaMobileAratir() {
        page.aramaKutusu.sendKeys("mobile");
        ReusableMethods.bekle(2);
    }

    @But("cikan dropdown menuden mobile developer secenegini tiklar")
    public void cikanDropdownMenudenMobileDeveloperSeceneginiTiklar() {
        page.mobileDeveloper.click();
        ReusableMethods.bekle(3);
    }

    @And("basligin Mobile icerdigini test eder")
    public void basliginMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        page.aramaKutusu.sendKeys("java");
        ReusableMethods.bekle(2);
    }

    @But("cikan dropdown menuden free java secenegini tiklar")
    public void cikanDropdownMenudenFreeJavaSeceneginiTiklar() {
        page.freeJava.click();
        ReusableMethods.bekle(3);
    }

    @And("basligin Free icerdigini test eder")
    public void basliginFreeIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Free"));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String str) {
        Driver.getDriver().get(str);
    }

    @Given("kullanici arama kutusunda {string} aratir")
    public void kullaniciAramaKutusundaAratir(String str) {
        page.aramaKutusu.sendKeys(str);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @And("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }
}
