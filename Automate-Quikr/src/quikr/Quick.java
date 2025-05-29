package quikr;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Quick {
	    
	   static ChromeOptions options;
	   static WebDriver driver;
	   static Logger logger;
	   static functionLibrary flib;
	   static actionLibrary alib;


	    @BeforeTest
		public void file() throws InterruptedException, Exception, NullPointerException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");
	
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
	    logger=Logger.getLogger("quickr-project");
        PropertyConfigurator.configure("Log4j.properties");  
		
		 flib =new functionLibrary(driver);
		 alib=new actionLibrary(driver);
       
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    

		 @Test       
		      public void test() throws IOException, InterruptedException {
                XSSFSheet sheet=flib.readexcel();
	            XSSFSheet sheet1=sheet;
	            
				int rowcount = sheet1.getLastRowNum();
			
			for(int i=4;i<=rowcount;i++)
			{
				String fieldname = sheet1.getRow(i).getCell(2).getStringCellValue();
				String locator = sheet1.getRow(i).getCell(3).getStringCellValue();
				String action = sheet1.getRow(i).getCell(4).getStringCellValue();
				String testdata = sheet1.getRow(i).getCell(7).getStringCellValue();

				
				if(action.equals("Quickr")&& testdata.equals("Y"))
				{
					flib.getPageUrl();
					logger.info("Opening url");
				}
				else if(action.equals("button")) {
					alib.buttonFunc(locator);
				}
				else if(action.equals("textbox")) {
					alib.textboxFunc(locator,testdata);
				}
				else if(action.equals("link")) {
					alib.linkFunc(locator);
				}
				else if(action.equals("tab")) {
					flib.tabChangeFunc(Integer.parseInt(testdata));
				}
				else if(action.equals("input")) {
					alib.inputFunc(fieldname,locator);
				}	
			}
		
	}

	   
	 @AfterTest   
	 public void close() throws InterruptedException {
		 Thread.sleep(2000);
		 
		 driver.close();
		 logger.info("1st tab closed");
		 Thread.sleep(2000);
		 driver.quit();
		 
		 logger.info("Full execution completed");
	 }
	
	
}