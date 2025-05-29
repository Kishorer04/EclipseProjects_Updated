package com.galaxe.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.galaxe.TestCase.TC001_GET_AllEmployees;
import com.galaxe.TestCase.TC002_Get_Single_Employee;
import com.galaxe.TestCase.TC003_POST_Employee_Record;
import com.galaxe.TestCase.TC004_PUT_EmployeeRecord;
import com.galaxe.TestCase.TC005_DELETE_Employee_Record;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestBase {
	
	
	public static RequestSpecification httpRequest;
	public static Response response;
	public static String empID="2";
	public static String uri="https://reqres.in";
	public static Logger logger;
	public static String excelurl="C:\\Users\\kravikumar\\apiexcel.xlsx";
	
	
	@Test
	public static void test() throws IOException, InterruptedException 
	{
    logger=Logger.getLogger("EmployeesRestAPI");//added logger
    PropertyConfigurator.configure("Log4j.properties");//added logger
    logger.setLevel(Level.INFO);
	//Path of the excel file
    FileInputStream fs = new FileInputStream(excelurl);
    //Creating a workbook
    XSSFWorkbook workbook = new XSSFWorkbook(fs);
    XSSFSheet sheet = workbook.getSheetAt(0);

    int rowcount = sheet.getLastRowNum();
	
    for(int i=2;i<=rowcount;i++) {
    	   String  title = sheet.getRow(i).getCell(1).getStringCellValue();
    	   String  endPoint = sheet.getRow(i).getCell(3).getStringCellValue();
    	    //String httpRequestType = sheet.getRow(i).getCell(4).getStringCellValue();
    	    double statusCode1 = sheet.getRow(i).getCell(8).getNumericCellValue();
 	        double responseTime1 = sheet.getRow(i).getCell(9).getNumericCellValue();
    	    String statusLine1 = sheet.getRow(i).getCell(10).getStringCellValue();
    	    String contentType1 = sheet.getRow(i).getCell(11).getStringCellValue();
    	    String serverType1 = sheet.getRow(i).getCell(12).getStringCellValue();
    	    String contentEncoding1 = sheet.getRow(i).getCell(13).getStringCellValue();
    	    String cookie1 = sheet.getRow(i).getCell(14).getStringCellValue();
    	    
    	    
    	    if(title.equals("Get AllEmployees")) {
    	    	TC001_GET_AllEmployees.getAllEmployees(endPoint,statusCode1,responseTime1,statusLine1,contentType1,serverType1,contentEncoding1,cookie1);
    	    }
    	    else if(title.equals("Get SingleEmployee")) {
    	    	TC002_Get_Single_Employee.getSingleEmployee(endPoint,statusCode1,responseTime1,statusLine1,contentType1,serverType1);
    	    }
    	    else if(title.equals("Create Employee")) {
    	    	TC003_POST_Employee_Record.createEmployee(endPoint,statusCode1,statusLine1,serverType1);
    	    }
    	    else if(title.equals("Update Employee")) {
    	    	TC004_PUT_EmployeeRecord.updateEmployee(endPoint, statusCode1, statusLine1, contentType1, serverType1);
    	    }
    	    else if(title.equals("Delete Employee")) {
    	    	TC005_DELETE_Employee_Record.deleteEmployee(endPoint, statusCode1, statusLine1, serverType1);
    	    }
    	    	
    	    
    	    
    }
  }
}
	
	
	
//	public void test() throws IOException, InterruptedException {
//		   //Path of the excel file
//        FileInputStream fs = new FileInputStream(excelurl);
//        //Creating a workbook
//        XSSFWorkbook workbook = new XSSFWorkbook(fs);
//        XSSFSheet sheet = workbook.getSheetAt(0);
//
//        int rowcount = sheet.getLastRowNum();
//
//        for(int i=2;i<=rowcount;i++) {
//        	   String endpoint = sheet.getRow(i).getCell(3).getStringCellValue();
//        	    String httpRequestType = sheet.getRow(i).getCell(4).getStringCellValue();
//        	    String statusCode = sheet.getRow(i).getCell(8).getStringCellValue();
//        	    String responseTime = sheet.getRow(i).getCell(9).getStringCellValue();
//        	    String statusLine = sheet.getRow(i).getCell(10).getStringCellValue();
//        	    String contentType = sheet.getRow(i).getCell(11).getStringCellValue();
//        	    String serverType = sheet.getRow(i).getCell(12).getStringCellValue();
//        	    String contentEncoding = sheet.getRow(i).getCell(13).getStringCellValue();
//        	    String cookies = sheet.getRow(i).getCell(14).getStringCellValue();
//}
//	}
	
