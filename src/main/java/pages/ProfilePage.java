package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    WebDriver driver;

    private By h2Profile = By.xpath("//h2[normalize-space()='Profile']");
    private By pUnderConstruction = By.xpath("//p[normalize-space()='Under construction.']");
    private By buttonGoToHomepage = By.xpath("//a[@class='btn btn-default']");
    
    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getH2Profile() { return driver.findElement(h2Profile); }
    public WebElement getPUnderConstruction() { return driver.findElement(pUnderConstruction); }
    public WebElement getButtonGoToHomepage() { return driver.findElement(buttonGoToHomepage); }

    public void clickButtonGoToHomepage() { getButtonGoToHomepage().click(); }
}