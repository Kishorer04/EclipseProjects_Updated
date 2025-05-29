import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import gx.myconfig;

public class Approve1 {

   public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kravikumar\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                myconfig mycfg = new myconfig();
                driver.get(mycfg.url());
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//button[@id='details-button']")).click();
                driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
                
                //Hover
                WebElement element = driver.findElement(By.xpath("//a[@id='hlnActions']"));
                Actions action = new Actions(driver);
                action.moveToElement(element).perform();
                driver.findElement(By.xpath("//a[text()='Manager Broadband Approval']")).click();
                driver.findElement(By.id("btnGetDetails")).click();
                Thread.sleep(4000);
                driver.findElement(By.xpath("(//a[@title='Approve'])[1]//img")).click();
                driver.findElement(By.xpath("//button[text()='Continue']")).click();
                Thread.sleep(4000);
               
                
                //Dropdown for Accepted
                  WebElement DropDown = driver.findElement(By.id("ddlStatus"));  
                  Select dropdown = new Select(DropDown);  
                  dropdown.selectByIndex(1);
                  driver.findElement(By.id("btnGetDetails")).click();
                  Thread.sleep(4000);
                  
                //Dropdown for Rejected
                  WebElement DropDown1 = driver.findElement(By.id("ddlStatus"));   
                  dropdown.selectByIndex(2);
                  driver.findElement(By.id("btnGetDetails")).click();
                  Thread.sleep(4000);
          
                
   }
}