package mp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest{
	
@Test
public static void test() {
	    WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	    driver.get("https://google.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium",Keys.ENTER);
	 
}
}