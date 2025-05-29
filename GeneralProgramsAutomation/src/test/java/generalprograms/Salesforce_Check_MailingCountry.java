package generalprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Salesforce_Check_MailingCountry 

{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://fordfoundation--training.sandbox.my.salesforce.com");
		driver.manage().window().maximize();
		By username_locator = By.id("username");
		By password_locator = By.id("password");
		By submit_locator = By.id("Login");
		
		driver.findElement(username_locator).sendKeys("a.sahu.srvcprvdr@fordfoundation.org.training");
		driver.findElement(password_locator).sendKeys("Welcome@1440320");
		driver.findElement(submit_locator).click();
		Thread.sleep(5000);
		
		By account_locator = By.xpath("(//a[@title='Aloena Pinas | Account'])[1]");
		driver.findElement(account_locator).click();
		
		Thread.sleep(5000);
		
		By accountinfo_locator =  By.xpath("//a[text()='Contact Info']");
		driver.findElement(accountinfo_locator).click();
		
		

	    
	    By mailingadress_edit = By.xpath("//span[@class='inline-edit-trigger-icon slds-button__icon slds-button__icon_hint']");
		driver.findElement(mailingadress_edit).click();
		
		WebElement elee =  driver.findElement(By.xpath("//input[@autocomplete='country']"));
		
		  JavascriptExecutor js =  (JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView(true);", elee);
		 js.executeScript("arguments[0].click();", elee);
		 
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@aria-label='Mailing Country']//lightning-base-combobox-item"));
		
		System.out.println(list.size());
		
		for(WebElement ele : list)
		{
//			Thread.sleep(2000);
			System.out.println(ele.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}