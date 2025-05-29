
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approve {

   public static void main(String[] args) throws InterruptedException, Exception, NullPointerException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    actionlibrary aclib=new actionlibrary(driver);
	    Func_lib funclib=new Func_lib(driver);
	   // driver=mycfg.initiateDriver();
       
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
        //Path of the excel file
        FileInputStream fs = new FileInputStream(myconfig.excelurl);
        //Creating a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(myconfig.page_num);

        int rowcount = sheet.getLastRowNum();

        for(int i=4;i<=rowcount;i++) {
        	    String fieldname = sheet.getRow(i).getCell(2).getStringCellValue();
        	    String locator = sheet.getRow(i).getCell(3).getStringCellValue();
        	    String action = sheet.getRow(i).getCell(4).getStringCellValue();
        	    //String testdata = sheet.getRow(i).getCell(7).getStringCellValue();
        	if(action.equals("GRS_APPLICATION")) 
	        { 
        		funclib.getPageUrl();
	        }  
        	
        	else if(action.equals(myconfig.hover)) {
        		driver=aclib.hoverFunc(locator);	
        	}
        	else if(action.equals(myconfig.click)) {
        		driver=aclib.clickFunc(locator);
        	}
        	
        	//Approved and Rejected
        	else if(action.equals(myconfig.dropdown)) {
        		driver=aclib.dropFunc(locator,fieldname);
        	}
	        
        }
                  
                      
   }

}