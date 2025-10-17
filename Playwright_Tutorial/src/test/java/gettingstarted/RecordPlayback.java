package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;

public class RecordPlayback {

	public static void main(String[] args) {
		
		 try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://freelance-learn-automation.vercel.app/login");
		      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Sign In"))).isVisible();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Email")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Email")).fill("admin@email.com");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Password")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Password")).fill("admin@123");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign in")).click();
		      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Welcome Admin Manager to"))).isVisible();
		      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("menu")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign out")).click();
		      PlaywrightAssertions.assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Sign In"))).isVisible();
		    }

	}

}
