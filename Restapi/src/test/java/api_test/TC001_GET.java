package api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET {
  @Test
  void getWeatherDetails() {
	  
	  //specify base uri
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  
	  //request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	  //response object
	  Response response=httpRequest.request(Method.GET,"/Hyderabad");
	  
	  //print response in console window
	  String responseBody= response.getBody().asString();
	  System.out.println("Response body is"+responseBody);
	  
	  //status code validation
	  int statuscode=response.getStatusCode();
	  System.out.println("The status code is"+statuscode);
	  Assert.assertEquals(statuscode, 200);
	  
	  //status line validation
	  String statusline=response.getStatusLine();
	  System.out.println("The status line is"+statusline);
	  Assert.assertEquals(statuscode, "HTTP/1.1 200 OK");
	  
	  
  }
}
