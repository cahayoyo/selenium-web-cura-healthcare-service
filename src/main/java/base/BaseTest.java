package base;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import utils.Log;

import utils.Config;
import utils.ExtentReportManager;

public class BaseTest {
	protected WebDriver driver;
	protected static ExtentReports extent;
	protected ExtentTest test;
	
	@BeforeSuite
	public void setUpReport() {
		extent = ExtentReportManager.getReportInstance();
	}
	
	@BeforeMethod
	public void setUp(Method method) {
		Log.info("=== Starting WebDriver ===");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.BASE_URL);
		Log.info("=== Browser Opened ===");
		Log.info("=== Navigate URL to " + Config.BASE_URL + " ===");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			String screenshotPath = ExtentReportManager.captureScreenshot(driver, "DEFECT");
			test.fail("TC Failed - Check Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		}else if(result.getStatus() == ITestResult.SUCCESS) {
			String screenshotPath = ExtentReportManager.captureScreenshot(driver, "PASSED");
			test.info("TC Failed - Check Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		}
		
		if(driver != null) {
			driver.quit();
			Log.info("=== Browser Closed ===");
		}
	}
	
	@AfterSuite
	public void tearDownReport() {
		extent.flush();
	}

}
