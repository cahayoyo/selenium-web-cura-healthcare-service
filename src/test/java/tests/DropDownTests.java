package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import org.testng.asserts.SoftAssert;
import pages.DropDown;
import pages.LoginPage;
import utils.Config;
import utils.ExtentReportManager;
import utils.Log;

public class DropDownTests extends BaseTest {

	@Test
	public void TC005_OpenCURAHomeViaCURAHealthCareButton() {
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC005_Open CURA Home via CURA Healthcare button ===");
		test = ExtentReportManager.createTest("TC005_OpenCURAHomeViaCURAHealthCareButton");
		
		DropDown dropDown = new DropDown(driver);
		
		Log.info("Step: Navigate to Login Page first.");
		dropDown.goToLoginPage(softAssert);

		dropDown.goToHomeViaLinkCura(softAssert);

		Log.info("=== TC005_OpenCURAHomeViaCURAHealthCareButton Finished ===");
		test.pass("TC005_OpenCURAHomeViaCURAHealthCareButton PASSED");
	}

	@Test
	public void TC006_OpenCURAHomeViaHomeButton() {
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC006_Open CURA Home via Home button ===");
		test = ExtentReportManager.createTest("TC006_OpenCURAHomeViaHomeButton");

		DropDown dropDown = new DropDown(driver);
		
		Log.info("Step: Navigate to Login Page first.");
		dropDown.goToLoginPage(softAssert);

		dropDown.goToHomeViaHomeButton(softAssert);

		Log.info("=== TC006_OpenCURAHomeViaHomeButton Finished ===");
		test.pass("TC006_OpenCURAHomeViaHomeButton PASSED");
	}
	
	@Test
	public void TC007_OpenLoginViaLoginButton() {
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC007_Open Login via Login button ===");
		test = ExtentReportManager.createTest("TC007_OpenLoginViaLoginButton");
		
		DropDown dropDown = new DropDown(driver);

		dropDown.goToLoginPage(softAssert);

		Log.info("=== TC007_OpenLoginViaLoginButton Finished ===");
		test.pass("TC007_OpenLoginViaLoginButton PASSED");
	}
	
	@Test
	public void TC023_OpenHistoryViaHistoryButton() {
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC023_Open History via History button ===");
		test = ExtentReportManager.createTest("TC023_OpenHistoryViaHistoryButton");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage(softAssert);

		login.verifyLoginPageElements(softAssert);
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD,softAssert);

		dropDown.goToHistory(softAssert);

		Log.info("=== TC023_OpenHistoryViaHistoryButton Finished ===");
		test.pass("TC023_OpenHistoryViaHistoryButton PASSED");
	}
	
	@Test
	public void TC024_OpenProfileViaProfileButton() {
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC024_Open Profile via Profile button ===");
		test = ExtentReportManager.createTest("TC024_OpenProfileViaProfileButton");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver); 

		dropDown.goToLoginPage(softAssert);

		login.verifyLoginPageElements(softAssert);
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD,softAssert);

		dropDown.goToProfile(softAssert);

		Log.info("=== TC024_OpenProfileViaProfileButton Finished ===");
		test.pass("TC024_OpenProfileViaProfileButton PASSED");
	}
}
