package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JSExecutor {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		
		Page page = browser.newPage();
		
		page.navigate("https://login.yahoo.com");
		
		System.out.println(page.locator("#persistent").boundingBox().height);
		
		System.out.println(page.locator("#persistent").boundingBox().width);
		
//		page.locator("#persistent").click(); // Normal click did not work bcoz Playwright will click on the element only when the width is 1 or greater than 1
		                                     // Here for this element the width is 0.97. Please find it under Styles section in Chrome Dev Tools 
		                                     // So we can use javascript to perform the actions in these cases
		
		
		// page.evaluate("document.getElementById('persistent').click()");
		
		// or use
		
		Locator checkbox = page.locator("#persistent");
		
		checkbox.evaluate("checkbox => checkbox.click()");
	}
}
