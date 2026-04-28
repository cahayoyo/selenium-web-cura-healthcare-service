package tests.dropdown;

import org.openqa.selenium.WebDriver;

import pages.DropDown;
import pages.HomePage;
import utils.Config;
import utils.Helper;

public class DropDownTests {
	public void TC005_OpenCURAHomeViaCURAHealthCareButton(WebDriver driver) {
        System.out.println("=== Running: TC005_Open CURA Home via CURA Healthcare button ===");
        
        driver.get(Config.BASE_URL);
        System.out.println("Step: Navigate to Login Page first.");

        HomePage HomePage = new HomePage(driver);
        DropDown DropDown = new DropDown(driver);

        try {
        	DropDown.clickMenuToggle();
            System.out.println("Step: Clicked Menu Toggle.");
            
            Thread.sleep(500);
            
            DropDown.clickLinkCuraHealthCare();
            System.out.println("Step: Clicked 'CURA Healthcare' brand button.");
        } catch (Exception e) {
            System.out.println("Retrying: Clicking brand button directly...");
            DropDown.clickMenuToggle();
            DropDown.clickLinkCuraHealthCare();
        }

        String expectedHomeUrl = Config.BASE_URL;
        Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Brand Button");

        Helper.verifyElementEqualsText(HomePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

        System.out.println("=== TC005 Finished ===");
    }
	
	public void TC006_OpenCURAHomeViaHomeButton(WebDriver driver) {
		System.out.println("=== Running: TC006_Open CURA Home via Home button ===");
		
		 driver.get(Config.BASE_URL_LOGIN);
	        System.out.println("Step: Navigate to Login Page first.");

	        HomePage HomePage = new HomePage(driver);
	        DropDown DropDown = new DropDown(driver);

	        try {
	        	DropDown.clickMenuToggle();
	            System.out.println("Step: Clicked Menu Toggle.");
	            
	            Thread.sleep(500);
	            
	            DropDown.clickLinkHome();
	            System.out.println("Step: Clicked Home button.");
	        } catch (Exception e) {
	            System.out.println("Retrying: Clicking home button directly...");
	            DropDown.clickMenuToggle();
	            DropDown.clickLinkHome();
	        }

	        String expectedHomeUrl = Config.BASE_URL;
	        Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Home Button");

	        Helper.verifyElementEqualsText(HomePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

	        System.out.println("=== TC006 Finished ===");
		
	}
}
