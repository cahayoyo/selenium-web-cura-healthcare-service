package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;

import utils.Config;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		Log.info("=== Starting WebDriver ===");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.BASE_URL);
		Log.info("=== Browser Opened ===");
		Log.info("=== Navigate URL to " + Config.BASE_URL + " ===");
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.quit();
			Log.info("=== Browser Closed ===");
		}
	}

}
