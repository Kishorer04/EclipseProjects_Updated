package datadrivenapitest;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDriven_AddNewEmployees {
  
	
 @SuppressWarnings("unchecked")
 
@Test(dataProvider="empdataprovider")
  public void postNewEmployees(String name,String job) throws InterruptedException {
	  
	 

	   Logger logger=Logger.getLogger("API Automation");
       PropertyConfigurator.configure("Log4j.properties"); 
	  
		//specify base uri
	     // Thread.sleep(3000);
		  RestAssured.baseURI="https://reqres.in";
		  
		  //request object
		  RequestSpecification httpRequest=RestAssured.given(); 
		  
		
		  //request payload(body) sending along with post request
		  JSONObject requestParams= new JSONObject();
		  
		  requestParams.put("name",name);
		  requestParams.put("job",job);
		//  requestParams.put("age",eage);
		  
		  
		  //specify header
		  httpRequest.header("Content-Type","application/json");
		  
		  //attach above data to the request
		  httpRequest.body(requestParams.toJSONString());
		  
		  //response object
		  Thread.sleep(6000);
		  Response response=httpRequest.request(Method.POST,"/api/users");
		  logger.info("Request sent");
		  
		  //print response in console window
		  String responseBody=response.getBody().asString();
		  System.out.println("Response body is"+responseBody);
		  
		  //validation of ename,esal,eage
		  Assert.assertEquals(responseBody.contains(name),true);
		  Assert.assertEquals(responseBody.contains(job),true);
		 // Assert.assertEquals(responseBody.contains(eage),true);
          
		  //validation of status code
		  int statuscode=response.getStatusCode();
		  System.out.println("The status code is  "+statuscode);
		  Assert.assertEquals(statuscode, 201);
  }
 
 
 
 
	
	@DataProvider(name="empdataprovider")
	public String[][] getEmpData() throws IOException, InterruptedException{
	//	String path=System.getProperty("user.dir")+"/src/test/java/datadrivenapitest/datadrivenapi1.xlsx";
		//int rowcount=XLUtils.getRowCount(path, "Sheet1");
		//int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		//String empdata[][]=new String[rowcount][colcount];
		String 	empdata[][]= {
				{"kishore","mmm"},
				{"tvb","kjjj"}
	     };
		
	
		
//		for(int i=1;i<=rowcount;i++) {
//			for(int j=0;j<colcount;j++) {
//			empdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
//			}
//		}
		return empdata;
	}
	
	
	
	
	
	
	
}
