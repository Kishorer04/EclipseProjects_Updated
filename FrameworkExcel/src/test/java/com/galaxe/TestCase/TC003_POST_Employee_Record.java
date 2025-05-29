package com.galaxe.TestCase;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.*;

import com.galaxe.base.TestBase;
import com.galaxe.utilities.RestUtils;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC003_POST_Employee_Record extends TestBase {

	
	static String empName = RestUtils.empName();
	static String empJob=RestUtils.empJob();

	@SuppressWarnings("unchecked")

	
	public static void createEmployee(String endPoint,double statusCode1,String statusLine1,String serverType1) throws InterruptedException {
		logger.info("****Started TC003****");
		RestAssured.baseURI = uri;
		httpRequest = RestAssured.given();

		// JSONObject is a class that represents a simple JSON. We can add Key-Value
		// pairs using the put method

		JSONObject requestParams = new JSONObject();
		requestParams.put("name", empName);
		requestParams.put("job",empJob);
		//requestParams.put("employee_age", empAge);

		// Add a header stating the request body is a JSON
		httpRequest.header("Content-Type", "application/json");

		// Add the Json to the body of the request

		httpRequest.body(requestParams.toJSONString());
		Thread.sleep(5000);
		response = httpRequest.request(Method.POST,endPoint);
		
	

		logger.info("***Checking Response Body***");
		String responseBody = response.getBody().asString();
		logger.info("Response Body--->" + responseBody);
		Assert.assertEquals(responseBody.contains(empName), true);
		Assert.assertEquals(responseBody.contains(empJob), true);
		Thread.sleep(2000);
	
		
		logger.info("***Checking Status code***");
		int statusCode = response.getStatusCode();
		logger.info("Status code is--->" + statusCode);
		Assert.assertEquals(statusCode, statusCode1);
		Thread.sleep(2000);
	
	
		logger.info("***Checking Status Line***");
		String statusLine = response.getStatusLine();
		logger.info("Status line is--->" + statusLine);
		Assert.assertEquals(statusLine, statusLine1);
		Thread.sleep(2000);
	

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
		Thread.sleep(2000);
	
		logger.info("***POST Request Completed***");
	
}
}
