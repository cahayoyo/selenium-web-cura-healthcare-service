package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Config;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.BASE_URL);
		System.out.println("=== Browser Opened ===");
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.quit();
			System.out.println("=== Browser Closed ===");
		}
	}

}
