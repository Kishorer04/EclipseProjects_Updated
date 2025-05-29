import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("Chennai \n");
//		
//		PageFactory.initElements(driver,Check.class);
		

	}

}
