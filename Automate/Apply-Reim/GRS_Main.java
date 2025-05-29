
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
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.support.ui.Select;

public class GRS_Main {

	public static void main(String[] args) throws IOException, InterruptedException, NullPointerException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kravikumar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        Configu_File confi = new  Configu_File();
        File src = new File(confi.getExcelUrl());
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
	   
	
  // 
	  
////    
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//    
//      driver.get(confi.getPageUrl());
//      Thread.sleep(2000);
//      driver.manage().window().maximize();
         functionalLibrary fL = new functionalLibrary();
	     int rowcount = sheet1.getLastRowNum();
	     System.out.println(rowcount);
	    for(int i=4;i<=rowcount+1;i++) {
		 
            String Field_Name =  sheet1.getRow(i).getCell(2).getStringCellValue();
            String Locator = sheet1.getRow(i).getCell(3).getStringCellValue();
            String Action = sheet1.getRow(i).getCell(4).getStringCellValue();
            String testData = sheet1.getRow(i).getCell(7).getStringCellValue();
            System.out.println(testData);
            System.out.println(Field_Name);
            System.out.println(Action);
            
              if(Action.equals("Login:GRS") && testData.equals("Y")) {
            	 confi.getPageUrl();
                 Thread.sleep(2000);   
              
             }
	   
                if(Field_Name.equals("Reimbursement") && Action.equals("Hover")) {
            	   fL.getMouseOver();   
                }
              if(Action.equals("Click")) { 
            	 try {
            		 
            		 driver.findElement(By.xpath(Locator)).click();  
            	 }
            	 catch (Exception e){
            		   System.out.println(String.valueOf(e));
            			WebElement elements = driver.findElement(By.xpath(Locator));
            			js.executeScript("arguments[0].scrollIntoView()", elements);
                        js.executeScript("arguments[0].click()", elements);
            	}
              }
              if(Action.equals("dropdown")) {
            	  try {
            		 
            		  driver.findElement(By.xpath(Locator)).click();
            	  }
            	  catch (Exception e) {
            		 System.out.println(String.valueOf(e));
          			WebElement elements = driver.findElement(By.xpath(Locator));
          			js.executeScript("arguments[0].scrollIntoView()", elements);
                     js.executeScript("arguments[0].click()", elements);
              }
              }
              if (Action.equals("textbox")) {
            	  try {
                      driver.findElement(By.xpath(Locator)).sendKeys(testData);
            	  }
                  catch( Exception e) {
                      driver.findElement(By.xpath(Locator)).click();
                      driver.findElement(By.xpath(Locator)).clear();
                      driver.findElement(By.xpath(Locator)).sendKeys(testData);
            	  
              }
              

              
	   }
	    }
	}
}
