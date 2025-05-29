package generalprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:www.tutorialsninja.com/demo");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		    for(int i=0;i<links.size();i++) {
		    	
		    	if(links.get(i).getText().length()!=0) 
		    	{
			    System.out.println(links.get(i).getText());
			    System.out.println(links.get(i).getAttribute("href"));
		    	}
		    }
		    driver.close();
	}
}
