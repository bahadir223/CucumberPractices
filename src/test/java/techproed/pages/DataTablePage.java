package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataTablePage {
    public DataTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;
    @FindBy(xpath = "//*[@type='text']")
    public WebElement search;


}
