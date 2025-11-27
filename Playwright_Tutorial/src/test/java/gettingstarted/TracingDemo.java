package gettingstarted;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class TracingDemo {

	// Tracing will produce a zip file. To open the file navigate to
	// https://www.trace.playwright.dev

	// Tracing can be viewed using Maven command also:
	// mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="show-trace Tracing.zip"

	@Test
	public void loginTest() {
		Browser browser = null;
		BrowserContext context = null;
		Page page = null;

		try {
			browser = Playwright.create().chromium()
					.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));

			context = browser.newContext();

			context.tracing()
					.start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));

			page = context.newPage();

			page.navigate("https://freelance-learn-automation.vercel.app/login");

			Assert.assertTrue(page.title().contains("Learn Automation Courses"));

			page.getByPlaceholder("Enter Email").fill("admin@email.com");

			page.getByPlaceholder("Enter Password").fill("admin@123");

			page.getByText("Sign in").last().click();

			PlaywrightAssertions.assertThat(page.locator(".welcomeMessage")).containsText("Welcome");

			page.getByAltText("menu").click();

			page.getByText("Sign Out").click();

			PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));

		} finally {
			// Whenever we work with tracing...remember this particular line should get executed. Otherwise we wont 
			// get the output tracing zip file
			context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("./Tracing.zip")));

			page.close();

			browser.close();
		}

	}

}
