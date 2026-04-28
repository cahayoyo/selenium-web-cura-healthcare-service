package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {
	
	public static void verifyElementContainsText(WebElement element, String expectedText, String elementName) {
		try {
	        if (element.isDisplayed() && element.getText().contains(expectedText)) {
	            System.out.println("[PASS] " + elementName + " contains correct info.");
	        } else {
	            System.out.println("[FAIL] " + elementName + " does not contain: " + expectedText + " Actual : " + element.getText());
	        }
	    } catch (Exception e) {
	        System.out.println("[FAIL] " + elementName + " error: " + e.getMessage());
	    }
	}
	
	public static void verifyElementEqualsText(WebElement element, String expectedText, String elementName) {
		try {
			if (element.isDisplayed() && element.getText().equals(expectedText)) {
				System.out.println("[PASS] " + elementName + " is correct.");
			} else {
				System.out.println("[FAILED] " + elementName + " is incorrect. Actual : " + element.getText());
			}
		}catch(Exception e) {
			System.out.println("[FAIL] " + elementName + " not found or error: " + e.getMessage());
		}
		
	}
	
	public static void verifyElementDisplayed(WebElement element, String elementName) {
        try {
            if (element.isDisplayed()) {
                System.out.println("[PASS] " + elementName + " is displayed.");
            } else {
                System.out.println("[FAIL] " + elementName + " is NOT displayed.");
            }
        } catch (Exception e) {
            System.out.println("[FAIL] " + elementName + " not found or error: " + e.getMessage());
        }
    }
	
	public static void verifyCurrentUrl(WebDriver driver, String expectedUrl, String platformName) {
        try {
        	String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl)) {
                System.out.println("[PASS] - Redirected to " + platformName + ".");
            } else {
                System.out.println("[FAIL] - Not redirected to " + platformName + ".");
                System.out.println("Actual URL   : " + actualUrl);
                System.out.println("Expected URL : " + expectedUrl);
            }
        }catch(Exception e) {
        	System.out.println("[FAIL] - Error while verifying URL for " + platformName + ": " + e.getMessage());
        }
		
    }
	
}
