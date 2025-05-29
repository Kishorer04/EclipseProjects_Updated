package parallel_execution;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class3 {
	Logger logger=Logger.getLogger("edge");
	@Test
	public  void Method3() {
		PropertyConfigurator.configure("Log4j.properties"); 
		System.out.println("Class2  >>"+Thread.currentThread().getId());
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kravikumar\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		logger.info("Edge browser opened");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium",Keys.ENTER);
		logger.info("Edge sent input");
	}

}
