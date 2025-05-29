	package TestNG;

import org.testng.annotations.Test;


import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actionlibrary {

	WebDriver driver;

	Pageobject pobj = new Pageobject();
	Logger logger = Logger.getLogger("myproject");

	public actionlibrary(WebDriver d) {
		driver = d;

	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	// link
	public void linkFunc(String locator) {

		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		try {
			action.moveToElement(element).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Button
	public void buttonFunc(String locator) {

		try {
			driver.findElement(By.xpath(locator)).click();
		} catch (Exception e) {
			// WebElement element1 = driver.findElement(pobj.no_records);
			// js.executeScript("arguments[0].scrollIntoView();", element1);
			if (driver.findElement(pobj.no_records).isDisplayed()) {
				logger.info("No pending requests");
			}
		}

	}

	// Textbox
	public void textboxFunc(String locator, String testdata) {
		logger.info("im in texbox");
		try {
			driver.findElement(By.xpath(locator)).sendKeys(testdata);
		} catch (Exception e) {
			logger.error(e);
		}

	}

	// Dropdown

	public void dropFunc(String locator, String testdata) {
		logger.info("im in dropdown");
		driver.findElement(By.xpath(locator)).click();
		Select drop = new Select(driver.findElement(By.xpath(locator)));
		try {
			drop.selectByVisibleText(testdata);
		} catch (Exception e) {

			WebElement element = driver.findElement(By.xpath(locator));
			js.executeScript("arguments[0].scrollIntoView();", element);
			js.executeScript("arguments[0].click();", testdata);

		}
	}

	public void calendarFunc(String locator, String testdata) {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(testdata);
		String date = formatter.format(d);
		String splitter[] = date.split("/");
		String day = splitter[0];
		// String month = splitter[1];
		int month = Integer.parseInt(splitter[1]);
		int year = Integer.parseInt(splitter[2]);

		driver.findElement(By.xpath(locator)).click();

		// Month
		Month mon = Month.of(month); // month type
		String a = String.valueOf(mon); // String type


		while (true) {
			
			String m = driver.findElement(pobj.Mon_loc).getText();
			if (a.equalsIgnoreCase(m))
				break;

			else
				driver.findElement(pobj.Requested_date1).click();

		}

		// Day

		String req_date = pobj.Requested_date(day);
		driver.findElement(By.xpath(req_date)).click();

	}

}
