package gettingstarted;
import java.util.List;
import java.util.regex.Pattern;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleIFrames {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		
		Page page = browser.newPage();
		
		page.navigate("https://demo.automationtesting.in/Frames.html");
		
		// The tag in the html dom can be 'iframe' or 'frame' also sometimes. It depends on the webpage
		
		page.locator("//a[normalize-space(text())='Single Iframe']").click();
		
		List<Frame> allIFrames = page.frames();
		
		System.out.println("Total number of IFrames "+allIFrames.size());
		
		// Using frameLocator() method
		FrameLocator frame = page.frameLocator("//iframe[@id='singleframe']");
		
		frame.locator("//input[@type='text']").nth(0).fill("Kishore Test");
		
		/*
        // Using frame() or frameByUrl() method
		// Use frame() only when we have proper name for the iframe
		Frame newFrame =page.frameByUrl(Pattern.compile(".*SingleFrame.*")); //regex used here
		
		newFrame.locator("//input[@type='text']").fill("Kishore Test");
		*/
	}
}
