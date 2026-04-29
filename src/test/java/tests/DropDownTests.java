package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDown;
import pages.HomePage;
import utils.Config;
import utils.Helper;

public class DropDownTests extends BaseTest {
	
	@Test
	public void TC005_OpenCURAHomeViaCURAHealthCareButton() {
        System.out.println("=== Running: TC005_Open CURA Home via CURA Healthcare button ===");
        
        System.out.println("Step: Navigate to Login Page first.");

        HomePage homePage = new HomePage(driver);
        DropDown dropDown = new DropDown(driver);

        try {
        	dropDown.clickMenuToggle();
            System.out.println("Step: Clicked Menu Toggle.");
            
            Thread.sleep(500);
            
            dropDown.clickLinkCuraHealthCare();
            System.out.println("Step: Clicked 'CURA Healthcare' brand button.");
        } catch (Exception e) {
            System.out.println("Retrying: Clicking brand button directly...");
            dropDown.clickMenuToggle();
            dropDown.clickLinkCuraHealthCare();
        }

        String expectedHomeUrl = Config.BASE_URL;
        Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Brand Button");

        Helper.verifyElementEqualsText(homePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

        System.out.println("=== TC005 Finished ===");
    }
	
	@Test
	public void TC006_OpenCURAHomeViaHomeButton() {
		System.out.println("=== Running: TC006_Open CURA Home via Home button ===");
		
	        System.out.println("Step: Navigate to Login Page first.");

	        HomePage homePage = new HomePage(driver);
	        DropDown dropDown = new DropDown(driver);

	        try {
	        	dropDown.clickMenuToggle();
	            System.out.println("Step: Clicked Menu Toggle.");
	            
	            Thread.sleep(500);
	            
	            dropDown.clickLinkHome();
	            System.out.println("Step: Clicked Home button.");
	        } catch (Exception e) {
	            System.out.println("Retrying: Clicking home button directly...");
	            dropDown.clickMenuToggle();
	            dropDown.clickLinkHome();
	        }

	        String expectedHomeUrl = Config.BASE_URL;
	        Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Home Button");

	        Helper.verifyElementEqualsText(homePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

	        System.out.println("=== TC006 Finished ===");
		
	}
}
