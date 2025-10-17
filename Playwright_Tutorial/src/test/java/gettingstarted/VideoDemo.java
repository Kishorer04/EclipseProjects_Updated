package gettingstarted;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VideoDemo {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setRecordVideoSize(1000,800).setRecordVideoDir(Paths.get("./Videos/")));
        
		Page page = context.newPage();
		
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		page.waitForTimeout(2000);
		
		page.locator("#email1").fill("admin@gmail.com");
		
		page.waitForTimeout(2000);
		
		// To see the path of videos
		String pathOfVideos = page.video().path().toString();
		System.out.println("Video recordings can be checked at this location: "+pathOfVideos);
		
		page.close();
		
		context.close();  // Make sure to close the context, otherwise we wont get the proper recording

	    browser.close();
	}

}
