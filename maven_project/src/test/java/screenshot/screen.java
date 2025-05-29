package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screen {
	 WebDriver driver;
 
	@Test
  public void f() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://google.com/");
	 driver.manage().window().maximize();
	 
  }
	
	@Test
public void f2() throws IOException {
	try {
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	}catch(Exception e) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\img.png");
		FileUtils.copyFile(src, trg);
		
		driver.close();
		
	}
	
}
	
	
}
