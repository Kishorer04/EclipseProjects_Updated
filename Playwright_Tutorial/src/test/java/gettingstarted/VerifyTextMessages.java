package gettingstarted;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class VerifyTextMessages {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
		
		Page page= browser.newPage();
		
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		page.locator(".submit-btn").click();
		
		String expected= "Email and Password is required";
		
		String msgViaTextContent = page.locator(".errorMessage").textContent(); // Get the text 1st approach
		
		Assert.assertEquals(msgViaTextContent, expected);
		
		Assert.assertTrue(msgViaTextContent.contains("Password is required"));
		
		
		/*
		System.out.println("Error msg via textContent "+msgViaTextContent);
		
		String msgViaInnerText = page.locator(".errorMessage").innerText(); // Get the text 2nd approach
		
		System.out.println("Error msg via innerText "+ msgViaInnerText);
		
		String msgViaJS = (String) page.evaluate("document.getElementsByClassName('errorMessage')[0].textContent"); // Get the text 3rd approach using JS
		
		System.out.println("Error msg via JS "+ msgViaJS);
		*/
		
		page.close();
		
		browser.close();

	}

}
