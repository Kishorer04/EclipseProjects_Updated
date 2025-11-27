package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleSlider {

	public static void main(String[] args) {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));

		Page page = browser.newPage();
		
		page.navigate("https://jqueryui.com/slider");
		
		FrameLocator frameLocator = page.frameLocator(".demo-frame");  // Using frameLocator bcoz in this example the slider/element is present inside an iframe
		                                                               // Neglect this step if the element is not inside an iframe
		
		Locator sliderLocator = frameLocator.locator("//span[contains(@class,'ui-slider-handle')]");
		
		// If the element is not inside an iframe, we would've used
//		Locator sliderLocator = page.locator("//span[contains(@class,'ui-slider-handle')]");
		
		
		sliderLocator.focus(); // To focus on the slider/element
		
		for(int i=0;i<10;i++)
		{
			page.keyboard().press("ArrowRight");
		}

	}

}
