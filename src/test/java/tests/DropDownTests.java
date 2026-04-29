package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDown;
import pages.HistoryPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
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
			dropDown.goToHomeViaLinkCura();
		} catch (Exception e) {
			Log.error("Retrying: Clicking brand button directly...");
			dropDown.goToHomeViaLinkCura();
		}

		String expectedHomeUrl = Config.BASE_URL;
		Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Brand Button");

		Helper.verifyElementEqualsText(homePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

		Log.info("=== TC005 Finished ===");
	}

	@Test
	public void TC006_OpenCURAHomeViaHomeButton() {
		Log.info("=== Running: TC006_Open CURA Home via Home button ===");


		HomePage homePage = new HomePage(driver);
		DropDown dropDown = new DropDown(driver);

		try {
			dropDown.goToHomeViaHomeButton();
		} catch (Exception e) {
			Log.error("Retrying: Clicking home button directly...");
			dropDown.goToHomeViaHomeButton();
		}

		String expectedHomeUrl = Config.BASE_URL;
		Helper.verifyEqualsUrl(driver, expectedHomeUrl, "CURA Home via Home Button");

		Helper.verifyElementEqualsText(homePage.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

		Log.info("=== TC006 Finished ===");

	}
	
	@Test
	public void TC007_OpenLoginViaLoginButton() { 
		Log.info("=== Running: TC007_Open Login via Login button ===");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		try {
			dropDown.goToLoginPage();
		} catch (Exception e) {
			Log.error("Retrying: Clicking login button directly...");
			dropDown.goToLoginPage();
		}

		String expectedHomeUrl = Config.BASE_URL_LOGIN;
		Helper.verifyEqualsUrl(driver, expectedHomeUrl, "Login via Login button Sidebar");

		Helper.verifyElementEqualsText(login.geth2Login(), "Login", "Header H2 Login");

		Log.info("=== TC007 Finished ===");

	}
	
	@Test
	public void TC023_OpenHistoryViaHistoryButton() {
		Log.info("=== Running: TC023_Open History via History button ===");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);
		HistoryPage history = new HistoryPage(driver);

		try {
			dropDown.goToLoginPage();
		} catch (Exception e) {
			Log.error("Retrying: Clicking login button directly...");
			dropDown.goToLoginPage();
		}

		login.verifyLoginPage();
		
		try {
			login.login(Config.USERNAME, Config.PASSWORD);
			
			Helper.waitUrlContains(driver, "#appointment", 10);
			
			Helper.verifyEqualsUrl(driver, Config.BASE_URL_APPOINTMENT, "Appointment URL");
		}catch(Exception e) {
			Log.error("error");
		}

		try {
			dropDown.goToHistory();
		} catch (Exception e) {
			Log.error("Retrying: Clicking history button directly...");
			dropDown.goToHistory();
		}

		String expectedHomeUrl = Config.BASE_URL_HISTORY;
		Helper.verifyEqualsUrl(driver, expectedHomeUrl, "History via History button");

		Helper.verifyElementEqualsText(history.getH2History(), "History", "Header H2 History");

		Log.info("=== TC023 Finished ===");

	}
	
	@Test
	public void TC024_OpenProfileViaProfileButton() {
		Log.info("=== Running: TC024_Open Profile via Profile button ===");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);
		ProfilePage profile = new ProfilePage(driver); 

		try {
			dropDown.goToLoginPage();
		} catch (Exception e) {
			Log.error("Retrying: Clicking login button directly...");
			dropDown.goToLoginPage();
		}

		login.verifyLoginPage();
		
		try {
			login.login(Config.USERNAME, Config.PASSWORD);
			
			Helper.waitUrlContains(driver, "#appointment", 10);
			
			Helper.verifyEqualsUrl(driver, Config.BASE_URL_APPOINTMENT, "Appointment URL");
		}catch(Exception e) {
			Log.error("error");
		}

		try {
			dropDown.goToProfile();
		} catch (Exception e) {
			Log.error("Retrying: Clicking profile button directly...");
			dropDown.goToProfile();
		}

		String expectedHomeUrl = Config.BASE_URL_PROFILE;
		Helper.verifyEqualsUrl(driver, expectedHomeUrl, "Profile via Profile button");

		Helper.verifyElementEqualsText(profile.getH2Profile(), "Profile", "Header H2 Profile");

		Log.info("=== TC024 Finished ===");

	}
}
