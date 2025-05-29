import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_functional_library {
	 WebDriver driver = new ChromeDriver();
	 myConfig1 mycfg = new myConfig1();
	
	public void getPageUrl() { 
		
		 driver.get("https://daqaweb02/GxGRS");
	     driver.manage().window().maximize();
         driver.findElement(By.id("details-button")).click();
         driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
         driver.navigate().refresh();
   }

	public void read_excel() throws InterruptedException,IOException {
	File src = new File(mycfg.excelurl());
    FileInputStream fis = new FileInputStream(src);
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet = wb.getSheetAt(0);
}
	
public void mouse_hover() {
		Actions actions = new Actions(driver);
     WebElement element = driver.findElement(By.xpath("//a[@href='#']"));
     actions.moveToElement(element).perform();
    
	}
//    public static void main(String[] args) {
//    	System.setProperty("webdriver.chrome.driver","C:\\Users\\tnagaraja\\chromedriver.exe");
//    	
//    	Test_functional_library tFL = new Test_functional_library();
//    	tFL.getPageUrl();
//    }
}