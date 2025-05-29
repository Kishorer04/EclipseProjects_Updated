import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actionlibrary  {
	
	WebDriver driver;
	
	public actionlibrary(WebDriver d) {
		driver=d;
	}
	
	//Hover
	public WebDriver hoverFunc(String locator) throws Exception {
		 Thread.sleep(5000);
		 WebElement element = driver.findElement(By.xpath(locator));
         Actions action = new Actions(driver);
         action.moveToElement(element).perform();
		 return driver;
	}

    //Click	
	public WebDriver clickFunc(String locator) throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath(locator)).click();
		return driver;
	}
	
	
	//Dropdown
	public WebDriver dropFunc(String locator,String fieldname) throws Exception {	
     if(fieldname.equals("Approved")) {
    	 Thread.sleep(2000);
    	 WebElement DropDown = driver.findElement(By.id(locator));  
         Select dropdown = new Select(DropDown);  
         dropdown.selectByIndex(1);
     }
     else{
    	 Thread.sleep(2000);
    	 WebElement DropDown1 = driver.findElement(By.id(locator)); 
    	 Select dropdown1 = new Select(DropDown1);
         dropdown1.selectByIndex(2);
     }
		return driver;
		
	}

}





















//public class actionlibrary{
//	static String click="click";
//	static String hover="hover";
//	static String dropdown="dropdown";
//	
//}
