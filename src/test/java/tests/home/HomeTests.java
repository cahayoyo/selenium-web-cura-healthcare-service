package tests.home;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.HomePage;
import utils.Config;
import utils.Helper;

public class HomeTests {

    public void TC001_VerifyHomePage(WebDriver driver) {
        System.out.println("=== Running: TC001_VerifyHomePage ===");
        driver.get(Config.BASE_URL);
        
        HomePage home = new HomePage(driver);

        // 1. Verifikasi Header
        Helper.verifyElementEqualsText(home.getH1(), "CURA Healthcare Service", "Header H1");
        Helper.verifyElementEqualsText(home.getH3(), "We Care About Your Health", "Header H3");

        // 2. Verifikasi Button
        Helper.verifyElementEqualsText(home.getBtnMakeAppointment(), "Make Appointment", "Button Make Appointment");
        
        // 3. Verifikasi Footer Utama
        Helper.verifyElementEqualsText(home.getFooterTitle(), "CURA Healthcare Service", "Footer Title");
        
        // 4. Verifikasi Detail Footer (Address, Phone, Email)
        Helper.verifyElementContainsText(home.getFooterAddress(), "Atlanta 550 Pharr Road NE Suite 525", "Footer Address");
        Helper.verifyElementContainsText(home.getFooterPhone(), "(678) 813-1KMS", "Footer Phone");
        Helper.verifyElementEqualsText(home.getFooterEmail(), "info@katalon.com", "Footer Email");
        
        // 5. Verifikasi Logo Sosial Media
        Helper.verifyElementDisplayed(home.getFbIcon(), "Icon Facebook");
        Helper.verifyElementDisplayed(home.getTwitterIcon(), "Icon Twitter");
        Helper.verifyElementDisplayed(home.getDribbbleIcon(), "Icon Dribbble");
        
        // 6. Verifikasi Copyright
        Helper.verifyElementContainsText(home.getFooterCopyright(), "Copyright © CURA Healthcare Service 2026", "Footer Copyright");

        System.out.println("=== TC001 Finished ===");
    }
    
    public void TC002_OpeningCuraFacebook(WebDriver driver) {
    	System.out.println("=== Running: TC002_OpeningCuraFacebook ===");
        driver.get(Config.BASE_URL);
        
        HomePage home = new HomePage(driver);
        home.getFbIcon().click();
        
        // Cukup panggil 1 baris helper
        Helper.verifyContainsUrl(driver, "facebook.com", "Facebook");
        
        System.out.println("=== TC002 Finished ===");
    }
    

    public void TC003_OpeningCuraTwitter(WebDriver driver) {
    	System.out.println("=== Running: TC003_OpeningCuraTwitter ===");
        driver.get(Config.BASE_URL);
        
        HomePage home = new HomePage(driver);
        home.getTwitterIcon().click();
        
        // Panggil helper untuk Twitter
        Helper.verifyContainsUrl(driver, "x.com", "Twitter");
        
        System.out.println("=== TC003 Finished ===");
    }

    
    public void TC004_OpeningCuraDribbble(WebDriver driver) {
    	System.out.println("=== Running: TC004_OpeningCuraDribbble ===");
        driver.get(Config.BASE_URL);
        
        HomePage home = new HomePage(driver);
        home.getDribbbleIcon().click();
        
        // Panggil helper untuk Dribbble
        Helper.verifyContainsUrl(driver, "dribble.com", "Dribble");
        
        System.out.println("=== TC004 Finished ===");
    }
}