
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Func_lib{
	WebDriver driver;
	Pageobject pobj = new Pageobject();
	
	 Logger logger=Logger.getLogger("myproject");
	 
	public Func_lib(WebDriver d1) {
		this.driver=d1;
	}


public void getPageUrl(int j) {
	logger.info("in func library");
	 
    driver.get(myconfig.pageurl);
    driver.manage().window().maximize();
//  driver.findElement(pobj.Advanced).click();
//  driver.findElement(pobj.Proceed).click();
    driver.navigate().refresh(); 
	         
}
	    

	}



