package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Config;
import utils.Helper;

public class HomePage {
	WebDriver driver;

	@FindBy(css=".text-vertical-center h1")
	WebElement curaH1;
	@FindBy(css=".text-vertical-center h3")
	WebElement weCareH3;
	@FindBy(id="btn-make-appointment")
	WebElement buttonMakeAppointment;
	
	@FindBy(tagName="strong")
	WebElement curaFooter;
	@FindBy(xpath="//footer//p[1]")
	WebElement addressFooter;
	@FindBy(xpath="//footer//ul[@class='list-unstyled']//li[1]")
	WebElement phoneFooter;
	@FindBy(xpath="//footer//ul[@class='list-unstyled']//li[2]")
	WebElement emailFooter;
	
	@FindBy(className="fa-facebook")
	WebElement facebookIcon;
	@FindBy(className="fa-twitter")
	WebElement xIcon;
	@FindBy(className="fa-dribbble")
	WebElement dribbleIcon;
	
	@FindBy(className="text-muted")
	WebElement copyrightFooter;
	
	public HomePage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
	
	public WebElement getCuraH1() { return curaH1; }
	public WebElement getWeCareH3() { return weCareH3; }
	public WebElement getButtonMakeAppointment() { return buttonMakeAppointment; }

	public WebElement getCuraFooter() { return curaFooter; }
	public WebElement getAddressFooter() { return addressFooter; }
	public WebElement getPhoneFooter() { return phoneFooter; }
	public WebElement getEmailFooter() { return emailFooter; }

	public WebElement getFacebookIcon() { return facebookIcon; }
	public WebElement getXIcon() { return xIcon; }
	public WebElement getDribbleIcon() { return dribbleIcon; }

	public WebElement getCopyrightFooter() { return copyrightFooter; }
	
	public void verifyHomePageElements() {
        Helper.verifyElementEqualsText(curaH1, "CURA Healthcare Service", "Header H1");
        Helper.verifyElementEqualsText(weCareH3, "We Care About Your Health", "Header H3");

        Helper.verifyElementEqualsText(buttonMakeAppointment, "Make Appointment", "Button Make Appointment");

        Helper.verifyElementEqualsText(curaFooter, "CURA Healthcare Service", "Footer Title");

        Helper.verifyElementContainsText(addressFooter, "Atlanta 550 Pharr Road NE Suite 525", "Footer Address");
        Helper.verifyElementContainsText(phoneFooter, "(678) 813-1KMS", "Footer Phone");
        Helper.verifyElementEqualsText(emailFooter, "info@katalon.com", "Footer Email");

        Helper.verifyElementDisplayed(facebookIcon, "Icon Facebook");
        Helper.verifyElementDisplayed(xIcon, "Icon X");
        Helper.verifyElementDisplayed(dribbleIcon, "Icon Dribbble");
        
        Helper.verifyElementContainsText(copyrightFooter, "CURA Healthcare Service 2026", "Footer Copyright");
        
        Helper.verifyEqualsUrl(driver, Config.BASE_URL, "Home URL");
	}
	
	public void clickFacebook() {
		Helper.waitVisible(driver, facebookIcon, 5);
		Helper.waitClickable(driver, facebookIcon, 5);
		facebookIcon.click();
		
		Helper.waitUrlContains(driver, "facebook.com", 5);
		Helper.verifyContainsUrl(driver, "facebook.com", "Facebook");
	}
	
	public void clickX() {
		Helper.waitVisible(driver, xIcon, 5);
		Helper.waitClickable(driver, xIcon, 5);
		xIcon.click();
		
		Helper.waitUrlContains(driver, "x.com", 5);
		Helper.verifyContainsUrl(driver, "x.com", "X");
	}
	
	public void clickDribble() {
		Helper.waitVisible(driver, dribbleIcon, 5);
		Helper.waitClickable(driver, dribbleIcon, 5);
		dribbleIcon.click();
		
		Helper.waitUrlContains(driver, "dribble.com", 5);
		Helper.verifyContainsUrl(driver, "dribble.com", "Dribble");
	}
}
