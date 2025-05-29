package XPathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cosmocode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kravikumar\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
//        driver.get("https://cosmocode.io/automation-practice-webtab");
////         String text= driver.findElement(By.xpath("//table[@id='countries']/descendant::tr[2]/child::td[2]//*[text()='Afghanistan']/parent::td/following::td[2]")).getText();
////        System.out.println(text);
//         String text=driver.findElement(By.xpath("//table[@id='countries']//tr[2]/child::td[2]//strong[1]")).getText();
//         System.out.println(text);
         
         
         driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
         int rows= driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
         System.out.println(rows);
         
         
         
         for(int r=2;r<=7;r++) {
        	 for(int c=1;c<=3;c++) {
        		 String data=driver.findElement(By.xpath("// table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
        		 System.out.print(data+"   ");
        	 }
        	 System.out.println();
        		 
         }
         
	}

}
