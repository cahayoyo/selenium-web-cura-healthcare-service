package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDown;
import pages.LoginPage;
import utils.Config;
import utils.Helper;
import utils.Log;

public class AuthTests extends BaseTest {

	@Test
	public void TC008_VerifyLoginPage() {
		Log.info("=== Running: TC008_Verify Login Page ===");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		try {
			dropDown.goToLoginPage();
		} catch (Exception e) {
			Log.error("Retrying: Clicking login button directly...");
			dropDown.goToLoginPage();
		}

		login.verifyLoginPage();
		
		Log.info("=== TC008 Finished ===");
	}
	
	@Test
	public void TC009_LoginSuccess() {
		Log.info("=== Running: TC009_Login Success ===");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

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

		Log.info("=== TC009 Finished ===");
	}
}
