package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tests.dropdown.DropDownTests;
import tests.home.HomeTests;

public class TestRunner {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("=== Browser Opened ===");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		try {
			HomeTests homeTest = new HomeTests();
			DropDownTests dropDownTest = new DropDownTests();
			
			homeTest.TC001_VerifyHomePage(driver);
			System.out.println("-------------------------------------------");
			homeTest.TC002_OpeningCuraFacebook(driver);
			System.out.println("-------------------------------------------");
			homeTest.TC003_OpeningCuraTwitter(driver);
			System.out.println("-------------------------------------------");
			homeTest.TC004_OpeningCuraDribbble(driver);
			System.out.println("-------------------------------------------");
			dropDownTest.TC005_OpenCURAHomeViaCURAHealthCareButton(driver);
			System.out.println("-------------------------------------------");
			dropDownTest.TC006_OpenCURAHomeViaHomeButton(driver);
			System.out.println("-------------------------------------------");
		}catch(Exception e) {
			System.out.println("Error System : " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {}
		}
		driver.quit();
		System.out.println("=== Browser Closed ===");
	}
}
