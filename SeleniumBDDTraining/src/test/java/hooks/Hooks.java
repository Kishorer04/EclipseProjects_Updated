package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverInstance {

	    @Before
	    public void launchDriver() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @After
	    public void quitDriver() {
	        driver.quit();
	    }
	
	
}
