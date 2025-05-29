package orange;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class mainfile_13 {
	
	@Test

	public static void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		action_13 aclib = new action_13(driver);
	    function_13 funclib = new function_13(driver);

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    //logger.info("Implicit wait is given");
//        //Path of the excel file
	    FileInputStream fs = new FileInputStream(config_13.excelurl);
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        for(int k=0;k<=1;k++) {
        XSSFSheet sheet = wb.getSheetAt(k);
        System.out.println("exe of sheet num"+k);
        
        int rowcount = sheet.getLastRowNum();
       
        XSSFRow row = sheet.getRow(rowcount);
        int colcount= row.getLastCellNum()-1;
      
        
        for(int j=7;j<=colcount;j++) 
        {  
        	
        	int i=0;
        	if(j>7) 
            i=12;    
            else 
             i=4;
       
        for(i=i; i<=rowcount; i++) 
        {
        	 
              
            String fieldname = sheet.getRow(i).getCell(2).getStringCellValue();
            String Locator = sheet.getRow(i).getCell(3).getStringCellValue();
            String Action = sheet.getRow(i).getCell(4).getStringCellValue();
            String Testdata = sheet.getRow(i).getCell(j).getStringCellValue();
            
           if (Action.equals("Login:OrangeHRM") & Testdata.equals("Y")) {
        	   funclib.getpageurl();
            }
           
           else if(Action.equals("Button") || Action.equals("Checkbox")) {
            aclib.clickFunction(Locator);
            }
            else if(Action.equals("Textbox")) {
            aclib.sendkeysFunction(Locator,Testdata);
            }
            else if(Action.equals("Dropdown")) {
            aclib.dropFunction(Locator,Testdata);	
            }
            else if(Action.equals("Report")) {
            	aclib.repFunction(Locator,fieldname);
            }
            else if(Action.equals("Scroll")) {
            	aclib.scrollFunction(Locator);
            }
        
            }//1st loop
        
        	}//2nd loop
        }//3rd loop
	}}




