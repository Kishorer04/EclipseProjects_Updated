package parallel_execution;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class2 {
  Logger logger=Logger.getLogger("firefox");
	
	@Test
	public void Method2() {
		
		 PropertyConfigurator.configure("Log4j.properties"); 
		System.out.println("Class2  >>"+Thread.currentThread().getId());
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kravikumar\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		logger.info("Opened browser");
		
		
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium",Keys.ENTER);
		logger.info("send keys firefox");
	}

}
