package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleDragAndDrop {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));

		Page page = browser.newPage();
		
		page.navigate("https://jqueryui.com/droppable/");
		
		FrameLocator frameLocator = page.frameLocator(".demo-frame");  // Using frameLocator bcoz in this example the element is present inside an iframe
																	   // Neglect this step if the element is not inside an iframe
		
		// If the element is not inside an iframe, we would've used
//		page.locator("#draggable").dragTo(page.locator("#droppable"));
		
		// Direct approach using dragTo()
		frameLocator.locator("#draggable").dragTo(frameLocator.locator("#droppable"));
		
		// Manual approach
		frameLocator.locator("#draggable").hover();  // If no iframe then this line would be like : page.locator("#draggable").hover();
		
		page.mouse().down();
		
		frameLocator.locator("#droppable").hover();   // If no iframe then this line would be like : page.locator("#droppable").hover();
		
		page.mouse().up();

	}

}
