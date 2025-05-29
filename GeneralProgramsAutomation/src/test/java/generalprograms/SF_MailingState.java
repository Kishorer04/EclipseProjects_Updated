package generalprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SF_MailingState 

{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://fordfoundation--training.sandbox.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		WebElement country =  driver.findElement(By.xpath("//input[@autocomplete='country']"));
		
		  JavascriptExecutor js =  (JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView(true);", country);
		 js.executeScript("arguments[0].click();", country);
		 
		 
		 
		 Thread.sleep(5000);
		 
		 String country_val = "Guinea-Bissau";
		 System.out.println("Country: "+country_val);
		 
		WebElement hh= driver.findElement(By.xpath("//lightning-base-combobox-item//span//span[text()='"+country_val+"']"));
				       js.executeScript("arguments[0].click();", hh);
		 
		Thread.sleep(5000);
		
		
		
		WebElement state = driver.findElement(By.xpath("(//input[@name='province'])[1]"));
		js.executeScript("arguments[0].click();", state);
		
		Thread.sleep(5000);
		
		List<WebElement> mailing_state = driver.findElements(By.xpath("//input[@aria-label='Mailing State/Province']//..//following::div[2]//lightning-base-combobox-item"));
		
		System.out.println(mailing_state.size());
		
		for(WebElement ele : mailing_state)
		{
//			Thread.sleep(2000);
			System.out.println(ele.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}