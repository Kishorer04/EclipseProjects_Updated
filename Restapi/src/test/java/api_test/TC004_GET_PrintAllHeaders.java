package api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_PrintAllHeaders {
  @Test
  public void printAllHeaders() {
	  
 RestAssured.baseURI="http://maps.googleapis.com";
	  
	  //request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	  //response object
	  Response response=httpRequest.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AlzaSyBjGCE3VpLU4IgTqSTDmHmJ2HoELb4Jy1s");
			
	  //print response in console window
	  String responseBody= response.getBody().asString();
	  System.out.println("Response body is"+responseBody);
	  
	  
	  Headers allheaders= response.headers();//capture all the headers from response
	  
	  for(Header header:allheaders) {     //Header is a class to hold header key and header value
		  System.out.println(header.getName()+"    "+header.getValue());   
	  }
	     
	  
  }
}
