import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framework_Test {
	public static void main(String[] args) throws InterruptedException,IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        myConfig1 mycfg = new myConfig1();
 	   Test_functional_library tFL = new Test_functional_library();
 	  
 	  
//        driver.get(mycfg.url());
//        Test_functional_library tFL = new Test_functional_library();
//        tFL.getPageUrl();

        File src = new File(mycfg.excelurl());
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        
	
	    int rowcount = sheet.getLastRowNum();
        System.out.println(rowcount);
        
        for(int i=4;i<=rowcount;i++) {
            String field_name = sheet.getRow(i).getCell(2).getStringCellValue();
            String Locator = sheet.getRow(i).getCell(3).getStringCellValue();
            String Action = sheet.getRow(i).getCell(4).getStringCellValue();
            String Testdata = sheet.getRow(i).getCell(7).getStringCellValue();
     
           if (Action.equals("Login:GRS Portal") & Testdata.equals("Y")) {
        	   tFL.getPageUrl();
            }
           
            tFL.mouse_hover();
           
            if (Action.equals("Click")) {
//                 try {
        	    		driver.findElement(By.xpath(Locator)).click();
        	    		
       	    	
//        catch(Exception e) {
//      	    		System.out.println (e);
//       	    		WebElement elements = driver.findElement(By.xpath(Locator));
//       	    		jse.executeScript("arguments[0].scrollIntoView();",elements);
//       	    		jse.executeScript("arguments[0].click();",elements); 
            
            		
            if (Action.equals("Dropdown")) {

	    		driver.findElement(By.xpath(Locator)).click();
	    		driver.findElement(By.xpath(Locator)).sendKeys(Testdata);
	    		
	    	
	    	
	    		}
	    	
            	if (Action.equals("Textbox")) {
            		driver.findElement(By.xpath(Locator)).click();
    	    		driver.findElement(By.xpath(Locator)).sendKeys(Testdata);
            	}
            	}
            		
            			
     		
            	
            }
            	
        }
	}
        