package com.salesforce.fordfoundation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SF_Mailing_Country

{
	public static WebDriver driver;
	static FileInputStream stream;
	static Properties prop;
	

	public static void launchBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	public static void readPropertiesFile() throws IOException {

		stream = new FileInputStream("./src/test/resources/config.properties");
		prop = new Properties();
		prop.load(stream);
	}

	public static void searchAccount() throws InterruptedException {

		driver.findElement(By.xpath(prop.getProperty("search_bar"))).click();

		try {
			driver.findElement(By.xpath(prop.getProperty("search_accounts_and_more")))
					.sendKeys(prop.getProperty("account_name"), Keys.ENTER);
		} catch (Exception e) {
			driver.findElement(By.xpath(prop.getProperty("search_accounts_alternate")))
					.sendKeys(prop.getProperty("account_name"), Keys.ENTER);
		} finally {
			Thread.sleep(5000);
		}

		driver.findElement(By.xpath(prop.getProperty("account_name_click"))).click();

	}

	public static void actOnApplication() throws InterruptedException {

		driver.findElement(By.xpath(prop.getProperty("username_loc"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_loc"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("submit"))).click();
		Thread.sleep(5000);
		
		closeAllTabs();
		searchAccount();
		
		driver.findElement(By.xpath(prop.getProperty("contact_info"))).click();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,700)", "");
		
		
		driver.findElement(By.xpath(prop.getProperty("mailingaddress_edit"))).click();
		driver.findElement(By.xpath(prop.getProperty("mailing_country"))).click();
		Thread.sleep(3000);

		List<WebElement> mailingCountryList = driver.findElements(By.xpath(prop.getProperty("mailing_countries_list")));

		System.out.println("Total number of countries " + mailingCountryList.size());

		for (WebElement mailingCountry : mailingCountryList) {
			Thread.sleep(200);
			System.out.println(mailingCountry.getText());
		}
	}

	public static void closeAllTabs() {

		List<WebElement> close_icons = driver.findElements(By.xpath(prop.getProperty("icon_cross_close_tab")));
		int crossCount = close_icons.size();

		while (crossCount > 0) {
			driver.findElement(By.xpath("(//button[contains(@title,'Close')])" + "[" + crossCount + "]")).click();
			crossCount -= 1;
		}
	
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		readPropertiesFile();
		launchBrowser();
		actOnApplication();

	}
}

