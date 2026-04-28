package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppointmentPage {
	WebDriver driver;

    private By h2MakeAppointment = By.xpath("//h2[normalize-space()='Make Appointment']");
    private By labelFacility = By.xpath("//label[@for='combo_facility']");
    private By selectFacility = By.xpath("//select[@id='combo_facility']");
    private By checkboxHospitalReadmission = By.xpath("//input[@id='chk_hospotal_readmission']");
    private By labelHospitalReadmission = By.xpath("//label[@for='chk_hospotal_readmission']");
    private By labelHealthcareProgram = By.xpath("//label[normalize-space()='Healthcare Program']");
    private By radioMedicare = By.xpath("//input[@id='radio_program_medicare']");
    private By labelMedicare = By.xpath("//label[normalize-space()='Medicare']");
    private By radioMedicaid = By.xpath("//input[@id='radio_program_medicaid']");
    private By labelMedicaid = By.xpath("//label[normalize-space()='Medicaid']");
    private By radioNone = By.xpath("//input[@id='radio_program_none']");
    private By labelNone = By.xpath("//label[normalize-space()='None']");
    private By labelVisitDate = By.xpath("//label[@for='txt_visit_date']");
    private By inputVisitDate = By.xpath("//input[@id='txt_visit_date']");
    private By labelComment = By.xpath("//label[@for='txt_comment']");
    private By textareaComment = By.xpath("//textarea[@id='txt_comment']");
    private By buttonBookAppointment = By.xpath("//button[@id='btn-book-appointment']");
    
    public AppointmentPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getH2MakeAppointment() { return driver.findElement(h2MakeAppointment); }
    public WebElement getLabelFacility() { return driver.findElement(labelFacility); }
    public WebElement getSelectFacility() { return driver.findElement(selectFacility); }
    public WebElement getCheckboxHospitalReadmission() { return driver.findElement(checkboxHospitalReadmission); }
    public WebElement getLabelHospitalReadmission() { return driver.findElement(labelHospitalReadmission); }
    public WebElement getLabelHealthcareProgram() { return driver.findElement(labelHealthcareProgram); }
    public WebElement getRadioMedicare() { return driver.findElement(radioMedicare); }
    public WebElement getLabelMedicare() { return driver.findElement(labelMedicare); }
    public WebElement getRadioMedicaid() { return driver.findElement(radioMedicaid); }
    public WebElement getLabelMedicaid() { return driver.findElement(labelMedicaid); }
    public WebElement getRadioNone() { return driver.findElement(radioNone); }
    public WebElement getLabelNone() { return driver.findElement(labelNone); }
    public WebElement getLabelVisitDate() { return driver.findElement(labelVisitDate); }
    public WebElement getInputVisitDate() { return driver.findElement(inputVisitDate); }
    public WebElement getLabelComment() { return driver.findElement(labelComment); }
    public WebElement getTextareaComment() { return driver.findElement(textareaComment); }
    public WebElement getButtonBookAppointment() { return driver.findElement(buttonBookAppointment); }

    public void clickCheckboxHospitalReadmission() { getCheckboxHospitalReadmission().click(); }
    public void clickRadioMedicare() { getRadioMedicare().click(); }
    public void clickRadioMedicaid() { getRadioMedicaid().click(); }
    public void clickRadioNone() { getRadioNone().click(); }

    public void setVisitDate(String date) {
        getInputVisitDate().clear();
        getInputVisitDate().sendKeys(date);
    }

    public void setComment(String comment) {
        getTextareaComment().clear();
        getTextareaComment().sendKeys(comment);
    }

    public void clickButtonBookAppointment() { getButtonBookAppointment().click(); }
}
