package pageobjectmodeltest;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import pages.LoginPage;

public class TestUsingPOM {
	
	@Test
	public void login() {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		LoginPage loginPage = new LoginPage(page);
		
		loginPage.loginToApplication("admin@email.com", "admin@123");
		
		// Keep assertions here
	}

}
