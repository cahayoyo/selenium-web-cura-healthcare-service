package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import utils.ExtentReportManager;
import utils.Log;

public class HomeTests extends BaseTest {

	@Test
    public void TC001_VerifyHomePage() {
        Log.info("=== Running: TC001_VerifyHomePage ===");
        test = ExtentReportManager.createTest("TC001_VerifyHomePage");
        
        HomePage home = new HomePage(driver);
        
        home.verifyHomePageElements();
        
        Log.info("=== TC001_VerifyHomePage Finished ===");
        test.pass("TC001_VerifyHomePage PASSED");
    }
    
	@Test
    public void TC002_OpeningCuraFacebook() {
		Log.info("=== Running: TC002_OpeningCuraFacebook ===");
		test = ExtentReportManager.createTest("TC002_OpeningCuraFacebook");
        
        HomePage home = new HomePage(driver);
        home.clickFacebook();

        Log.info("=== TC002_OpeningCuraFacebook Finished ===");
        test.pass("TC002_OpeningCuraFacebook PASSED");
    }
    
	@Test
    public void TC003_OpeningCuraTwitter() {
		Log.info("=== Running: TC003_OpeningCuraTwitter ===");
		test = ExtentReportManager.createTest("TC003_OpeningCuraTwitter");
        
        HomePage home = new HomePage(driver);
        home.clickX();
        
        Log.info("=== TC003_OpeningCuraTwitter Finished ===");
        test.pass("TC003_OpeningCuraTwitter PASSED");
    }

	@Test
    public void TC004_OpeningCuraDribbble() {
		Log.info("=== Running: TC004_OpeningCuraDribbble ===");
		test = ExtentReportManager.createTest("TC004_OpeningCuraDribbble");
        
        HomePage home = new HomePage(driver);
        home.clickDribble();
        
        Log.info("=== TC004_OpeningCuraDribbble Finished ===");
        test.pass("TC004_OpeningCuraDribbble PASSED");
    }
}
