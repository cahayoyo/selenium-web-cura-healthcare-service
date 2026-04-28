package tests.dropdown;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import utils.Helper;

public class DropDownTests {
	public void TC005_VerifyBackToHomeViaBrandButton(WebDriver driver) {
        System.out.println("=== Running: TC005_Open CURA Home via CURA Healthcare button ===");
        
        // 1. Pergi ke halaman lain dulu agar bisa tes "kembali ke home"
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        System.out.println("Step: Navigate to Login Page first.");

        HomePage home = new HomePage(driver);
        
        // 2. Klik tombol sidebar (untuk memunculkan linknya jika ada di sidebar)
        try {
        	home.clickMenuToggle();
            System.out.println("Step: Clicked Menu Toggle.");
            
            Thread.sleep(500);
            
            home.clickCuraHealthCare();
            System.out.println("Step: Clicked 'CURA Healthcare' brand button.");
        } catch (Exception e) {
            System.out.println("Retrying: Clicking brand button directly...");
            home.clickMenuToggle();
            home.clickCuraHealthCare();
        }

        // 3. Verifikasi kembali ke Home URL
        String expectedHomeUrl = "https://katalon-demo-cura.herokuapp.com/";
        Helper.verifyCurrentUrl(driver, expectedHomeUrl, "CURA Home via Brand Button");

        // 4. Verifikasi elemen khas Home (Header H1) muncul lagi
        Helper.verifyElementEqualsText(home.getH1(), "CURA Healthcare Service", "Header H1 after redirection");

        System.out.println("=== TC005 Finished ===");
    }
}
