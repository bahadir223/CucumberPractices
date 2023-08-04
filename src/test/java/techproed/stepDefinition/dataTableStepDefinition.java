package techproed.stepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class dataTableStepDefinition {
    DataTablePage page = new DataTablePage();

    @Then("kullanici sayfada tabloda new butonuna tiklar")
    public void kullaniciSayfadaTablodaNewButonunaTiklar() {
        page.newButton.click();
    }

    @Then("kullanici bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciBilgileriGirer(String name, String lastname, String position, String office, String extention, String date, String salary) {
        page.firstName.sendKeys(name,
                Keys.TAB, lastname, Keys.TAB, position, Keys.TAB,
                office, Keys.TAB, extention, Keys.TAB, date, Keys.TAB, salary);
    }

    @Then("kullanici create butonuna tiklar")
    public void kullaniciCreateButonunaTiklar() {
        page.createButton.click();
    }


    @Then("kullanici Search bolumune girdigi {string} bilgisini girer")
    public void kullaniciSearchBolumuneGirdigiBilgisiniGirer(String str) {
        page.search.sendKeys(str);
    }
}
