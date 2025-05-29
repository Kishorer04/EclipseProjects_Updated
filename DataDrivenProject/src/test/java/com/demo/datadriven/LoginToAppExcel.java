package com.demo.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToAppExcel {
	
WebDriver driver;


	
	@BeforeTest
	public void beforeTest() {
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	 
	 @DataProvider(name="loginData") 
	 public String[][] loginDataProvider() throws IOException {

		 FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\logindata.xlsx");
		 XSSFWorkbook wb = new XSSFWorkbook(fi);
		 XSSFSheet sheet=wb.getSheetAt(0);		 
		 int lastRowIndex= sheet.getLastRowNum();
		 
		 System.out.println("Last Row index "+lastRowIndex);
		 
		 
		// Iterate over the rows to find the maximum last cell index
         int maxLastCellIndex = 0;
         for (int i = 0; i <= lastRowIndex; i++) {
             Row row = sheet.getRow(i);
             
             if (row != null) {
                 int lastCellIndex = row.getLastCellNum();
                 if (lastCellIndex > maxLastCellIndex) {
                     maxLastCellIndex = lastCellIndex;
                 }
             }
         }

         System.out.println("Last column index: " + (maxLastCellIndex - 1));
		 
		 
		 String[][] data = new String[lastRowIndex][maxLastCellIndex];
		 
		 
		 //Assigning values to the array
		 for(int i=1;i<=lastRowIndex;i++) {
			 		 
			 for(int j=0;j<maxLastCellIndex;j++)
			 {
				 data[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			 }
		 }
		 

		 
		 
		 //Printing the array
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		 
		 
		 return data;
		 
	 }
	 
	 @Test(dataProvider="loginData")
	 public void loginToApplication(String uname, String pword) throws InterruptedException {
	
	 
	 WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	 userName.sendKeys(uname);
	 
	 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	 password.sendKeys(pword);
	 
	 Thread.sleep(3000);
	 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	 loginButton.click();
	 Thread.sleep(3000);

	 }
	
	 
	 @AfterTest
	 public void afterTest() {
		 driver.quit();
	 }

}
