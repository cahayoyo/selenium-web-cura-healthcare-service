package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentSummaryPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='Appointment Confirmation']")
    WebElement h2AppointmentConfirmation;

    @FindBy(xpath = "//p[@class='lead']")
    WebElement pLead;

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

    @FindBy(xpath = "//label[@for='visit_date']")
    WebElement labelVisitDate;

    @FindBy(xpath = "//p[@id='visit_date']")
    WebElement pVisitDate;

    @FindBy(xpath = "//label[@for='comment']")
    WebElement labelComment;

    @FindBy(xpath = "//p[@id='comment']")
    WebElement pComment;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    WebElement buttonGoToHomepage;

    public AppointmentSummaryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getH2AppointmentConfirmation() { return h2AppointmentConfirmation; }
    public WebElement getPLead() { return pLead; }
    public WebElement getLabelFacility() { return labelFacility; }
    public WebElement getPFacility() { return pFacility; }
    public WebElement getLabelHospitalReadmission() { return labelHospitalReadmission; }
    public WebElement getPHospitalReadmission() { return pHospitalReadmission; }
    public WebElement getLabelProgram() { return labelProgram; }
    public WebElement getPProgram() { return pProgram; }
    public WebElement getLabelVisitDate() { return labelVisitDate; }
    public WebElement getPVisitDate() { return pVisitDate; }
    public WebElement getLabelComment() { return labelComment; }
    public WebElement getPComment() { return pComment; }
    public WebElement getButtonGoToHomepage() { return buttonGoToHomepage; }

    public void clickButtonGoToHomepage() {
        buttonGoToHomepage.click();
    }
}