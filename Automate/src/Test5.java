import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test5  {

   public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kravikumar\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                //Test5Obj test5obj = new Test5Obj();
               // driver.get("https://demoqa.com/automation-practice-form");
                driver.get(Test5Obj.url());
	
	
}
   public static void ReadExcel() throws Exception {
	   //File src =new File("C:\\Users\\kravikumar\\Data.xlsx");
	   
	   FileInputStream fis = new FileInputStream("C:\\Users\\kravikumar\\Data.xlsx");
	   
	   XSSFWorkbook xsf = new XSSFWorkbook(fis);
	   
	   // for .xls files
	   //HSSFWorkbokk hsf = new HSSFWokbook(fis);
	   
	   XSSFSheet sheet= xsf.getSheetAt(0);
	   
	   String entry1 =sheet.getRow(2).getCell(1).getStringCellValue();
	   System.out.println(entry1);
	   
	   
   }
                
                
                
    }






