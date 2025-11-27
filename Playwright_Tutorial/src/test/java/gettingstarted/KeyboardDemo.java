package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class KeyboardDemo {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));

		Page page = browser.newPage();
		
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		page.locator("#email1").fill("admin@email.com");
		
		page.keyboard().press("Control+A");  // Can use small 'a' also
		
		page.keyboard().press("Control+C");
		
		page.keyboard().press("Tab");
		
		page.keyboard().press("Control+V");
		
//		page.keyboard().down("Control");
//		
//		page.keyboard().press("V");
//		
//		page.keyboard().up("Control");
	}
}
