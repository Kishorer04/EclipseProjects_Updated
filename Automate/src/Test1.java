import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

   public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kravikumar\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://demoqa.com/automation-practice-form");
                driver.findElement(By.id("firstName")).sendKeys("kishore"); 
                driver.findElement(By.id("lastName")).sendKeys("R"); 
                driver.findElement(By.id("userEmail")).sendKeys("kishore@gmail.com"); 
                driver.findElement(By.xpath("//label[@class='custom-control-label'][1]")).click(); 
                driver.findElement(By.id("userNumber")).sendKeys("9846783933"); 
                
              
                
                
                
                
    }



}