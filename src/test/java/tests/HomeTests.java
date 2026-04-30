package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import utils.ExtentReportManager;
import utils.Helper;
import utils.Log;

public class HomeTests extends BaseTest {

	@Test
    public void TC001_VerifyHomePage() {
        Log.info("=== Running: TC001_VerifyHomePage ===");
        test = ExtentReportManager.createTest("TC001_VerifyHomePage");
        
        HomePage home = new HomePage(driver);

        Helper.verifyElementEqualsText(home.getH1(), "CURA Healthcare Service", "Header H1");
        test.info("Verifying Header H1");
        Helper.verifyElementEqualsText(home.getH3(), "We Care About Your Health", "Header H3");
        test.info("Verifying Header H3");

        Helper.verifyElementEqualsText(home.getBtnMakeAppointment(), "Make Appointment", "Button Make Appointment");
        test.info("Verifying Button Make Appointment");

        Helper.verifyElementEqualsText(home.getFooterTitle(), "CURA Healthcare Service", "Footer Title");
        test.info("Verifying Footer CURA");

        Helper.verifyElementContainsText(home.getFooterAddress(), "Atlanta 550 Pharr Road NE Suite 525", "Footer Address");
        test.info("Verifying Footer Address");
        Helper.verifyElementContainsText(home.getFooterPhone(), "(678) 813-1KMS", "Footer Phone");
        test.info("Verifying Footer Phone");
        Helper.verifyElementEqualsText(home.getFooterEmail(), "info@katalon.com", "Footer Email");
        test.info("Verifying Footer Email");

        Helper.verifyElementDisplayed(home.getFbIcon(), "Icon Facebook");
        test.info("Verifying Icon Facebook");
        Helper.verifyElementDisplayed(home.getTwitterIcon(), "Icon X");
        test.info("Verifying Icon X");
        Helper.verifyElementDisplayed(home.getDribbbleIcon(), "Icon Dribbble");
        test.info("Verifying Icon Dribble");

        Helper.verifyElementContainsText(home.getFooterCopyright(), "CURA Healthcare Service 2026", "Footer Copyright");
        test.info("Verifying Footer Copyright");

        Log.info("=== TC001 Finished ===");
        test.pass("TC001 PASSED");

    }
    
	@Test
    public void TC002_OpeningCuraFacebook() {
		Log.info("=== Running: TC002_OpeningCuraFacebook ===");
		test = ExtentReportManager.createTest("TC002_OpeningCuraFacebook");
        
        HomePage home = new HomePage(driver);
        home.getFbIcon().click();

        Helper.verifyContainsUrl(driver, "facebook.com", "Facebook");
        
        Log.info("=== TC002 Finished ===");
    }
    
	@Test
    public void TC003_OpeningCuraTwitter() {
		Log.info("=== Running: TC003_OpeningCuraTwitter ===");
		test = ExtentReportManager.createTest("TC003_OpeningCuraTwitter");
        
        HomePage home = new HomePage(driver);
        home.getTwitterIcon().click();

        Helper.verifyContainsUrl(driver, "x.com", "Twitter");
        
        Log.info("=== TC003 Finished ===");
    }

	@Test
    public void TC004_OpeningCuraDribbble() {
		Log.info("=== Running: TC004_OpeningCuraDribbble ===");
		test = ExtentReportManager.createTest("TC004_OpeningCuraDribbble");
        
        HomePage home = new HomePage(driver);
        home.getDribbbleIcon().click();

        Helper.verifyContainsUrl(driver, "dribble.com", "Dribble");
        
        Log.info("=== TC004 Finished ===");
    }
}
