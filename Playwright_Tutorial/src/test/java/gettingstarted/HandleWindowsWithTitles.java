package gettingstarted;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleWindowsWithTitles {

	public static void main(String[] args) {

		Browser browser = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));

		BrowserContext context = browser.newContext();

		Page page = context.newPage();

		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		Locator allLinks = page.locator("//div[@class='social']//a");
		
		for(int i=0;i<allLinks.count();i++) {
			allLinks.nth(i).click();
		}
		
		List<Page> allPages = context.pages();
		
		for(Page p:allPages) {
			String title = p.title();
			
			if(title.contains("YouTube")) {
				p.bringToFront();
				p.locator("//input[@name='search_query']").first().fill("kishore");
				break;
			}
		}
		
		// This is in main page
		page.bringToFront();
		
		page.getByPlaceholder("Enter Email").fill("kishore@gmail.com");
		
	    context.close();
	    
	    browser.close();

	}
}
