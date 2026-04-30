package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void setVisitDate(String date) {
        inputVisitDate.clear();
        inputVisitDate.sendKeys(date);
    }

    public void setComment(String comment) {
        textareaComment.clear();
        textareaComment.sendKeys(comment);
    }

    public void clickButtonBookAppointment() { buttonBookAppointment.click(); }
}