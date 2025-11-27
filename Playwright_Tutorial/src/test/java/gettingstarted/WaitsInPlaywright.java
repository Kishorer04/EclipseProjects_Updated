package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitForSelectorState;

public class WaitsInPlaywright {
	
	public static void main(String[] args) {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		
		Page page = browser.newPage();
		
		// Default timeout is 30 seconds. But we can override the wait time
		page.navigate("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html", new Page.NavigateOptions().setTimeout(60000)); // Max it will wait for 60 seconds to load the page. This wait is only for navigation
	
	    // or use
		// page.setDefaultNavigationTimeout(60000);  // This wait is also only for navigation
		
		//default wait 30 seconds
		page.locator("//button[text()='Click me to start timer']").click();
		
		// This wait is common for all the WebElements. Overriding the default 30 seconds wait time to 5 seconds
		page.setDefaultTimeout(5000);
		
		// This wait is particular to this WebElement. Can use waitFor() according to our purpose and condition
		page.locator("//p[text()='WebDriver']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE).setTimeout(20000));
		
		System.out.println("Is visible? "+page.locator("//p[text()='WebDriver']").isVisible());
		
		// This is just another wait example
		page.waitForLoadState(LoadState.NETWORKIDLE);
		
		// This is hard-coded wait similar to Thread.sleep()
		page.waitForTimeout(2000);
		
		page.close();
		
		browser.close();
	}

}
