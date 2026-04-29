package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	public static void verifyElementContainsText(WebElement element, String expectedText, String elementName) {
		try {
	        if (element.isDisplayed() && element.getText().contains(expectedText)) {
	            Log.info("[PASS] " + elementName + " contains correct info.");
	        } else {
	            Log.error("[FAIL] " + elementName + " does not contain: " + expectedText + " Actual : " + element.getText());
	        }
	    } catch (Exception e) {
	        Log.error("[FAIL] " + elementName + " error: " + e.getMessage());
	    }
	}
	
	public static void verifyElementEqualsText(WebElement element, String expectedText, String elementName) {
		try {
			if (element.isDisplayed() && element.getText().equals(expectedText)) {
				Log.info("[PASS] " + elementName + " is correct.");
			} else {
				Log.error("[FAILED] " + elementName + " is incorrect. Actual : " + element.getText());
			}
		}catch(Exception e) {
			Log.error("[FAIL] " + elementName + " not found or error: " + e.getMessage());
		}
		
	}
	
	public static void verifyElementDisplayed(WebElement element, String elementName) {
        try {
            if (element.isDisplayed()) {
                Log.info("[PASS] " + elementName + " is displayed.");
            } else {
                Log.error("[FAIL] " + elementName + " is NOT displayed.");
            }
        } catch (Exception e) {
            Log.error("[FAIL] " + elementName + " not found or error: " + e.getMessage());
        }
    }
	
	public static void verifyEqualsUrl(WebDriver driver, String expectedUrl, String platformName) {
        try {
        	String actualUrl = driver.getCurrentUrl();
            if (actualUrl.equals(expectedUrl)) {
                Log.info("[PASS] - Redirected to " + platformName + ".");
            } else {
                Log.error("[FAIL] - Not redirected to " + platformName + ".");
                Log.error("Actual URL   : " + actualUrl);
                Log.error("Expected URL : " + expectedUrl);
            }
        }catch(Exception e) {
        	Log.error("[FAIL] - Error while verifying URL for " + platformName + ": " + e.getMessage());
        }
		
    }
	
	public static void verifyContainsUrl(WebDriver driver, String expectedUrl, String platformName) {
        try {
        	String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl)) {
                Log.info("[PASS] - Redirected to " + platformName + ".");
            } else {
                Log.error("[FAIL] - Not redirected to " + platformName + ".");
                Log.error("Actual URL   : " + actualUrl);
                Log.error("Expected URL Contains : " + expectedUrl);
            }
        }catch(Exception e) {
        	Log.error("[FAIL] - Error while verifying URL for " + platformName + ": " + e.getMessage());
        }
		
    }
	
	public static void waitUrlContains(WebDriver driver, String text, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.urlContains(text));
	}
	
	public static void waitVisible(WebDriver driver, WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitClickable(WebDriver driver, WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
}
