package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropDown;
import pages.LoginPage;
import utils.Config;
import utils.ExtentReportManager;
import utils.Log;

public class AuthTests extends BaseTest {

	@Test
	public void TC008_VerifyLoginPage() {
		Log.info("=== Running: TC008_Verify Login Page ===");
		test = ExtentReportManager.createTest("TC008_VerifyLoginPage");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		Log.info("=== TC008_VerifyLoginPage Finished ===");
		test.pass("TC008_VerifyLoginPage PASSED");
	}
	
	@Test
	public void TC009_LoginSuccess() {
		Log.info("=== Running: TC009_Login Success ===");
		test = ExtentReportManager.createTest("TC009_LoginSuccess");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);

		Log.info("=== TC009_LoginSuccess Finished ===");
		test.pass("TC009_LoginSuccess PASSED");
	}
	
	@Test
	public void TC010_LogoutSuccess() {
		Log.info("=== Running: TC010_Logout Success ===");
		test = ExtentReportManager.createTest("TC010_LogoutSuccess");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);
		
		dropDown.goLogout();

		Log.info("=== TC010_LogoutSuccess Finished ===");
		test.pass("TC010_LogoutSuccess PASSED");
	}
	
	@Test
	public void TC011_LoginFailedWrongUsername() {
		Log.info("=== Running: TC011_LoginFailedWrongUsername Success ===");
		test = ExtentReportManager.createTest("TC011_LoginFailedWrongUsername");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginFailed("WrongUsername", Config.PASSWORD);

		Log.info("=== TC011_LoginFailedWrongUsername Finished ===");
		test.pass("TC011_LoginFailedWrongUsername PASSED");
	}
	
	@Test
	public void TC012_LoginFailedWrongPassword() {
		Log.info("=== Running: TC012_LoginFailedWrongPassword Success ===");
		test = ExtentReportManager.createTest("TC012_LoginFailedWrongPassword");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginFailed(Config.USERNAME, "WrongPassword");

		Log.info("=== TC012_LoginFailedWrongPassword Finished ===");
		test.pass("TC012_LoginFailedWrongPassword PASSED");
	}
	
	@Test
	public void TC013_LoginFailedEmptyUsername() {
		Log.info("=== Running: TC013_LoginFailedEmptyUsername Success ===");
		test = ExtentReportManager.createTest("TC013_LoginFailedEmptyUsername");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginFailed("", Config.PASSWORD);

		Log.info("=== TC013_LoginFailedEmptyUsername Finished ===");
		test.pass("TC013_LoginFailedEmptyUsername PASSED");
	}
	
	@Test
	public void TC014_LoginFailedEmptyPassword() {
		Log.info("=== Running: TC014_LoginFailedEmptyPassword Success ===");
		test = ExtentReportManager.createTest("TC014_LoginFailedEmptyPassword");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginFailed(Config.USERNAME, "");

		Log.info("=== TC014_LoginFailedEmptyPassword Finished ===");
		test.pass("TC014_LoginFailedEmptyPassword PASSED");
	}
	
	@Test
	public void TC015_LoginFailedEmptyCredentials() {
		Log.info("=== Running: TC015_LoginFailedEmptyCredentials Success ===");
		test = ExtentReportManager.createTest("TC015_LoginFailedEmptyCredentials");

		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginFailed("", "");

		Log.info("=== TC015_LoginFailedEmptyCredentials Finished ===");
		test.pass("TC015_LoginFailedEmptyCredentials PASSED");
	}
}
