package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleAutoSuggestionsUsingIndex {

	public static void main(String[] args) {

		Browser browser = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));

		Page page = browser.newPage();

		page.navigate("https://www.google.com");

		page.locator("xpath=//textarea[@title='Search']").fill("mukesh otwani ");

		page.locator("xpath=//ul[@role='listbox']//li").nth(5).click();

//		page.close();
//		browser.close();

	}

}
