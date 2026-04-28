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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			HomeTests HomeTest = new HomeTests();
			DropDownTests DropDownTest = new DropDownTests();
			
//			HomeTest.TC001_VerifyHomePage(driver);
//			System.out.println("-------------------------------------------");
//			HomeTest.TC002_OpeningCuraFacebook(driver);
//			System.out.println("-------------------------------------------");
//			HomeTest.TC003_OpeningCuraTwitter(driver);
//			System.out.println("-------------------------------------------");
//			HomeTest.TC004_OpeningCuraDribbble(driver);
//			System.out.println("-------------------------------------------");
			DropDownTest.TC005_VerifyBackToHomeViaBrandButton(driver);
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
