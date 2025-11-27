package gettingstarted;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class RegisterNewUser {

	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
		Page page = browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		page.getByText("New user? Signup").click();
		
		PlaywrightAssertions.assertThat(page.locator("xpath=//button[@class='submit-btn']")).isDisabled();
		
		page.locator("#name").fill(new Faker().name().fullName());
		
		page.getByPlaceholder("Email").fill(new Faker().name().firstName()+"_"+new Faker().name().lastName()+"@gmail.com");
		
		//page.pause(); // To pause the script and to open Playwright inspector to Debug
		
		page.getByPlaceholder("Password").fill("kishore123");
		
		page.locator("xpath=//label[text()='Cypress']//preceding::input[1]").click(); // Can use check() also
		
		PlaywrightAssertions.assertThat(page.locator("xpath=//label[text()='Cypress']//preceding::input[1]")).isChecked();
		
		page.locator("xpath=//input[@value='Female']").click();
		
		PlaywrightAssertions.assertThat(page.locator("xpath=//input[@value='Female']")).isChecked();
		
		//Single select Dropdown
		page.locator("#state").selectOption("Goa");
		
		//Multi select Dropdown
		String[] hobbies = {"Playing","Swimming"};
		page.locator("#hobbies").selectOption(hobbies);
		
		PlaywrightAssertions.assertThat(page.locator("xpath=//button[@class='submit-btn']")).isEnabled();
		
		page.locator("xpath=//button[@class='submit-btn']").click();
		
		page.waitForTimeout(1000);

	}

}
