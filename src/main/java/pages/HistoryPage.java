package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='History']")
    WebElement h2History;

    @FindBy(xpath = "//p[normalize-space()='No appointment.']")
    WebElement pNoAppointment;

    @FindBy(xpath = "//div[@class='panel-heading']")
    WebElement panelHeading;

    @FindBy(xpath = "//label[@for='facility']")
    WebElement labelFacility;

    @FindBy(xpath = "//p[@id='facility']")
    WebElement pFacility;

    @FindBy(xpath = "//label[@for='hospital_readmission']")
    WebElement labelHospitalReadmission;

    @FindBy(xpath = "//p[@id='hospital_readmission']")
    WebElement pHospitalReadmission;

    @FindBy(xpath = "//label[@for='program']")
    WebElement labelProgram;

    @FindBy(xpath = "//p[@id='program']")
    WebElement pProgram;

    @FindBy(xpath = "//label[@for='comment']")
    WebElement labelComment;

    @FindBy(xpath = "//p[@id='comment']")
    WebElement pComment;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    WebElement buttonGoToHomepage;

    public HistoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getH2History() { return h2History; }
    public WebElement getPNoAppointment() { return pNoAppointment; }
    public WebElement getPanelHeading() { return panelHeading; }
    public WebElement getLabelFacility() { return labelFacility; }
    public WebElement getPFacility() { return pFacility; }
    public WebElement getLabelHospitalReadmission() { return labelHospitalReadmission; }
    public WebElement getPHospitalReadmission() { return pHospitalReadmission; }
    public WebElement getLabelProgram() { return labelProgram; }
    public WebElement getPProgram() { return pProgram; }
    public WebElement getLabelComment() { return labelComment; }
    public WebElement getPComment() { return pComment; }
    public WebElement getButtonGoToHomepage() { return buttonGoToHomepage; }

    public void clickButtonGoToHomepage() {
        buttonGoToHomepage.click();
    }
}