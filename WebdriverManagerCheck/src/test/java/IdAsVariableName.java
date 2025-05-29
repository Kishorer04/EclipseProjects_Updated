

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class IdAsVariableName {

	 static WebElement q ;
	  
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
//		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		PageFactory.initElements(driver, IdAsVariableName.class);
		q.sendKeys("Trichy \n");
	}
	  

}
