package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Config;
import utils.Helper;

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
    	
    	Helper.waitUrlContains(driver, Config.BASE_URL, 10);
    	Helper.verifyEqualsUrl(driver, Config.BASE_URL, "Home URL");
    }
    
    public void verifyHistoryPageElements() {
        Helper.waitUrlContains(driver, Config.BASE_URL_HISTORY, 10);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL_HISTORY, "History URL");
        
        Helper.verifyElementEqualsText(h2History, "History", "H2 History");
        
        Helper.verifyElementEqualsText(h2History, "History", "H2 History");
        Helper.verifyElementDisplayed(buttonGoToHomepage, "Button Go To Homepage");
	}
    public void verifyHistoryPageElementsAfterMakingAppointment() {
        Helper.waitUrlContains(driver, Config.BASE_URL_HISTORY, 10);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL_HISTORY, "History URL");
        
        Helper.verifyElementEqualsText(h2History, "History", "H2 History");
        
        Helper.verifyElementEqualsText(h2History, "History", "H2 History");
        
        Helper.verifyElementEqualsText(panelHeading, Config.APPOINTMENT_VISIT_DATE, "Date Heading");
        Helper.verifyElementDisplayed(panelHeading, "Date Heading");
        
        Helper.verifyElementEqualsText(labelFacility, "Facility", "Label Facility");
        Helper.verifyElementEqualsText(pFacility, Config.APPOINTMENT_FACILITY, "Selected Facility");

        Helper.verifyElementEqualsText(labelHospitalReadmission, "Apply for hospital readmission", "Label Hospital Readmission");
        Helper.verifyElementEqualsText(pHospitalReadmission, "Yes", "Selected Hospital Readmission");
        
        Helper.verifyElementEqualsText(labelProgram, "Healthcare Program", "Label Healthcare Program");
        Helper.verifyElementEqualsText(pProgram, Config.APPOINTMENT_HEALTHCARE_PROGRAM, "Selected Healthcare Program");
        
        Helper.verifyElementEqualsText(labelComment, "Comment", "Label Comment");
        Helper.verifyElementEqualsText(pComment, Config.APPOINTMENT_COMMENT, "Inputed Comment");
        
        Helper.verifyElementDisplayed(buttonGoToHomepage, "Button Go To Homepage");	
	}
}