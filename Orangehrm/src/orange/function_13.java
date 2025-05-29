package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class function_13 {
	WebDriver driver;
	//pageobject_13 pageObj= new pageobject_13(driver);
	public void getpageurl(){
	 driver.get(config_13.pageurl);
	 driver.manage().window().maximize();
	}
	public function_13(WebDriver driver) {
	 this.driver=driver;
	}
	 public void Scroll(String Locator) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement elements = driver.findElement(By.xpath(Locator));
	     js.executeScript("arguments[0].scrollIntoView();",elements);
	     js.executeScript("arguments[0].click();",elements);
	 }
}