package generalprograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_SDETQA {
	
	
	 /* Link href = https://www.xyz.com
	 * https://www.xyz.com  --> server --> status code
	 * status code >=400 Broken link
	 * status code <400 Not a Broken Link
	 * 
	 * Definition: Broken Link is a link which does not have a resource in the server
	 */

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/");
//		driver.get("http://www.deadlinkcity.com");
		driver.manage().window().maximize();
		
		//Capture all the links from the website
		List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: "+links.size());
        
        int noOfBrokenLinks=0;
        
        for(WebElement linkElement:links)
        {
        	String hrefAttVal = linkElement.getDomAttribute("href");
        	
        	if(hrefAttVal == null || hrefAttVal.isEmpty())
        	{
        		System.out.println("href attribute value is null or empty. So not possible to check");
        		continue;
        	}
        	
        	// Hit URL to the server
        	try 
        	{
        		URL linkUrl = new URL(hrefAttVal); //Convert href value from string to URL format
        	    HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection(); //Open connection to the server
        	    conn.connect(); // Connect to the server and send request to the server
        	    
        	    if(conn.getResponseCode() >= 400)
        	    {
        	    	System.out.println(hrefAttVal+ " ===> Broken link");
        	    	noOfBrokenLinks++;
        	    }
        	    else 
        	    	System.out.println(hrefAttVal+ " ===> Not a Broken link");
        	}
        	catch(Exception e)
        	{	
        	}
        }
        System.out.println("Number of Broken links: "+noOfBrokenLinks);
 	}

}
