package com.galaxe.TestCase;

import org.testng.Assert;
import org.testng.annotations.*;

import com.galaxe.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC002_Get_Single_Employee extends TestBase{
	
	
	public static void getSingleEmployee(String endPoint,double statusCode1,double responseTime1,String statusLine1,String contentType1,String serverType1) throws InterruptedException {
		
		logger.info("***Started TC002***");
		RestAssured.baseURI=uri;
		httpRequest=RestAssured.given();
		response=httpRequest.request(Method.GET,endPoint+empID);
		Thread.sleep(3000);
	
	
		logger.info("***Checking Response Body***");
		String responseBody=response.getBody().asString();
		logger.info("Response Body--->"+responseBody);
		Assert.assertEquals(responseBody.contains(empID),true);
		Thread.sleep(3000);
	
	
		logger.info("***Checking Status code***");
		int statusCode=response.getStatusCode();
		logger.info("Status code is--->"+statusCode);
		Assert.assertEquals(statusCode, statusCode1);
		Thread.sleep(3000);
	
	
		logger.info("***Checking Response Time***");
		long responseTime=response.getTime();
		logger.info("Response time is-->"+responseTime);
		if(responseTime>responseTime1) 
			logger.warn("Response time greater than 2000");
	     Assert.assertTrue(responseTime<responseTime1);
	     Thread.sleep(3000);
		
	
		logger.info("***Checking Status Line***");
		String statusLine=response.getStatusLine();
		logger.info("Status line is--->"+statusLine);
		Assert.assertEquals(statusLine,statusLine1);
		Thread.sleep(3000);
	
	
	
		logger.info("***Checking Content type***");
		String contentType=response.header("Content-Type");
		logger.info("Content type is" +contentType);
		Assert.assertEquals(contentType,contentType1);
		Thread.sleep(3000);
	
	
	
	
		logger.info("*****Checking Server Type*****");
		String serverType=response.header("Server");
		logger.info("Server type is--->"+serverType);
		Assert.assertEquals(serverType, serverType1);
		Thread.sleep(3000);
		
		logger.info("***TC002_FINISHED***");
		}
		
	}
		
	
	
	
//	@Test
//	void checkContentEncoding() throws InterruptedException {
//		logger.info("***Checking content encoding****");
//		String contentEncoding=response.header("Content-Encoding");
//		logger.info("Content encoding is--->"+contentEncoding);
//		Assert.assertEquals(contentEncoding,"gzip");
//		Thread.sleep(3000);
//		
//	}
//	
	
	
