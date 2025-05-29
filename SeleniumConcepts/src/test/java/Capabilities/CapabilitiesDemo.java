package Capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author kravikumar
 *
 */
public class CapabilitiesDemo {

 public static void main(String[] args) {	
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		 Capabilities cap =((RemoteWebDriver) driver).getCapabilities(); 
		 System.out.println(cap.getBrowserVersion()); 
		 System.out.println(cap.getBrowserName()); 
		 driver.close();	

	}
 
 /**
  * @author kravikumar
  * 
  * @param 
  * 
  * @re
  *
  */
 public static String run() {
	 return null;
 }

}
