package api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC007_Authentication {
  @Test
  public void Authorization() {
	  
	  //specify base uri
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  
	  
	  //Basic authentication
	  PreemptiveBasicAuthScheme authscheme = new PreemptiveBasicAuthScheme();
	  authscheme.setUserName("ToolsQA");
	  authscheme.setPassword("TestPassword");
	  
	  //type of authentication
	  RestAssured.authentication=authscheme;
	  
	  
	  //request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	  //response object
	  Response response=httpRequest.request(Method.GET,"/");
	  
	  //print response in console window
	  String responseBody= response.getBody().asString();
	  System.out.println("Response body is"+responseBody);
	
	  //status code validation
	  int statuscode=response.getStatusCode();
	  System.out.println("The status code is  "+statuscode);
	  Assert.assertEquals(statuscode, 200);
	  
	  
	
	  
  }
}
