package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HistoryPage {
    WebDriver driver;

    private By h2History = By.xpath("//h2[normalize-space()='History']");
    private By pNoAppointment = By.xpath("//p[normalize-space()='No appointment.']");
    private By panelHeading = By.xpath("//div[@class='panel-heading']");
    private By labelFacility = By.xpath("//label[@for='facility']");
    private By pFacility = By.xpath("//p[@id='facility']");
    private By labelHospitalReadmission = By.xpath("//label[@for='hospital_readmission']");
    private By pHospitalReadmission = By.xpath("//p[@id='hospital_readmission']");
    private By labelProgram = By.xpath("//label[@for='program']");
    private By pProgram = By.xpath("//p[@id='program']");
    private By labelComment = By.xpath("//label[@for='comment']");
    private By pComment = By.xpath("//p[@id='comment']");
    private By buttonGoToHomepage = By.xpath("//a[@class='btn btn-default']");
    
    public HistoryPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getH2History() { return driver.findElement(h2History); }
    public WebElement getPNoAppointment() { return driver.findElement(pNoAppointment); }
    public WebElement getPanelHeading() { return driver.findElement(panelHeading); }
    public WebElement getLabelFacility() { return driver.findElement(labelFacility); }
    public WebElement getPFacility() { return driver.findElement(pFacility); }
    public WebElement getLabelHospitalReadmission() { return driver.findElement(labelHospitalReadmission); }
    public WebElement getPHospitalReadmission() { return driver.findElement(pHospitalReadmission); }
    public WebElement getLabelProgram() { return driver.findElement(labelProgram); }
    public WebElement getPProgram() { return driver.findElement(pProgram); }
    public WebElement getLabelComment() { return driver.findElement(labelComment); }
    public WebElement getPComment() { return driver.findElement(pComment); }
    public WebElement getButtonGoToHomepage() { return driver.findElement(buttonGoToHomepage); }

    public void clickButtonGoToHomepage() {
        getButtonGoToHomepage().click();
    }
}