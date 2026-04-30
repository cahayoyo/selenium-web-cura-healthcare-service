package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AppointmentPage;
import pages.AppointmentSummaryPage;
import pages.DropDown;
import pages.LoginPage;
import utils.Config;
import utils.ExtentReportManager;
import utils.Log;

public class AppointmentTests extends BaseTest {
	
	@Test
	public void TC_016VerifyAppointmentPage() {
		Log.info("=== Running: TC_016VerifyAppointmentPage Success ===");
		test = ExtentReportManager.createTest("TC_016VerifyAppointmentPage");
		
		DropDown dropDown = new DropDown(driver);
		dropDown.goToLoginPage();
		
		LoginPage login = new LoginPage(driver);
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);
		
		AppointmentPage appointment = new AppointmentPage(driver);
		appointment.verifyAppointmentPageElements();

		Log.info("=== TC_016VerifyAppointmentPage Finished ===");
		test.pass("TC_016VerifyAppointmentPage PASSED");
	}
	
	@Test
	public void TC_017AppointmentSuccess() {
		Log.info("=== Running: TC_017AppointmentSuccess Success ===");
		test = ExtentReportManager.createTest("TC_017AppointmentSuccess");
		
		DropDown dropDown = new DropDown(driver);
		dropDown.goToLoginPage();
		
		LoginPage login = new LoginPage(driver);
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);
		
		AppointmentPage appointment = new AppointmentPage(driver);
		appointment.verifyAppointmentPageElements();
		appointment.fillingFormAppointmentSuccess();

		Log.info("=== TC_017AppointmentSuccess Finished ===");
		test.pass("TC_017AppointmentSuccess PASSED");
	}
	
	@Test
	public void TC_018VerifyAppointmentSummaryPage() {
		Log.info("=== Running: TC_018VerifyAppointmentSummaryPage Success ===");
		test = ExtentReportManager.createTest("TC_018VerifyAppointmentSummaryPage");
		
		DropDown dropDown = new DropDown(driver);
		dropDown.goToLoginPage();
		
		LoginPage login = new LoginPage(driver);
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);
		
		AppointmentPage appointment = new AppointmentPage(driver);
		appointment.verifyAppointmentPageElements();
		appointment.fillingFormAppointmentSuccess();
		
		AppointmentSummaryPage appointmentSummary = new AppointmentSummaryPage(driver);
		appointmentSummary.verifyAppointmentSummaryPageElements();

		Log.info("=== TC_018VerifyAppointmentSummaryPage Finished ===");
		test.pass("TC_018VerifyAppointmentSummaryPage PASSED");
	}
	@Test
	public void TC_019AppointmentFailedEmptyDate() {
		Log.info("=== Running: TC_019AppointmentFailedEmptyDate Success ===");
		test = ExtentReportManager.createTest("TC_019AppointmentFailedEmptyDate");
		
		DropDown dropDown = new DropDown(driver);
		dropDown.goToLoginPage();
		
		LoginPage login = new LoginPage(driver);
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);
		
		AppointmentPage appointment = new AppointmentPage(driver);
		appointment.verifyAppointmentPageElements();
		appointment.fillingFormAppointmentFailedEmptyDate();

		Log.info("=== TC_019AppointmentFailedEmptyDate Finished ===");
		test.pass("TC_019AppointmentFailedEmptyDate PASSED");
	}
	
	@Test
	public void TC_020AppointmentFailedInvalidDate() {
		Log.info("=== Running: TC_020AppointmentFailedInvalidDate Success ===");
		test = ExtentReportManager.createTest("TC_020AppointmentFailedInvalidDate");
		
		DropDown dropDown = new DropDown(driver);
		dropDown.goToLoginPage();
		
		LoginPage login = new LoginPage(driver);
		login.loginSuccess(Config.USERNAME, Config.PASSWORD);
		
		AppointmentPage appointment = new AppointmentPage(driver);
		appointment.verifyAppointmentPageElements();
		appointment.fillingFormAppointmentFailedInvalidDate();

		Log.info("=== TC_020AppointmentFailedInvalidDate Finished ===");
		test.pass("TC_020AppointmentFailedInvalidDate PASSED");
	}

}
