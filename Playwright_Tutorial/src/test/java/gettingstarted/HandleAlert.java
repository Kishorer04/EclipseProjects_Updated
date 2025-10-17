package gettingstarted;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleAlert {

	public static void main(String[] args) {
		
	Browser browser =	Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	
	Page page = browser.newPage();
	
	page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
	
	// Normal alert with only "OK" button in it
	// Have to use "onDialog()" before the action that triggers the actual alert. This is used to register the alert before the trigger and handle it either by
	//accepting, dismissing or fetching text from the alert.
	
	page.onDialog(dialog->{                  
		String msg = dialog.message();
		System.out.println("Dialog text is "+msg);
		Assert.assertTrue(msg.contains("I am a JS Alert"));
		dialog.accept();     		
	});
	
	page.locator("//button[normalize-space()='Click for JS Alert']").click();

	}

}
