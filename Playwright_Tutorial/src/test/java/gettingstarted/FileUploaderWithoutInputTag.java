package gettingstarted;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileUploaderWithoutInputTag {

	public static void main(String[] args) throws InterruptedException {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();

		page.navigate("https://the-internet.herokuapp.com/upload");
		
		FileChooser fileChooser = page.waitForFileChooser(()->page.locator("#drag-drop-upload").click());
		
		//fileChooser.setFiles(Path.of("./files/ScreenshotImage.png"));
		
//		(or)
//		fileChooser.setFiles(Paths.get("./files/ScreenshotImage.png"));
		
		// Use array when we have multiple files to upload
		
		Path[] filesToUpload = {
				Path.of("./files/ScreenshotImage.png"),
				Path.of("./files/ScreenshotImage.png")
		};
		
		fileChooser.setFiles(filesToUpload);
		
	}

}
