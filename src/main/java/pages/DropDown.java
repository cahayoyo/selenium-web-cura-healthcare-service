package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Helper;
import utils.Log;

public class DropDown {

    WebDriver driver;

    @FindBy(xpath = "//a[@id='menu-toggle']")
    WebElement menuToggle;

    @FindBy(xpath = "//a[normalize-space()='CURA Healthcare']")
    WebElement linkCuraHealthCare;

    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement linkHome;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement linkLogin;

    @FindBy(xpath = "//a[normalize-space()='History']")
    WebElement linkHistory;

    @FindBy(xpath = "//a[normalize-space()='Profile']")
    WebElement linkProfile;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement linkLogout;

    public DropDown(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getMenuToggle() { return menuToggle; }
    public WebElement getLinkCuraHealthCare() { return linkCuraHealthCare; }
    public WebElement getLinkHome() { return linkHome; }
    public WebElement getLinkLogin() { return linkLogin; }
    public WebElement getLinkHistory() { return linkHistory; }
    public WebElement getLinkProfile() { return linkProfile; }
    public WebElement getLinkLogout() { return linkLogout; }

    public void clickMenuToggle() { menuToggle.click(); }
    public void clickLinkCuraHealthCare() { linkCuraHealthCare.click(); }
    public void clickLinkHome() { linkHome.click(); }
    public void clickLinkLogin() { linkLogin.click(); }
    public void clickLinkHistory() { linkHistory.click(); }
    public void clickLinkProfile() { linkProfile.click(); }
    public void clickLinkLogout() { linkLogout.click(); }

    public void goToHomeViaLinkCura() {
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkCuraHealthCare, 5);
        Log.info("Step: Clicked Link Cura HealthCare.");
        clickLinkCuraHealthCare();
    }

    public void goToHomeViaHomeButton() {
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkHome, 5);
        Log.info("Step: Clicked Home button.");
        clickLinkHome();
    }
    
    public void goToLoginPage() {
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkLogin, 5);
        Log.info("Step: Clicked Login button.");
        clickLinkLogin();
    }

    public void goToHistory() {
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkHistory, 5);
        Log.info("Step: Clicked History button.");
        clickLinkHistory();
    }

    public void goToProfile() {
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkProfile, 5);
        Log.info("Step: Clicked Profile button.");
        clickLinkProfile();
    }
    
    public void goLogout() {
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkLogout, 5);
        Log.info("Step: Clicked Logout button.");
        clickLinkLogout();
    }

    
}