package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	//Aim: open chrome and go to
	//1. google.co.in 2. bing.com and 3.yahoo.com and then close the browser
	//Suite meaning- Collection of Test cases
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowerser() {
		
	startTime= System.currentTimeMillis();
	driver = new ChromeDriver();
	
	}
	
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
			
	}
	
	@Test
	public void openBing() {
		driver.get("https://www.bing.com");
	
	}
	
	@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime= System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken "+totalTime);
		
	}
			

}
