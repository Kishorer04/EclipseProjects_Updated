package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleSSLCertificate {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		
		NewContextOptions contextOptions = new Browser.NewContextOptions();
		
		contextOptions.setIgnoreHTTPSErrors(true);
		
		BrowserContext context = browser.newContext(contextOptions);
		
		Page page = context.newPage();
		
		page.navigate("https://expired.badssl.com/");

	}

}
