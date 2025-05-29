package api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GET {
  @Test
 void googleMapTest() {
	  
	  //specify base uri
	  RestAssured.baseURI="http://maps.googleapis.com";
	  
	  //request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	  //response object
	  Response response=httpRequest.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AlzaSyBjGCE3VpLU4IgTqSTDmHmJ2HoELb4Jy1s");
			
	  //print response in console window
	  String responseBody= response.getBody().asString();
	  System.out.println("Response body is"+responseBody);
	  
	  
	  //status code validation
	  int statuscode=response.getStatusCode();
	  System.out.println("The status code is  "+statuscode);
	  Assert.assertEquals(statuscode, 200);
	  
	  
	  //capture details of headers from response
	   
	  String contentType=response.header("Content-Type");//capture details of Content-Type header
	  System.out.println("The content type is"+contentType);
	  Assert.assertEquals(contentType, "application/xml; charset=UTF-8");
	  
	  
	  String contentEncoding=response.header("Content-Encoding");//capture details of Content-Type header
	  System.out.println("The content encoding is"+contentEncoding);
	  Assert.assertEquals(contentEncoding, "gzip");
	  
	  
	   
	  
	  
	  
	  
	  
//	  //status code validation
//	  int statuscode=response.getStatusCode();
//	  System.out.println("The status code is"+statuscode);
//	  Assert.assertEquals(statuscode, 200);
//	  
//	  //status line validation
//	  String statusline=response.getStatusLine();
//	  System.out.println("The status line is"+statusline);
//	  Assert.assertEquals(statuscode, "HTTP/1.1 200 OK");
	  
  }
  }