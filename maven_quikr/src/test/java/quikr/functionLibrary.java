package quikr;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class functionLibrary {
	
	WebDriver driver;
	Logger logger=Logger.getLogger("quickr-project");
	
	 
	public functionLibrary(WebDriver driver) {
		this.driver=driver;
	}


	
	public void getPageUrl() {
		logger.info("in func library");
	    driver.get(ConfigFile.pageurl);
	    driver.manage().window().maximize();
	    
		
	   // driver.navigate().refresh();
	}
 
   	
	public XSSFSheet readexcel() throws IOException, InterruptedException {
		FileInputStream fs = new FileInputStream(ConfigFile.excelurl);
		logger.info("Reading Excel Sheet");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		//int k = workbook.getNumberOfSheets();
			XSSFSheet sheet1 = workbook.getSheetAt(0);
			return sheet1;
	}
	
	
	
   public void tabChangeFunc(int testdata) {
	   String parent=driver.getWindowHandle();
	   Set<String>allWindows=driver.getWindowHandles();
	   ArrayList<String> tabs=new ArrayList<String>(allWindows);
	   driver.switchTo().window(tabs.get(testdata));
   }
   
  


}
