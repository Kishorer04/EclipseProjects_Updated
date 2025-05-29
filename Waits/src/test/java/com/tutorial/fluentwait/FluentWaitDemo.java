package com.tutorial.fluentwait;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(30))
    .pollingEvery(Duration.ofSeconds(2))
    .ignoring(NoSuchElementException.class);
    
    
    WebElement profile =wait.until(new Function<WebDriver, WebElement>() {

		@Override
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("")) ;
		}
	    	
    });
  
    profile.click();
    
    
    
    
   
	}

}
