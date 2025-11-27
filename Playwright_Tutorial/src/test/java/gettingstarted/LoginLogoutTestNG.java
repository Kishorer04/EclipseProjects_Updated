package gettingstarted;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginLogoutTestNG {

	@Test
	public void LoginTest() {
		Browser browser = null;
		Page page = null;
		try {
			browser = Playwright.create().chromium()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
			page = browser.newPage();
			page.navigate("https://freelance-learn-automation.vercel.app/login");

//			PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");

			Assert.assertTrue(page.title().contains("Learn Automation Courses"));

//			page.locator("#email1").fill("admin@email.com"); // # is used to represent id locator/attribute in CSS

//			page.locator("xpath=//input[@name='email1']").fill("admin@email.com"); //Xpath locator

//			page.locator("css=input[name='email1']").fill("admin@email.com"); //CSS locator

			page.getByPlaceholder("Enter Email").fill("admin@email.com"); // Placeholder locator i.e.Placeholder
																			// attribute

			page.getByPlaceholder("Enter Password").fill("admin@123");

//			page.getByText("Sign in").click(); // Text locator

			// Using this alternate for Sign in since we got "resolved to 2 elements error"
			page.getByText("Sign in").nth(1).click(); // or use page.getByText("Sign in").last().click();

			page.waitForTimeout(3000);

//			PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome"); // . is used to
			// represent class locator/attribute in CSS

			String actualText = page.locator(".welcomeMessage").textContent(); // Use to get the Text
			Assert.assertTrue(actualText.contains("Welcome"), "Text not found!");

			page.getByAltText("menu").click(); // Can use this when we have "alt" attribute

			page.getByText("Sign out").click();

//			PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login")); // url should contain "login" keyword
			
			String url = page.url(); // Use to get the URL
			Assert.assertTrue(url.contains("login"), "URL does not contain 'login'");

		} finally {
			page.close();
			browser.close();
		}

	}
}
