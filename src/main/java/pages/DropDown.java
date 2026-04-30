package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Config;
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
    	HomePage home = new HomePage(driver);
    	
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkCuraHealthCare, 5);
        Log.info("Step: Clicked Link Cura HealthCare.");
        clickLinkCuraHealthCare();
        
        Helper.waitUrlContains(driver, Config.BASE_URL, 5);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL, "Home URL");
        Helper.verifyElementEqualsText(home.getCuraH1(), "CURA Healthcare Service", "Header H1 after redirection");
    }

    public void goToHomeViaHomeButton() {
    	HomePage home = new HomePage(driver);
    	
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkHome, 5);
        Log.info("Step: Clicked Home button.");
        clickLinkHome();
        
        Helper.waitUrlContains(driver, Config.BASE_URL, 5);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL, "Home URL");
        Helper.verifyElementEqualsText(home.getCuraH1(), "CURA Healthcare Service", "Header H1 after redirection");
    }
    
    public void goToLoginPage() {
    	LoginPage login = new LoginPage(driver);
    	 
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkLogin, 5);
        Log.info("Step: Clicked Login button.");
        clickLinkLogin();
        
        Helper.waitUrlContains(driver, Config.BASE_URL_LOGIN, 5);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL_LOGIN, "Login URL");
        Helper.verifyElementEqualsText(login.getH2Login(), "Login", "Header H2 Login");
    }

    public void goToHistory() {
    	HistoryPage history = new HistoryPage(driver);
    	
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkHistory, 5);
        Log.info("Step: Clicked History button.");
        clickLinkHistory();
        
        Helper.waitUrlContains(driver, Config.BASE_URL_HISTORY, 5);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL_HISTORY, "History URL");
        Helper.verifyElementEqualsText(history.getH2History(), "History", "Header H2 History");
    }

    public void goToProfile() {
    	ProfilePage profile = new ProfilePage(driver);
    	
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkProfile, 5);
        Log.info("Step: Clicked Profile button.");
        clickLinkProfile();
        
        Helper.waitUrlContains(driver, Config.BASE_URL_PROFILE, 5);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL_PROFILE, "Profile URL");
        Helper.verifyElementEqualsText(profile.getH2Profile(), "Profile", "Header H2 Profile");
    }
    
    public void goLogout() {
    	HomePage home = new HomePage(driver);
        Helper.waitClickable(driver, menuToggle, 5);
        Log.info("Step: Clicked Menu Toggle.");
        clickMenuToggle();

        Helper.waitClickable(driver, linkLogout, 5);
        Log.info("Step: Clicked Logout button.");
        clickLinkLogout();
        
        Helper.waitUrlContains(driver, Config.BASE_URL, 5);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL, "Home URL");
        Helper.verifyElementEqualsText(home.getCuraH1(), "CURA Healthcare Service", "Header H1 after redirection");
    }

    
}