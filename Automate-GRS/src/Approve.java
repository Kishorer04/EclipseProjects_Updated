
import java.io.FileInputStream;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Approve {

	public static void main(String[] args) throws InterruptedException, Exception, NullPointerException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");

        Logger logger=Logger.getLogger("myproject");

        PropertyConfigurator.configure("Log4j.properties");
        
		WebDriver driver = new ChromeDriver();
		
		actionlibrary aclib=new actionlibrary(driver);
		
		Func_lib funclib=new Func_lib(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FileInputStream fs = new FileInputStream(myconfig.excelurl);
		logger.info("Reading Excel Sheet");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		int k = workbook.getNumberOfSheets();

		for(int j=0; j<k; j++)
		{
			int num=j+1;
			logger.info("Execution of sheet number"+" "+num);
			
			XSSFSheet sheet1 = workbook.getSheetAt(j);

			int rowcount = sheet1.getLastRowNum();
		

			for(int i=4;i<=rowcount;i++)
			{
				String fieldname = sheet1.getRow(i).getCell(2).getStringCellValue();
				String locator = sheet1.getRow(i).getCell(3).getStringCellValue();
				String action = sheet1.getRow(i).getCell(4).getStringCellValue();
				String testdata = sheet1.getRow(i).getCell(7).getStringCellValue();

				
				if(action.equals("GRS_APPLICATION")&& testdata.equals("Y"))
				{
					funclib.getPageUrl(j);
					logger.info("Opened Browser");
				}

				else if(action.equals("link")) {
					aclib.linkFunc(locator);
					
				}
				
				else if(action.equals("button")){
					 aclib.buttonFunc(locator);
				}
				else if(action.equals("textbox")) {
					aclib.textboxFunc(locator,testdata);
		
				}

				//Approved and Rejected
				else if(action.equals("dropdown")) {
					aclib.dropFunc(locator,testdata);
				}

//				else if(action.equals("calendar")) {
//					aclib.calendarFunc(locator);
//				}
				else if(action.equals("calendar")) {
					aclib.calendarFunc(locator,testdata);
				}

			}
		}
		driver.quit();
		logger.info("Browser quitted");
		 


	}
}

