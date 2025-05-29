package com.salesforce.fordfoundation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SF_Mailing_State

{
	static WebDriver driver;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static int currentColumn = 0;
	static Properties prop;
	static FileInputStream stream;
	FileOutputStream outputstream;
	static JavascriptExecutor jse;
	static List<WebElement> mailingStates;
	static String country_val;

	String inputFile = System.getProperty("user.dir") + "\\src\\test\\resources\\Test_Data_SF-Country.xlsx";
	String outputFile = System.getProperty("user.dir") + "\\Result\\Result_file.xlsx";


	public static void readPropertiesFile() throws IOException {
		stream = new FileInputStream("./src/test/resources/config.properties");
		prop = new Properties();
		prop.load(stream);
	}

	public static void launchBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}

	public static void closeAllTabs() {

		List<WebElement> close_icons = driver.findElements(By.xpath(prop.getProperty("icon_cross_close_tab")));
		int crossCount = close_icons.size();

		while (crossCount > 0) {
			driver.findElement(By.xpath("(//button[contains(@title,'Close')])" + "[" + crossCount + "]")).click();
			crossCount -= 1;
		}

	}

	public static void searchAccount() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("search_bar"))).click();

		try {
			driver.findElement(By.xpath(prop.getProperty("search_accounts_and_more")))
					.sendKeys(prop.getProperty("account_name"), Keys.ENTER);
		} catch (Exception e) {
			driver.findElement(By.xpath(prop.getProperty("search_accounts_alternate")))
					.sendKeys(prop.getProperty("account_name"), Keys.ENTER);
		} finally {
			Thread.sleep(5000);
		}

		driver.findElement(By.xpath(prop.getProperty("account_name_click"))).click();

	}

	@BeforeClass
	public void initialSetup() throws InterruptedException, IOException {

		readPropertiesFile();
		launchBrowser();

		driver.findElement(By.xpath(prop.getProperty("username_loc"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_loc"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("submit"))).click();
		Thread.sleep(5000);

		closeAllTabs();
		searchAccount();

		Thread.sleep(5000);

		driver.findElement(By.xpath(prop.getProperty("contact_info"))).click();

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");

		driver.findElement(By.xpath(prop.getProperty("mailingaddress_edit"))).click();
		driver.findElement(By.xpath(prop.getProperty("mailing_country"))).click();
		Thread.sleep(3000);

		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Result_sheet");
	}

	@Test(dataProvider = "CountryName")
	public void getState(String country) throws InterruptedException, IOException {

		jse = (JavascriptExecutor) driver;
		country_val = country;
		System.out.println("Country: " + country_val);

		WebElement countryField = driver
				.findElement(By.xpath("//lightning-base-combobox-item//span//span[text()='" + country_val + "']"));

		jse.executeScript("arguments[0].click();", countryField);

		Thread.sleep(5000);

		WebElement state = driver.findElement(By.xpath(prop.getProperty("state")));
		jse.executeScript("arguments[0].click();", state);

		Thread.sleep(5000);

		mailingStates = driver.findElements(By.xpath(prop.getProperty("mailing_states")));
				

		Thread.sleep(5000);

		System.out.println(mailingStates.size());

		for (WebElement mailingState : mailingStates) {

			Thread.sleep(200);
			String value = mailingState.getText();
			System.out.println(value);
		}

		writeToExcel(country_val, mailingStates);

	}

	public static void writeToExcel(String country_val, List<WebElement> mailingStates) {
	   
	    XSSFRow headerRow = sheet.getRow(0);
	    if (headerRow == null) {
	        headerRow = sheet.createRow(0);
	    }
	    XSSFCell countryCell = headerRow.createCell(currentColumn);
	    countryCell.setCellValue(country_val);
	    

	    for (int i = 0; i < mailingStates.size(); i++) {
	        XSSFRow stateRow = sheet.getRow(i + 1);
	        if (stateRow == null) {
	            stateRow = sheet.createRow(i + 1);
	        }
	        XSSFCell stateCell = stateRow.createCell(currentColumn);
	        stateCell.setCellValue(mailingStates.get(i).getText());
	    }

	    currentColumn++;
	}


	@AfterClass
	public void tearDown() throws IOException {
		outputstream = new FileOutputStream(outputFile);
		System.out.println(outputFile);
		wb.write(outputstream);
		System.out.println("Data written successfully");
		outputstream.close();
		driver.quit();

	}

	@DataProvider(name = "CountryName")
	public String[] countryNameProvider() throws IOException {

		FileInputStream fileInputStream = new FileInputStream(inputFile);
		XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = wb.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Last row number " + (lastRowNum));

		String[] data = new String[lastRowNum];

		int colNum = 0;

		for (int rowNum = 0; rowNum < lastRowNum; rowNum++) {
			data[rowNum] = sheet.getRow(rowNum + 1).getCell(colNum).getStringCellValue();
		}

		// print the array
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("-------------------------------");

		return data;

	}
}
