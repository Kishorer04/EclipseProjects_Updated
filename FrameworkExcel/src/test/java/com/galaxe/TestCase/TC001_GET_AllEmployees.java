package com.galaxe.TestCase;

import org.testng.Assert;
import org.testng.annotations.*;
import com.galaxe.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_GET_AllEmployees extends TestBase{
  
	
	
	
	public static void getAllEmployees(String endPoint,double statusCode1,double responseTime1, String statusLine1, String contentType1, String serverType1,String contentEncoding1, String cookie1) throws InterruptedException {
		
		logger.info("***Started TC001***");
		RestAssured.baseURI=uri;
		httpRequest=RestAssured.given();
		response=httpRequest.request(Method.GET,endPoint);
		Thread.sleep(2000);
		
		//RESPONSE BODY
		logger.info("***Checking Response Body***");
		String responseBody=response.getBody().asString();
		logger.info("Response Body--->"+responseBody);
		Assert.assertTrue(responseBody!=null);
		Thread.sleep(2000);
		
		
		//STATUS CODE
		logger.info("***Checking Status code***");
		int statusCode=response.getStatusCode();
		logger.info("Status code is--->"+statusCode);
		Assert.assertEquals(statusCode, statusCode1);
		Thread.sleep(2000);
		
		
		//RESPONSE TIME
		logger.info("***Checking Response Time***");
		double responseTime=response.getTime();
		logger.info("Response time is-->"+responseTime);
		if(responseTime>responseTime1) 
	    logger.warn("Response time greater than 2000");
	     Assert.assertTrue(responseTime<responseTime1);
	     Thread.sleep(2000);
	     
	     
	     
	     //STATUS LINE
	     logger.info("***Checking Status Line***");
			String statusLine=response.getStatusLine();
			logger.info("Status line is--->"+statusLine);
			Assert.assertEquals(statusLine,statusLine1);
			Thread.sleep(2000);
			
			//CONTENT TYPE
			
			logger.info("***Checking Content type***");
			String contentType=response.header("Content-Type");
			logger.info("Content type is" +contentType);
			Assert.assertEquals(contentType,contentType1);
			Thread.sleep(2000);
			
			
			//SERVER TYPE
			logger.info("*****Checking Server Type*****");
			String serverType=response.header("Server");
			logger.info("Server type is--->"+serverType);
			Assert.assertEquals(serverType, serverType1);
			Thread.sleep(2000);
			
			//CONTENT ENCODING
			
			logger.info("***Checking content encoding****");
			String contentEncoding=response.header("Content-Encoding");
			logger.info("Content encoding is--->"+contentEncoding);
			Assert.assertEquals(contentEncoding,contentEncoding1);
			Thread.sleep(2000);
			
			
			//COOKIES
			logger.info("******Checking cookies*****");
			String cookie=response.getCookie(cookie1);
			//Assert.assertEquals(cookie, "LAFHLSA");   
			Thread.sleep(3000);
			
			logger.info("***FINISHED TC001****");
			Thread.sleep(3000);
		
	}
}
	
	
	/*
	@Test
	void checkResponseBody() throws InterruptedException {
		logger.info("***Checking Response Body***");
		String responseBody=response.getBody().asString();
		logger.info("Response Body--->"+responseBody);
		Assert.assertTrue(responseBody!=null);
		Thread.sleep(3000);
	}
	
	
	@Test
	void checkStatusCode() throws InterruptedException {
		logger.info("***Checking Status code***");
		int statusCode=response.getStatusCode();
		logger.info("Status code is--->"+statusCode);
		Assert.assertEquals(statusCode, 300);
		Thread.sleep(3000);
	}
	
	
	@Test
	void checkResponseTime() throws InterruptedException {
		logger.info("***Checking Response Time***");
		long responseTime=response.getTime();
		logger.info("Response time is-->"+responseTime);
		if(responseTime>2000) 
			logger.warn("Response time greater than 2000");
	     Assert.assertTrue(responseTime<2000);
	     Thread.sleep(3000);
		
	}
	
	
	@Test
	
	void checkStatusLine() throws InterruptedException {
		logger.info("***Checking Status Line***");
		String statusLine=response.getStatusLine();
		logger.info("Status line is--->"+statusLine);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
		Thread.sleep(3000);
	}
	
	@Test
	void checkContentType() throws InterruptedException {
		logger.info("***Checking Content type***");
		String contentType=response.header("Content-Type");
		logger.info("Content type is" +contentType);
		Assert.assertEquals(contentType,"application/json; charset=utf-8");
		Thread.sleep(3000);
	}
	
	@Test
	void checkServerType() throws InterruptedException {
		logger.info("*****Checking Server Type*****");
		String serverType=response.header("Server");
		logger.info("Server type is--->"+serverType);
		Assert.assertEquals(serverType, "cloudflare");
		Thread.sleep(3000);
		
	}
	
	
	@Test
	void checkContentEncoding() throws InterruptedException {
		logger.info("***Checking content encoding****");
		String contentEncoding=response.header("Content-Encoding");
		logger.info("Content encoding is--->"+contentEncoding);
		Assert.assertEquals(contentEncoding,"gzip");
		Thread.sleep(3000);
		
	}
	
	
	
	//@BeforeMethod
//	void checkcontentLength() {
//		logger.info("*****Checking Content Length******");
//		String contentLength=response.header("Content-Length");
//		logger.info("Content length is--->"+contentLength);
//		if(Integer.parseInt(contentLength)<100)
//			logger.warn("content length is less than 100");
//		Assert.assertTrue(Integer.parseInt(contentLength)>100);
//	}
	
	@Test
	void checkCookies() throws InterruptedException {
		logger.info("******Cheking cookies*****");
		String cookie=response.getCookie("LAFHLSA");
		//Assert.assertEquals(cookie, "LAFHLSA");   
		Thread.sleep(3000);
	}
	
	
	@AfterClass
	void finish() throws InterruptedException {
		logger.info("***FINISHED TC001****");
		Thread.sleep(3000);
	}
	
	
}
*/