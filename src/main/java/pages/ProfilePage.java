package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='Profile']")
    WebElement h2Profile;

    @FindBy(xpath = "//p[normalize-space()='Under construction.']")
    WebElement pUnderConstruction;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    WebElement buttonGoToHomepage;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getH2Profile() { return h2Profile; }
    public WebElement getPUnderConstruction() { return pUnderConstruction; }
    public WebElement getButtonGoToHomepage() { return buttonGoToHomepage; }

    public void clickButtonGoToHomepage() {
        buttonGoToHomepage.click();
    }
}