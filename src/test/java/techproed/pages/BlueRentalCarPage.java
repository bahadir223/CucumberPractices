package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalCarPage {
    public BlueRentalCarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement girisYapildiVerify;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement girisYap;

    @FindBy(xpath = "(//*[text()='Logout'])[1]")
    public WebElement logOut;

    @FindBy(xpath = "//*[@class='ajs-button ajs-ok']")
    public WebElement ok;











}
