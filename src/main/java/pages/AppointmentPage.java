package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.Config;
import utils.Helper;

public class AppointmentPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='Make Appointment']")
    WebElement h2MakeAppointment;

    @FindBy(xpath = "//label[@for='combo_facility']")
    WebElement labelFacility;

    @FindBy(xpath = "//select[@id='combo_facility']")
    WebElement selectFacility;

    @FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
    WebElement checkboxHospitalReadmission;

    @FindBy(xpath = "//label[@for='chk_hospotal_readmission']")
    WebElement labelHospitalReadmission;

    @FindBy(xpath = "//label[normalize-space()='Healthcare Program']")
    WebElement labelHealthcareProgram;

    @FindBy(xpath = "//input[@id='radio_program_medicare']")
    WebElement radioMedicare;

    @FindBy(xpath = "//label[normalize-space()='Medicare']")
    WebElement labelMedicare;

    @FindBy(xpath = "//input[@id='radio_program_medicaid']")
    WebElement radioMedicaid;

    @FindBy(xpath = "//label[normalize-space()='Medicaid']")
    WebElement labelMedicaid;

    @FindBy(xpath = "//input[@id='radio_program_none']")
    WebElement radioNone;

    @FindBy(xpath = "//label[normalize-space()='None']")
    WebElement labelNone;

    @FindBy(xpath = "//label[@for='txt_visit_date']")
    WebElement labelVisitDate;

    @FindBy(xpath = "//input[@id='txt_visit_date']")
    WebElement inputVisitDate;

    @FindBy(xpath = "//label[@for='txt_comment']")
    WebElement labelComment;

    @FindBy(xpath = "//textarea[@id='txt_comment']")
    WebElement textareaComment;

    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    WebElement buttonBookAppointment;

    public AppointmentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getH2MakeAppointment() { return h2MakeAppointment; }
    public WebElement getLabelFacility() { return labelFacility; }
    public WebElement getSelectFacility() { return selectFacility; }
    public WebElement getCheckboxHospitalReadmission() { return checkboxHospitalReadmission; }
    public WebElement getLabelHospitalReadmission() { return labelHospitalReadmission; }
    public WebElement getLabelHealthcareProgram() { return labelHealthcareProgram; }
    public WebElement getRadioMedicare() { return radioMedicare; }
    public WebElement getLabelMedicare() { return labelMedicare; }
    public WebElement getRadioMedicaid() { return radioMedicaid; }
    public WebElement getLabelMedicaid() { return labelMedicaid; }
    public WebElement getRadioNone() { return radioNone; }
    public WebElement getLabelNone() { return labelNone; }
    public WebElement getLabelVisitDate() { return labelVisitDate; }
    public WebElement getInputVisitDate() { return inputVisitDate; }
    public WebElement getLabelComment() { return labelComment; }
    public WebElement getTextareaComment() { return textareaComment; }
    public WebElement getButtonBookAppointment() { return buttonBookAppointment; }

    public void clickCheckboxHospitalReadmission() { checkboxHospitalReadmission.click(); }
    public void clickRadioMedicare() { radioMedicare.click(); }
    public void clickRadioMedicaid() { radioMedicaid.click(); }
    public void clickRadioNone() { radioNone.click(); }
    public void clickButtonBookAppointment() { buttonBookAppointment.click(); }
    
    public void verifyAppointmentPageElements() {
        Helper.waitUrlContains(driver, Config.BASE_URL_APPOINTMENT, 10);
        Helper.verifyEqualsUrl(driver, Config.BASE_URL_APPOINTMENT, "Appointment URL");
        
        Helper.verifyElementEqualsText(h2MakeAppointment, "Make Appointment", "H2 Make Appointment");
        
        Helper.verifyElementEqualsText(labelFacility, "Facility", "Label Facility");
        Helper.verifyElementDisplayed(selectFacility, "Select DropDown Facility");
        
        Helper.verifyElementDisplayed(checkboxHospitalReadmission, "Checkbox Hospital Readmission");
        Helper.verifyElementEqualsText(labelHospitalReadmission, "Apply for hospital readmission", "Label Hospital Readmission");
        
        Helper.verifyElementEqualsText(labelHealthcareProgram, "Healthcare Program", null);
        Helper.verifyElementDisplayed(radioMedicare, "Radio Medicare");
        Helper.verifyElementEqualsText(labelMedicare, "Medicare", "Label Medicare");
        Helper.verifyElementDisplayed(radioMedicaid, "Radio Medicaid");
        Helper.verifyElementEqualsText(labelMedicaid, "Medicaid", "Label Medicaid");
        Helper.verifyElementDisplayed(radioNone, "Radio None");
        Helper.verifyElementEqualsText(labelNone, "None", "Label None");
        
        Helper.verifyElementEqualsText(labelVisitDate, "Visit Date (Required)", "Label Visit Date");
        Helper.verifyElementDisplayed(inputVisitDate, "Input Visit Date");
        
        Helper.verifyElementEqualsText(labelComment, "Comment", "Label Comment");
        Helper.verifyElementDisplayed(textareaComment, "Text Area Comment");
        
        Helper.verifyElementDisplayed(buttonBookAppointment, "Button Book Appointment");
        Helper.verifyElementEqualsText(buttonBookAppointment, "Book Appointment", "Button Book Appointment");
	}

    public void fillingFormAppointmentSuccess() {
    	Select select = new Select(selectFacility);
    	select.selectByVisibleText(Config.APPOINTMENT_FACILITY);
    	
    	checkboxHospitalReadmission.click();
    	radioMedicaid.click();
    	inputVisitDate.sendKeys(Config.APPOINTMENT_VISIT_DATE);
    	textareaComment.sendKeys(Config.APPOINTMENT_COMMENT);
    	buttonBookAppointment.click();
    	
    	Helper.waitUrlContains(driver, "#summary", 10);
    	Helper.verifyEqualsUrl(driver, Config.BASE_URL_APPOINTMENT_SUMMARY, "Appointment Summary URL");
    }
    
    public void fillingFormAppointmentFailedEmptyDate() {
    	Select select = new Select(selectFacility);
    	select.selectByVisibleText(Config.APPOINTMENT_FACILITY);
    	
    	checkboxHospitalReadmission.click();
    	radioMedicaid.click();
    	textareaComment.sendKeys(Config.APPOINTMENT_COMMENT);
    	buttonBookAppointment.click();
    	
    	Helper.verifyValidationMessage(inputVisitDate, "Please fill out this field", "Visit Date");
    	
    	Helper.waitUrlContains(driver, Config.BASE_URL_APPOINTMENT, 10);
    	Helper.verifyEqualsUrl(driver, Config.BASE_URL_APPOINTMENT, "Appointment URL");
    }
    
    public void fillingFormAppointmentFailedInvalidDate() {
    	Select select = new Select(selectFacility);
    	select.selectByVisibleText(Config.APPOINTMENT_FACILITY);
    	
    	checkboxHospitalReadmission.click();
    	radioMedicaid.click();
    	inputVisitDate.sendKeys(Config.APPOINTMENT_VISIT_DATE_INVALID);
    	textareaComment.sendKeys(Config.APPOINTMENT_COMMENT);
    	buttonBookAppointment.click();
    	
    	Helper.waitUrlContains(driver, Config.BASE_URL_APPOINTMENT, 10);
    	Helper.verifyEqualsUrl(driver, Config.BASE_URL_APPOINTMENT, "Appointment URL");
    }

    
}