import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Func_lib{
	WebDriver driver;
	
	public Func_lib(WebDriver d1) {
		this.driver=d1;
	}


public WebDriver getPageUrl() {
		driver.get(myconfig.pageurl);
		driver.findElement(By.id("details-button")).click();
	    driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	    driver.navigate().refresh();
	    return driver;
	}
}