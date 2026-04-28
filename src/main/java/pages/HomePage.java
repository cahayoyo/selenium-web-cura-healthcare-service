package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	// Elements
	// Body
	private By h1Title = By.cssSelector(".text-vertical-center h1");
	private By h3Title = By.cssSelector(".text-vertical-center h3");
	private By btnMakeAppointment = By.id("btn-make-appointment");
	
	// Side
	private By menuToggle = By.id("menu-toggle");
	private By linkCuraHealthcare = By.xpath("//a[contains(text(),'CURA Healthcare')]");
	
	// Footer
	private By footerTitle = By.tagName("strong");
	private By footerAddress = By.xpath("//footer//p[1]");
	private By footerPhone = By.xpath("//footer//ul[@class='list-unstyled']//li[1]");
	private By footerEmail = By.xpath("//footer//ul[@class='list-unstyled']//li[2]");
	private By footerCopyright = By.className("text-muted");
	
	// Footer - Social Media
    private By fbIcon = By.className("fa-facebook");
    private By twitterIcon = By.className("fa-twitter");
    private By dribbbleIcon = By.className("fa-dribbble");
    
    public HomePage(WebDriver driver) {
    	this.driver = driver;
    }
    
 // --- Actions / Getters ---
    public WebElement getH1() { return driver.findElement(h1Title); }
    public WebElement getH3() { return driver.findElement(h3Title); }
    public WebElement getBtnMakeAppointment() { return driver.findElement(btnMakeAppointment); }
    public WebElement getMenuToggle() { return driver.findElement(menuToggle); }
    public WebElement getLinkCuraHealthCare() { return driver.findElement(linkCuraHealthcare); }
    public WebElement getFooterTitle() { return driver.findElement(footerTitle); }
    public WebElement getFooterAddress() { return driver.findElement(footerAddress); }
    public WebElement getFooterPhone() { return driver.findElement(footerPhone); }
    public WebElement getFooterEmail() { return driver.findElement(footerEmail); }
    public WebElement getFooterCopyright() { return driver.findElement(footerCopyright); }
    public WebElement getFbIcon() { return driver.findElement(fbIcon); }
    public WebElement getTwitterIcon() { return driver.findElement(twitterIcon); }
    public WebElement getDribbbleIcon() { return driver.findElement(dribbbleIcon); }
    
    public void clickMenuToggle() {
    	getMenuToggle().click();
    }
    
    public void clickCuraHealthCare() {
    	getLinkCuraHealthCare().click();
    }

}
