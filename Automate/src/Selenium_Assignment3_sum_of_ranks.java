import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium_Assignment3_sum_of_ranks {



   public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kravikumar\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
                driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");



     WebElement mystr1 = driver.findElement(By.xpath("//table[contains(@class,'tsc')]//tr//td[5]"));
                Dimension mystr2 = mystr1.getSize() ;
             System.out.println(mystr2);
    
            // List<String> listofranks =  new ArrayList<String>();
           
         for(int i=0; i<mystr2; i++) {
        	 WebElement x= driver.findElement(By.xpath("//table[contains(@class,'tsc')]//tr//td[5]"));
        	 int list[];
        	 list=list+x;
        	 System.out.println(list);
                 // String    x = mystr1.get(i).getText() ;     
  System.out.print(" " + x + " ");
            }     
    }
}