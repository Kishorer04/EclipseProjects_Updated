

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class functionalLibrary {
	WebDriver driver = new ChromeDriver();
	GRS_Main main = new GRS_Main();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void getMouseOver() {
		
	     Actions actions = new Actions(driver);
	       
  	     WebElement Reimbursements = driver.findElement(By.xpath("//*[@id=\"jsddm\"]/li[2]/a"));
  	
  	     actions.moveToElement(Reimbursements).perform();
	}
	
	}
	