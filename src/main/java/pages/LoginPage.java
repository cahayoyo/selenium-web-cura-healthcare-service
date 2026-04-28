package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	private By h2Login = By.xpath("//h2[normalize-space()='Login']");
	private By pPleaseLogin = By.xpath("//p[@class='lead']");
	private By pLoginFailed = By.xpath("//p[@class='lead text-danger']");
	private By labelUsername = By.xpath("//label[@for='txt-username']");
	private By inputUsername = By.xpath("//input[@id='txt-username']");
	private By labelPassword = By.xpath("//label[@for='txt-password']");
	private By inputPassword = By.xpath("//input[@id='txt-password']");
	private By buttonLogin = By.xpath("//button[@id='btn-login']");

	public LoginPage(WebDriver driver){
	    this.driver = driver;
	}
	
	public WebElement geth2Login() { return driver.findElement(h2Login); }
	public WebElement getPPleaseLogin() { return driver.findElement(pPleaseLogin); }
	public WebElement getPPLoginFailed() { return driver.findElement(pLoginFailed) ;}
	public WebElement getLabelUsername() { return driver.findElement(labelUsername); }
	public WebElement getInputUsername() { return driver.findElement(inputUsername); }
	public WebElement getLabelPassword() { return driver.findElement(labelPassword); }
	public WebElement getInputPassword() { return driver.findElement(inputPassword); }
	public WebElement getButtonLogin() { return driver.findElement(buttonLogin); }
	
	public void clickButtonLogin() { getButtonLogin().click();  }
}
