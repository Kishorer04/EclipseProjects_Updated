package gettingstarted;

import java.nio.file.Path;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileUploader {

	public static void main(String[] args) throws InterruptedException {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();

		page.navigate("https://the-internet.herokuapp.com/upload");
		
		// The upload button/element tag is "input" and type=file. For more details refer the screenshot
		
		// page.locator("#file-upload").setInputFiles(Path.of(System.getProperty("user.dir")+"/files/ScreenshotImage.png"));

		/*
		 Use array when we have multiple files to upload 
		 
		Path[] files = { 
				Path.of(System.getProperty("user.dir") + "/files/ScreenshotImage.png") 
				};
		 */

		// page.locator("#file-upload").setInputFiles(files);

		page.locator("#file-upload").setInputFiles(new Path[]
				{
						Path.of(System.getProperty("user.dir")+"/files/ScreenshotImage.png")
				});
		
		Thread.sleep(3000);
		
		// This is to remove the uploaded file
		page.locator("#file-upload").setInputFiles(new Path[0]);

	}

}
