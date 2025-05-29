package parallel_execution;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
Logger logger=Logger.getLogger("Chrome");
	


	@Test
     public void Method1() {
		
		
        PropertyConfigurator.configure("Log4j.properties"); 
//	    logger=Logger.getLogger("mave");
//
//		//logger=LogManager.getLogger(testname);
//		PropertyConfigurator.configure("Log4j.properties"); 
		System.out.println("Class1  >>"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("Chrome opened");
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		logger.info("Google opened in chrome");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium",Keys.ENTER);
		logger.info("send keys");
	}
	
}
