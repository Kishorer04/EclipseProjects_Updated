import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pyframe{
public static void main (String [] args) throws Exception{
System.setProperty("webdriver.chrome.driver","C:\\Users\\kravikumar\\chromedriver.exe");
WebDriver driver = new ChromeDriver();      



JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//Path of the excel file
FileInputStream fs = new FileInputStream(constant.excelurl);
//Creating a workbook
XSSFWorkbook workbook = new XSSFWorkbook(fs);
XSSFSheet sheet = workbook.getSheetAt(0);

int rowcount = sheet.getLastRowNum();

for(int i=3;i<=rowcount;i++) {


	//String field_name= sheet.getRow(i).getCell(2).getStringCellValue();	
	//String locator=sheet.getRow(i).getCell(3).getStringCellValue();
	XSSFRow row =sheet.getRow(i);
	XSSFCell cell=row.getCell(3);
	String action=String.valueOf(cell.getStringCellValue());
	System.out.println(action);
	
	//XSSFRow row=sheet.getRow(i);
	//double testdata1=sheet.getRow(i).getCell(7).getNumericCellValue();
	//String testdata=String.valueOf(testdata1);
	try {
	if(action == "Login:DEMO QA") {
		driver.get(constant.pageurl);
		driver.manage().window().maximize();	
	}
	}
	catch(Exception e) {
		System.out.println("failed");
	}
	
		
	

}
}
}
