package quikr;


import java.time.Duration;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class actionLibrary {

	WebDriver driver;
	
	Logger logger = Logger.getLogger("quickr-project");

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
 
	
	public actionLibrary(WebDriver d) {
		driver = d;

	}

	// Button
	
		public void buttonFunc(String locator) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
		
	}
	
	
	//Textbox
	
	    public void textboxFunc(String locator,String testdata) {
	    	driver.findElement(By.xpath(locator)).sendKeys(testdata);
	    }

	
	 //Hover
	
	public void linkFunc(String locator) {

		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		try {
			action.moveToElement(element).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
	//Input
	public void inputFunc(String fieldname,String locator) {
		String text=driver.findElement(By.xpath(locator)).getText();
		Reporter.log(fieldname+ text);	
		}
	
	
}
