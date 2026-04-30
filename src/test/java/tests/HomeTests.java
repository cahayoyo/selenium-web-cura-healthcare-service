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
        
        home.verifyHomePageElements();
        
        Log.info("=== TC001 Finished ===");
        test.pass("TC001 PASSED");
    }
    
	@Test
    public void TC002_OpeningCuraFacebook() {
		Log.info("=== Running: TC002_OpeningCuraFacebook ===");
		test = ExtentReportManager.createTest("TC002_OpeningCuraFacebook");
        
        HomePage home = new HomePage(driver);
        home.clickFacebook();

        Helper.verifyContainsUrl(driver, "facebook.com", "Facebook");
        
        Log.info("=== TC002 Finished ===");
        test.pass("TC002 PASSED");
    }
    
	@Test
    public void TC003_OpeningCuraTwitter() {
		Log.info("=== Running: TC003_OpeningCuraTwitter ===");
		test = ExtentReportManager.createTest("TC003_OpeningCuraTwitter");
        
        HomePage home = new HomePage(driver);
        home.clickX();

        Helper.verifyContainsUrl(driver, "x.com", "Twitter");
        
        Log.info("=== TC003 Finished ===");
        test.pass("TC003 PASSED");
    }

	@Test
    public void TC004_OpeningCuraDribbble() {
		Log.info("=== Running: TC004_OpeningCuraDribbble ===");
		test = ExtentReportManager.createTest("TC004_OpeningCuraDribbble");
        
        HomePage home = new HomePage(driver);
        home.clickDribble();

        Helper.verifyContainsUrl(driver, "dribble.com", "Dribble");
        
        Log.info("=== TC004 Finished ===");
        test.pass("TC004 PASSED");
    }
}
