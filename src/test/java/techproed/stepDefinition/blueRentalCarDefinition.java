package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class blueRentalCarDefinition {
    BlueRentalCarPage page = new BlueRentalCarPage();

    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        page.loginButton.click();
    }

    @Then("kullanici bilgileri girer {string},{string}")
    public void kullaniciBilgileriGirer(String eMail, String sifre) {
        page.email.sendKeys(eMail, Keys.TAB, sifre);
    }

    @Then("kullanici girisYap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        page.girisYap.click();
    }

    @Then("kullanici basarili giris yapildigini dogrular")
    public void kullaniciBasariliGirisYapildiginiDogrular() {
        page.girisYapildiVerify.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.logOut.isDisplayed());
        //ReusableMethods.bekle(2);
    }

}
