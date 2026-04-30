package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AppointmentPage;
import pages.DropDown;
import pages.HistoryPage;
import pages.LoginPage;
import utils.Config;
import utils.ExtentReportManager;
import utils.Log;

public class HistoryTests extends BaseTest {

	@Test
	public void TC021_VerifyHistoryPage() {
		Log.info("=== Running: TC021_VerifyHistoryPage History via History button ===");
		test = ExtentReportManager.createTest("TC021_VerifyHistoryPage");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);

		dropDown.goToHistory();
		
		HistoryPage history = new HistoryPage(driver);
		
		history.verifyHistoryPageElements();

		Log.info("=== TC021_VerifyHistoryPage Finished ===");
		test.pass("TC021_VerifyHistoryPage PASSED");
	}
	
	@Test
	public void TC022_VerifyHistoryPageAfterMakingAppointment() {
		Log.info("=== Running: TC022_VerifyHistoryPageAfterMakingAppointment History via History button ===");
		test = ExtentReportManager.createTest("TC022_VerifyHistoryPageAfterMakingAppointment");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);
		
		AppointmentPage appointment = new AppointmentPage(driver);
		appointment.verifyAppointmentPageElements();
		appointment.fillingFormAppointmentSuccess();

		dropDown.goToHistory();
		
		HistoryPage history = new HistoryPage(driver);
		
		history.verifyHistoryPageElementsAfterMakingAppointment();

		Log.info("=== TC022_VerifyHistoryPageAfterMakingAppointment Finished ===");
		test.pass("TC022_VerifyHistoryPageAfterMakingAppointment PASSED");
	}
	
	@Test
	public void TC025_OpenHomePageViaHistoryPage() {
		Log.info("=== Running: TC025_OpenHomePageViaHistoryPage History via History button ===");
		test = ExtentReportManager.createTest("TC025_OpenHomePageViaHistoryPage");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage();

		login.verifyLoginPageElements();
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);

		dropDown.goToHistory();
		
		HistoryPage history = new HistoryPage(driver);
		
		history.verifyHistoryPageElements();
		history.clickButtonGoToHomepage();

		Log.info("=== TC025_OpenHomePageViaHistoryPage Finished ===");
		test.pass("TC025_OpenHomePageViaHistoryPage PASSED");
	}
}
