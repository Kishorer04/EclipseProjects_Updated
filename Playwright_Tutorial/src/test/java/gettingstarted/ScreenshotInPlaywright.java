package gettingstarted;

import java.nio.file.Paths;
import java.util.Base64;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ScreenshotInPlaywright {

	public static void main(String[] args) {
		
	Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	
	Page page = browser.newPage();
	
	page.navigate("https://www.linkedin.com");
	
	// byte[] arr = page.screenshot();   // Return type is byte[]...bcoz when we work with Extent/Allure reports it might require
	                                     // screenshot in byte[] type or Base64 type. This is just for reference
	
	// Visible page screenshot
	page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/Screenshot1.png")));
	
	// Complete page screenshot
	byte[] arr = page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("./Screenshots/Screenshot2.png")));
	
	System.out.println(Base64.getEncoder().encodeToString(arr));
	
	// Particular element screenshot
    // If the complete path is not given, by default it will store the screenshot in the current project
	page.locator("//a[normalize-space(text())='Sign in']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./Screenshots/ElementScreenshot.png")));

	}

}
