package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import org.testng.asserts.SoftAssert;
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
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC021_VerifyHistoryPage History via History button ===");
		test = ExtentReportManager.createTest("TC021_VerifyHistoryPage");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage(softAssert);

		login.verifyLoginPageElements(softAssert);
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD, softAssert);

		dropDown.goToHistory(softAssert);
		
		HistoryPage history = new HistoryPage(driver);
		
		history.verifyHistoryPageElements(softAssert);

		Log.info("=== TC021_VerifyHistoryPage Finished ===");
		test.pass("TC021_VerifyHistoryPage PASSED");
	}
	
	@Test
	public void TC022_VerifyHistoryPageAfterMakingAppointment() {
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC022_VerifyHistoryPageAfterMakingAppointment History via History button ===");
		test = ExtentReportManager.createTest("TC022_VerifyHistoryPageAfterMakingAppointment");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage(softAssert);

		login.verifyLoginPageElements(softAssert);
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD, softAssert);
		
		AppointmentPage appointment = new AppointmentPage(driver);
		appointment.verifyAppointmentPageElements(softAssert);
		appointment.fillingFormAppointmentSuccess(softAssert);

		dropDown.goToHistory(softAssert);
		
		HistoryPage history = new HistoryPage(driver);
		
		history.verifyHistoryPageElementsAfterMakingAppointment(softAssert);

		Log.info("=== TC022_VerifyHistoryPageAfterMakingAppointment Finished ===");
		test.pass("TC022_VerifyHistoryPageAfterMakingAppointment PASSED");
	}
	
	@Test
	public void TC025_OpenHomePageViaHistoryPage() {
        SoftAssert softAssert = new SoftAssert();

		Log.info("=== Running: TC025_OpenHomePageViaHistoryPage History via History button ===");
		test = ExtentReportManager.createTest("TC025_OpenHomePageViaHistoryPage");
		
		DropDown dropDown = new DropDown(driver);
		LoginPage login = new LoginPage(driver);

		dropDown.goToLoginPage(softAssert);

		login.verifyLoginPageElements(softAssert);
		
		login.loginSuccess(Config.USERNAME, Config.PASSWORD,softAssert);

		dropDown.goToHistory(softAssert);
		
		HistoryPage history = new HistoryPage(driver);
		
		history.verifyHistoryPageElements(softAssert);
		history.clickButtonGoToHomepage(softAssert);

		Log.info("=== TC025_OpenHomePageViaHistoryPage Finished ===");
		test.pass("TC025_OpenHomePageViaHistoryPage PASSED");
	}
}
