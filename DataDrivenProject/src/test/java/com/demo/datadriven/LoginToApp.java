package com.demo.datadriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToApp {
		
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		
		
		String[][] data = {
				           {"Admin","admin123"},
				           {"Dummy","admin123"},
				           {"Admin","Dummy"},
				           {"Dummy","Dummy"}
				
		        		  };	
		return data;
	}
	
		
	    @Test(dataProvider="loginData")
		 public void loginToApplication(String uname, String pword) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		 userName.sendKeys(uname);
		 
		 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys(pword);
		 
		 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 loginButton.click();
		 
//		 driver.quit();
		 
		 
		 
		 }
	}

