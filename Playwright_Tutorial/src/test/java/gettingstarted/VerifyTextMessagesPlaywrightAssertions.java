package gettingstarted;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;


public class VerifyTextMessagesPlaywrightAssertions {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
		
		Page page= browser.newPage();
		
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		page.locator(".submit-btn").click();
		
		PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText("Email and Password is required");
		
		PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText(Pattern.compile("required")); // Can use Pattern as well if we want to go with the partial match
		
		page.close();
		
		browser.close();

	}

}
