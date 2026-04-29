package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDown;
import pages.HomePage;
import utils.Config;
import utils.Helper;
import utils.Log;

public class DropDownTests extends BaseTest {

	@Test
	public void TC005_OpenCURAHomeViaCURAHealthCareButton() {
		Log.info("=== Running: TC005_Open CURA Home via CURA Healthcare button ===");

		Log.info("Step: Navigate to Login Page first.");

		HomePage homePage = new HomePage(driver);
		DropDown dropDown = new DropDown(driver);

		try {
			dropDown.clickMenuToggle();
			Log.info("Step: Clicked Menu Toggle.");

			Thread.sleep(500);

			dropDown.clickLinkCuraHealthCare();
			Log.info("Step: Clicked 'CURA Healthcare' brand button.");
		} catch (Exception e) {
			Log.error("Retrying: Clicking brand button directly...");
			dropDown.clickMenuToggle();
			dropDown.clickLinkCuraHealthCare();
		}

		String expectedHomeUrl = Config.BASE_URL;
		Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Brand Button");

		Helper.verifyElementEqualsText(homePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

		Log.info("=== TC005 Finished ===");
	}

	@Test
	public void TC006_OpenCURAHomeViaHomeButton() {
		Log.info("=== Running: TC006_Open CURA Home via Home button ===");

		Log.info("Step: Navigate to Login Page first.");

		HomePage homePage = new HomePage(driver);
		DropDown dropDown = new DropDown(driver);

		try {
			dropDown.clickMenuToggle();
			Log.info("Step: Clicked Menu Toggle.");

			Thread.sleep(500);

			dropDown.clickLinkHome();
			Log.info("Step: Clicked Home button.");
		} catch (Exception e) {
			Log.error("Retrying: Clicking home button directly...");
			dropDown.clickMenuToggle();
			dropDown.clickLinkHome();
		}

		String expectedHomeUrl = Config.BASE_URL;
		Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Home Button");

		Helper.verifyElementEqualsText(homePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

		Log.info("=== TC006 Finished ===");

	}
}
