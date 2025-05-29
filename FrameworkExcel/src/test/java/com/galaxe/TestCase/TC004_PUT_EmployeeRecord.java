package com.galaxe.TestCase;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.*;


import com.galaxe.base.TestBase;
import com.galaxe.utilities.RestUtils;

import io.restassured.RestAssured;
import io.restassured.http.Method;


public class TC004_PUT_EmployeeRecord extends TestBase {
	
	//RequestSpecification httpRequest;
	//Response response;
	static String empName=RestUtils.empName();
	static String empJob=RestUtils.empJob();
	//String empSalary=RestUtils.empSal();
	//String empAge=RestUtils.empAge();
  
	
	@SuppressWarnings("unchecked")
	

   public static void updateEmployee(String endPoint,double statusCode1,String statusLine1,String contentType1, String serverType1) throws InterruptedException {
	logger.info("*****TC004 Started*****");
	
	RestAssured.baseURI = uri;
	httpRequest = RestAssured.given();

	// JSONObject is a class that represents a simple JSON. We can add Key-Value
	// pairs using the put method

	JSONObject requestParams = new JSONObject();
	requestParams.put("name", empName);
	requestParams.put("job", empJob);
	//requestParams.put("age", empAge);

	// Add a header stating the request body is a JSON
	httpRequest.header("Content-Type", "application/json");

	// Add the Json to the body of the request

	httpRequest.body(requestParams.toJSONString());

	response = httpRequest.request(Method.PUT,endPoint+empID);
	Thread.sleep(5000);
	
  
		logger.info("***Checking Response Body***");
		String responseBody = response.getBody().asString();
		logger.info("Response Body--->" + responseBody);
		Assert.assertEquals(responseBody.contains(empName), true);
		Assert.assertEquals(responseBody.contains(empJob), true);

		Thread.sleep(3000);
	
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
	
	
		logger.info("***Checking Content type***");
		String contentType = response.header("Content-Type");
		logger.info("Content type is" + contentType);
		Assert.assertEquals(contentType, contentType1);
		Thread.sleep(3000);
	

		logger.info("*****Checking Server Type*****");
		String serverType = response.header("Server");
		logger.info("Server type is--->" + serverType);
		Assert.assertEquals(serverType, serverType1);
		Thread.sleep(3000);

	
	logger.info("***PUT Request Completed***");
	
}}
