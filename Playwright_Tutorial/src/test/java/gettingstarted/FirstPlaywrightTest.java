package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstPlaywrightTest {

	public static void main(String[] args) {
		
	Playwright pw = Playwright.create();
	BrowserType browserType = pw.chromium(); // This will open chromium browser
//	BrowserType browserType = pw.firefox(); 
//	BrowserType browserType = pw.webkit();
	
//	Browser browser = browserType.launch(); // By default Playwright will run in Headless mode
	Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome")); // This will open chrome browser
	Page page = browser.newPage();
	page.navigate("https://playwright.dev/");
	String title = page.title();
	System.out.println("Title is: "+title);
	page.close();
	browser.close();
	pw.close();
	}

}
