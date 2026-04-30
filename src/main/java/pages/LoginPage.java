package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Config;
import utils.Helper;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='Login']")
    WebElement h2Login;

    @FindBy(xpath = "//p[@class='lead']")
    WebElement pPleaseLogin;

    @FindBy(xpath = "//p[@class='lead text-danger']")
    WebElement pLoginFailed;

    @FindBy(xpath = "//label[@for='txt-username']")
    WebElement labelUsername;

    @FindBy(xpath = "//input[@id='txt-username']")
    WebElement inputUsername;

    @FindBy(xpath = "//label[@for='txt-password']")
    WebElement labelPassword;

    @FindBy(xpath = "//input[@id='txt-password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@id='btn-login']")
    WebElement buttonLogin;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getH2Login() { return h2Login; }
    public WebElement getPPleaseLogin() { return pPleaseLogin; }
    public WebElement getPLoginFailed() { return pLoginFailed; }
    public WebElement getLabelUsername() { return labelUsername; }
    public WebElement getInputUsername() { return inputUsername; }
    public WebElement getLabelPassword() { return labelPassword; }
    public WebElement getInputPassword() { return inputPassword; }
    public WebElement getButtonLogin() { return buttonLogin; }

    public void clickButtonLogin() { buttonLogin.click(); }

    public void verifyLoginPageElements() {
        String expectedHomeUrl = Config.BASE_URL_LOGIN;
        Helper.verifyEqualsUrl(driver, expectedHomeUrl, "Login via Login button Sidebar");

        Helper.verifyElementEqualsText(h2Login, "Login", "Header H2 Login");

        Helper.verifyElementEqualsText(labelUsername, "Username", "Label Username");
        Helper.verifyElementEqualsText(labelPassword, "Password", "Label Password");
        Helper.verifyElementDisplayed(inputUsername, "Input Username");
        Helper.verifyElementDisplayed(inputPassword, "Input Password");

        Helper.verifyElementEqualsText(buttonLogin, "Login", "Button Login");
        Helper.verifyElementDisplayed(buttonLogin, "Button Login");
    }

    public void loginSuccess(String username, String password) {
        inputUsername.clear();
        inputUsername.sendKeys(username);

        inputPassword.clear();
        inputPassword.sendKeys(password);

        buttonLogin.click();
        
        Helper.waitUrlContains(driver, "#appointment", 10);
		
		Helper.verifyEqualsUrl(driver, Config.BASE_URL_APPOINTMENT, "Appointment URL");
    }
    
    public void loginFailed(String username, String password) {
        inputUsername.clear();
        inputUsername.sendKeys(username);

        inputPassword.clear();
        inputPassword.sendKeys(password);

        buttonLogin.click();
        
        Helper.verifyElementDisplayed(pLoginFailed, "H2 Warning Login Failed");
        Helper.verifyElementEqualsText(pLoginFailed, "Login failed! Please ensure the username and password are valid.", "H2 Warning Login Failed");
        
        Helper.waitUrlContains(driver, Config.BASE_URL_LOGIN, 10);
		
		Helper.verifyEqualsUrl(driver, Config.BASE_URL_LOGIN, "Login URL");
    }
}