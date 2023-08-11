package techproed.stepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.ExcelReader;
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

    @Then("exceldeki {string} sayfasindaki bilgiler ile giris yapip giris yapildigini test eder")
    public void exceldekiSayfasindakiBilgilerIleGirisYapipGirisYapildiginiTestEder(String sayfaIsmi) {
        String dosyaYolu = "src/test/resources/mysmoketestdata (1).xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu, sayfaIsmi);
        for (int i = 1; i < excelReader.rowCount(); i++) {
            page.loginButton.click();
            ReusableMethods.bekle(2);
            String email = excelReader.getCellData(i, 0);
            String password = excelReader.getCellData(i, 1);
            page.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
            ReusableMethods.bekle(2);
            page.girisYapildiVerify.click();
            ReusableMethods.bekle(2);
            page.profileButton.click();
            ReusableMethods.bekle(2);
            Assert.assertEquals(page.profileMail.getText(), email);
            ReusableMethods.bekle(2);
            page.girisYapildiVerify.click();
            ReusableMethods.bekle(2);
            page.logOut.click();
            ReusableMethods.bekle(2);
            page.ok.click();
        }
    }
}
