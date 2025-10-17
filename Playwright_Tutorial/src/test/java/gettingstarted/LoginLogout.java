package gettingstarted;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class LoginLogout {

	public static void main(String[] args) {
		Browser browser = null;
		Page page = null;
		try {
			browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			page = browser.newPage();
			page.navigate("https://freelance-learn-automation.vercel.app/login");
			
			PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
			
//			page.locator("#email1").fill("admin@email.com"); // # is used to represent id locator/attribute in CSS
			
//			page.locator("xpath=//input[@name='email1']").fill("admin@email.com"); //Xpath locator
			
//			page.locator("css=input[name='email1']").fill("admin@email.com"); //CSS locator
			
			page.getByPlaceholder("Enter Email").fill("admin@email.com"); //Placeholder locator i.e.Placeholder attribute
			
			page.getByPlaceholder("Enter Password").fill("admin@123"); 
			
//			page.getByText("Sign in").click(); // Text locator
			
			//Using this alternate for Sign in since we got "resolved to 2 elements error"
			page.getByText("Sign in").nth(1).click();  // or use page.getByText("Sign in").last().click(); 
			
			page.waitForTimeout(3000);
			
			PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome"); // . is used to represent class locator/attribute in CSS

			page.getByAltText("menu").click(); // Can use this when we have "alt" attribute
			
			page.getByText("Sign out").click();
			
			PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login")); // url should contain "login" keyword
			
			
		} finally {
			page.close();
			browser.close();
		}

	}
}
