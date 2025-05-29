package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PF {
	
	WebDriver driver;
	
	
	public PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, PageFac.class);
	}
	


}
