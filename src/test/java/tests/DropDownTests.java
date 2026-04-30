package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDown;
import pages.LoginPage;
import utils.Config;
import utils.ExtentReportManager;
import utils.Log;

public class DropDownTests extends BaseTest {

	@Test
	public void TC005_OpenCURAHomeViaCURAHealthCareButton() {
		Log.info("=== Running: TC005_Open CURA Home via CURA Healthcare button ===");
		test = ExtentReportManager.createTest("TC005_OpenCURAHomeViaCURAHealthCareButton");
		
		DropDown dropDown = new DropDown(driver);
		
		Log.info("Step: Navigate to Login Page first.");
		dropDown.goToLoginPage();

		dropDown.goToHomeViaLinkCura();

		Log.info("=== TC005_OpenCURAHomeViaCURAHealthCareButton Finished ===");
		test.pass("TC005_OpenCURAHomeViaCURAHealthCareButton PASSED");
	}

	@Test
	public void TC006_OpenCURAHomeViaHomeButton() {
		Log.info("=== Running: TC006_Open CURA Home via Home button ===");
		test = ExtentReportManager.createTest("TC006_OpenCURAHomeViaHomeButton");

		DropDown dropDown = new DropDown(driver);
		
		Log.info("Step: Navigate to Login Page first.");
		dropDown.goToLoginPage();

		dropDown.goToHomeViaHomeButton();

		Log.info("=== TC006_OpenCURAHomeViaHomeButton Finished ===");
		test.pass("TC006_OpenCURAHomeViaHomeButton PASSED");
	}
	
	@Test
	public void TC007_OpenLoginViaLoginButton() { 
		Log.info("=== Running: TC007_Open Login via Login button ===");
		test = ExtentReportManager.createTest("TC007_OpenLoginViaLoginButton");
		
		DropDown dropDown = new DropDown(driver);

		dropDown.goToLoginPage();

		Log.info("=== TC007_OpenLoginViaLoginButton Finished ===");
		test.pass("TC007_OpenLoginViaLoginButton PASSED");
	}
	
	@Test
	public void TC023_OpenHistoryViaHistoryButton() {
		Log.info("=== Running: TC023_Open History via History button ===");
		test = ExtentReportManager.createTest("TC023_OpenHistoryViaHistoryButton");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);

		dropDown.goToHistory();

		Log.info("=== TC023_OpenHistoryViaHistoryButton Finished ===");
		test.pass("TC023_OpenHistoryViaHistoryButton PASSED");
	}
	
	@Test
	public void TC024_OpenProfileViaProfileButton() {
		Log.info("=== Running: TC024_Open Profile via Profile button ===");
		test = ExtentReportManager.createTest("TC024_OpenProfileViaProfileButton");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver); 

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);

		dropDown.goToProfile();

		Log.info("=== TC024_OpenProfileViaProfileButton Finished ===");
		test.pass("TC024_OpenProfileViaProfileButton PASSED");
	}
}
