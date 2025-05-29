import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserStackReadExcelTest {
public static void main (String [] args) throws IOException, InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\kravikumar\\chromedriver.exe");
WebDriver driver = new ChromeDriver();      
driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//Path of the excel file
FileInputStream fs = new FileInputStream("C:\\Users\\kravikumar\\Data.xlsx");
//Creating a workbook
XSSFWorkbook workbook = new XSSFWorkbook(fs);
XSSFSheet sheet = workbook.getSheetAt(0);

int rowcount = sheet.getLastRowNum();
//System.out.println(rowcount);

for(int i=1;i<=rowcount;i++) {
    String firstName = sheet.getRow(i).getCell(0).getStringCellValue();
    String lastName = sheet.getRow(i).getCell(1).getStringCellValue();
    String userEmail = sheet.getRow(i).getCell(2).getStringCellValue();
    String gender = sheet.getRow(i).getCell(3).getStringCellValue();
    long userNumber = (long) sheet.getRow(i).getCell(4).getNumericCellValue();
    String un = String.valueOf(userNumber);
    System.out.print(firstName);
    System.out.println(lastName);
    System.out.println(userEmail);
    System.out.println(gender);
    System.out.println(un);
    
    driver.findElement(By.id("firstName")).sendKeys(firstName);
    driver.findElement(By.id("lastName")).sendKeys(lastName);
    driver.findElement(By.id("userEmail")).sendKeys(userEmail);
    
    WebElement element=driver.findElement(By.xpath("//input[@name='gender' and @value='"+gender+"']"));
//    js.executeScript("arguments[0].scrollIntoView();",(element1));
    js.executeScript("arguments[0].click();",element);
   // element.click();
    driver.findElement(By.id("userNumber")).sendKeys(un);
    
    WebElement element1 = driver.findElement(By.xpath("//button[@id='submit']"));
    js.executeScript("arguments[0].scrollIntoView();",(element1));
    js.executeScript("arguments[0].click();",element1);
    //element1.click();
    
    Thread.sleep(3000);
    WebElement element2 = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
    js.executeScript("arguments[0].scrollIntoView();",(element2));
    js.executeScript("arguments[0].click();",element2);
    Thread.sleep(3000);
   // element2.click();
    
}
}
}






