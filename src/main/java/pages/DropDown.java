package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Helper;
import utils.Log;

public class DropDown {
	WebDriver driver;
	
	private By menuToggle = By.xpath("//a[@id='menu-toggle']");
	private By linkCuraHealthCare = By.xpath("//a[normalize-space()='CURA Healthcare']");
	private By linkHome = By.xpath("//a[normalize-space()='Home']");
	private By linkLogin = By.xpath("//a[normalize-space()='Login']");
	private By linkHistory = By.xpath("//a[normalize-space()='History']");
	private By linkProfile = By.xpath("//a[normalize-space()='Profile']");
	private By linkLogout = By.xpath("//a[normalize-space()='Logout']");
	
	public DropDown(WebDriver driver){
        this.driver = driver;
    }
	
    public WebElement getMenuToggle() { return driver.findElement(menuToggle); }
    public WebElement getLinkCuraHealthCare() { return driver.findElement(linkCuraHealthCare); }
    public WebElement getLinkHome() { return driver.findElement(linkHome); }
    public WebElement getLinkLogin() { return driver.findElement(linkLogin); }
    public WebElement getLinkHistory() { return driver.findElement(linkHistory); }
    public WebElement getLinkProfile() { return driver.findElement(linkProfile); }
    public WebElement getLinkLogout() { return driver.findElement(linkLogout); }
    
    public void clickMenuToggle() { getMenuToggle().click(); }
    public void clickLinkCuraHealthCare() { getLinkCuraHealthCare().click(); }
    public void clickLinkHome() { getLinkHome().click(); }
    public void clickLinkLogin() { getLinkLogin().click(); }
    public void clickLinkHistory() { getLinkHistory().click(); }
    public void clickLinkProfile() { getLinkProfile().click(); }
    public void clickLinkLogout() { getLinkLogout().click(); }
    
    public void goToHomeViaLinkCura() {
    	Helper.waitClickable(driver, getMenuToggle(), 5);
    	Log.info("Step: Clicked Menu Toggle.");
    	clickMenuToggle();
    	
    	Helper.waitClickable(driver, getLinkCuraHealthCare(), 5);
    	Log.info("Step: Clicked Link Cura HealthCare.");
    	clickLinkCuraHealthCare();
    }
    
    public void goToHomeViaHomeButton() {
    	Helper.waitClickable(driver, getMenuToggle(), 5);
    	Log.info("Step: Clicked Menu Toggle.");
    	clickMenuToggle();
    	
    	Helper.waitClickable(driver, getLinkHome(), 5);
    	Log.info("Step: Clicked Home button.");
    	clickLinkHome();
    }
    
    public void goToHistory() {
    	Helper.waitClickable(driver, getMenuToggle(), 5);
    	Log.info("Step: Clicked Menu Toggle.");
    	clickMenuToggle();
    	
    	Helper.waitClickable(driver, getLinkHistory(), 5);
    	Log.info("Step: Clicked Profile button.");
    	clickLinkHistory();
    }
    
    public void goToProfile() {
    	Helper.waitClickable(driver, getMenuToggle(), 5);
    	Log.info("Step: Clicked Menu Toggle.");
    	clickMenuToggle();
    	
    	Helper.waitClickable(driver, getLinkProfile(), 5);
    	Log.info("Step: Clicked Profile button.");
    	clickLinkProfile();
    }
    
    public void goToLoginPage() {
    	Helper.waitClickable(driver, getMenuToggle(), 5);
    	Log.info("Step: Clicked Menu Toggle.");
    	clickMenuToggle();
    	
    	Helper.waitClickable(driver, getLinkLogin(), 5);
    	Log.info("Step: Clicked Login button.");
    	clickLinkLogin();
    }
    
}



