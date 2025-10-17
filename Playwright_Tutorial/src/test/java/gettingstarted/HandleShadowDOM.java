package gettingstarted;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleShadowDOM {

	public static void main(String[] args) {
		 
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
		
		Page page = browser.newPage();
		
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		
//		XPath is not allowed for Shadow DOM
//		Always use CSS
		
		// Make sure Shadow root is open. We cannot automate if the Shadow root is closed. Automation is not feasible
		
		// We don't have any dedicated method to switch to Shadow DOM and do the actions. Playwright automatically switches
		// and it will automatically perform actions using the concept called Auto-Piercing
		/*
		Locator shadowRoot = page.locator("div#userName");
		
		Locator element = shadowRoot.locator("#kils");
		
		element.fill("Kishore");
		*/
		
		// One liner (Use space between CSS selectors)
		page.locator("#userName #kils").fill("Kishore");
	}
}
