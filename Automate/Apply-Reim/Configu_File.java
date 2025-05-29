
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Configu_File {

	public  String ExcelUrl = "C:\\Users\\kravikumar\\GRS Excel.xlsx";
	WebDriver driver = new ChromeDriver();
	    
    public String getExcelUrl() {
    	return  ExcelUrl; 
    }
     public void getPageUrl() {
   	   driver.get("https://daqaweb02/Gxgrs");
   	   driver.manage().window().maximize();
   	   WebElement Advanced = driver.findElement(By.xpath("//*[@id='details-button']"));
       Advanced.click();

       WebElement Proceed = driver.findElement(By.xpath("//*[@id='proceed-link']"));
      Proceed.click();
      
      System.out.println("GRS is visible");
    	} 
    
   
     }
