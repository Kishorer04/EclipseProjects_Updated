package generalprograms;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlerts {
	
	static WebDriver driver;
	
	static void handleWindows() {
		Set<String> windows =driver.getWindowHandles();
		System.out.println("Windows "+windows);
		Iterator it= windows.iterator();
		Object parentWindow = it.next();
		Object childWindow = it.next();
		driver.switchTo().window((String) childWindow);
		driver.close();
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Downloads\\AdBlock — best ad blocker 5.8.1.0.crx"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		//handleWindows();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	    Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		driver.close();
	    
		

	}

}
