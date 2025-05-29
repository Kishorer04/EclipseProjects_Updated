package hooks;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import driver.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

//General Rule: Hooks class cannot be extended by any class. But, Hooks can extend any class

public class Hooks extends DriverInstance {
	

	@Before
	public void beforeScenario(Scenario scenario)
	{
		  driver = new ChromeDriver();
		  driver.get("https://bookcart.azurewebsites.net/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		  System.out.println("***ID***: "+scenario.getId());
		  System.out.println("***Line***: "+scenario.getLine());
		  System.out.println("***URI***: "+scenario.getUri());
		  System.out.println("***Source tag name***: "+scenario.getSourceTagNames());
          Status status = scenario.getStatus();
          System.out.println("***Result***: "+ status);
	
	}
	
	@After(order=1)
	public void afterScenario(Scenario scenario) 
	{
	boolean status = scenario.isFailed();
	System.out.println("Failed Status: "+status);
	if(status)
	{
	TakesScreenshot scrnshot = (TakesScreenshot)driver;
	byte[] scrnshotFile = scrnshot.getScreenshotAs(OutputType.BYTES);
	scenario.attach(scrnshotFile, "image/png", "image.png");
	}
	Status status1 = scenario.getStatus();
    System.out.println("***Result***: "+ status1);
    driver.quit();
	}
	
	
	@After("@cleanup")
	public void cleanData(Scenario scenario) 
	{
	driver.findElement(By.xpath("//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-button-touch-target']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Clear cart']")).click();
	String text = driver.findElement(By.xpath("//mat-card-title[normalize-space()='Your shopping cart is empty.']")).getText();
	Assert.assertEquals(text, "Your shopping cart is empty.");
	System.out.println("After clearing cart");
	TakesScreenshot scrnshot = (TakesScreenshot)driver;
	byte[] scrnshotFile = scrnshot.getScreenshotAs(OutputType.BYTES);
	scenario.attach(scrnshotFile, "image/png", "image.png");
	
	}
	
	
	
	@BeforeStep
	public void beforeStep(Scenario scenario) 
	{

	}
	
	@AfterStep
	public void afterStep(Scenario scenario) 
	{
		
	}

	
}
