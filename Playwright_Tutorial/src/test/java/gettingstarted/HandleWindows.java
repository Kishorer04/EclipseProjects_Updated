package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleWindows {

	public static void main(String[] args) {

		Browser browser = Playwright.create().chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));

		BrowserContext context = browser.newContext();

		Page page = context.newPage();

		page.navigate("https://freelance-learn-automation.vercel.app/login");

		Page newPage = context.waitForPage(() -> {
			page.locator("//a[contains(@href,'youtube')]").last().click(); // Can use nth() and specify the index,
																			// instead of first() or last()
																			// Within waitForPage() write the step which
																			// actually brings the new page/tab or window
		});

		// "newPage" reference is used to act on the new page (youtube in our example)
		// "page" reference is used to act on the old page
		newPage.locator("//input[@name='search_query']").fill("Kishore");

		page.bringToFront(); // This method is used to bring the visibility of the page in the browser

		newPage.bringToFront();

		page.bringToFront();

		newPage.bringToFront();
		
		newPage.close();
		
		page.close();
		
		context.close();
		
		browser.close();

	}
}
