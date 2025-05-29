package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class PageFac {
	
	    @FindBy(how=How.NAME,using="q")
	    WebElement search;
	    
	    @FindBy(how=How.LINK_TEXT,using="Images")
	    WebElement images;
	
        
	    
	   public WebDriver driver;
        
	  
	    @BeforeTest
	    public void method1() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	   }
	    
	    @Test
	    public void method2() {
	    driver.get("https://www.google.com");
	    search.sendKeys("selenium",Keys.ENTER);
	    images.click();
	    driver.close();
	    }
	    
	    
	    
	    
		
	    
	  		
		
	}
	   
	  
	   
