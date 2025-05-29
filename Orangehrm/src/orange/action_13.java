package orange;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class action_13 {
	 WebDriver driver;
     //pageobject_13 pageObj= new pageobject_13(driver);
     public action_13(WebDriver driver) {
     this.driver=driver;
     }
       
        //Clicking
        
        public void clickFunction(String Locator) throws Exception {
            
//            try {
//            	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));
        	Thread.sleep(2000);
                driver.findElement(By.xpath(Locator)).click();
//                }
//            catch(Exception e) {
//                		  if (driver.findElement(pageObj.no_records).isDisplayed()) {
//              				System.out.println("No pending requests");
//          
//                		  }
                	  }
                                 
    //Entering the text
        
        public void sendkeysFunction(String Locator, String Testdata) throws Exception {
               		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
               		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator))); 
//                   try {
//                	   driver.findElement(By.xpath(Locator)).clear();
                	   driver.findElement(By.xpath(Locator)).sendKeys(Testdata);
                   }
//                   catch(Exception e) {
//                	   logger.error(e);  
//                   }
//}
        public void dropFunction(String Locator, String Testdata)throws Exception{
    	   	driver.findElement(By.xpath(Locator)).click();
    	   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));
    	   	Select drop = new Select(driver.findElement(By.xpath(Locator)));
//               try {
            	   drop.selectByVisibleText(Testdata);
//               }   
//               catch (Exception e) {
//               try {       
//               WebElement element = driver.findElement(By.xpath(Locator));
//                js.executeScript("arguments[0].scrollIntoView();",element);
//                js.executeScript("arguments[0].click();",Testdata);
               // logger.info("Selected from dropdown having the xpath: "+locator);
                                                             
               
//                 catch(Exception e1) {
//                 logger.error(e1);
                 }
        
        
            public void repFunction(String Locator,String fieldname) {
            	String tx=driver.findElement(By.xpath(Locator)).getText();
            	Reporter.log(fieldname+tx);
            }
            
            
            public void scrollFunction(String Locator) {
            	WebElement element = driver.findElement(By.xpath(Locator));
            	 JavascriptExecutor js = (JavascriptExecutor)driver;
    			js.executeScript("arguments[0].scrollIntoView();", element);
            }
            
             
               }
//        }

