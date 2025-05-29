package com.galaxe.TestCase;

import org.testng.Assert;
import org.testng.annotations.*;


import com.galaxe.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class TC005_DELETE_Employee_Record extends TestBase {
  
	
    public static void deleteEmployee(String endPoint,double statusCode1, String statusLine1, String serverType1) throws InterruptedException {
		logger.info("****Started TC005****");
		RestAssured.baseURI=uri;
		httpRequest=RestAssured.given();
	////	response=httpRequest.request(Method.GET,"/employees");
		
		//First get the JsonPath object instance from the Response interface
    ////    JsonPath jsonPathEvaluator = response.jsonPath();
		
		
	    //Capture id
	////    String empID=jsonPathEvaluator.get("[0].id");
		response=httpRequest.request(Method.DELETE,endPoint+empID); //Pass ID to delete record
		
		Thread.sleep(3000);
	
	
	
//	@Test
//	void checkResponseBody() throws InterruptedException {
//		logger.info("***Checking Response Body***");
//		String responseBody = response.getBody().asString();
//		logger.info("Response Body--->" + responseBody);
//		Assert.assertEquals(responseBody.contains("Successfully! Record has been deleted"), true);
//		Thread.sleep(3000);
//	}


		logger.info("***Checking Status code***");
		int statusCode = response.getStatusCode();
		logger.info("Status code is--->" + statusCode);
		Assert.assertEquals(statusCode, statusCode1);
		Thread.sleep(3000);

	
		logger.info("***Checking Status Line***");
		String statusLine = response.getStatusLine();
		logger.info("Status line is--->" + statusLine);
		Assert.assertEquals(statusLine, statusLine1);
		Thread.sleep(3000);
	

//	@Test
//	void checkContentType() throws InterruptedException {
//		logger.info("***Checking Content type***");
//		String contentType = response.header("Content-Type");
//		logger.info("Content type is" + contentType);
//		Assert.assertEquals(contentType, "text/html; charset=UTF-8");
//		Thread.sleep(3000);
//	}
	
	
		logger.info("*****Checking Server Type*****");
		String serverType = response.header("Server");
		logger.info("Server type is--->" + serverType);
		Assert.assertEquals(serverType, serverType1);
		Thread.sleep(3000);


		logger.info("***DELETE Request Completed***");
	}

}

