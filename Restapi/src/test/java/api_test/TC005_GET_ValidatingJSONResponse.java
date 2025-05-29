package api_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_GET_ValidatingJSONResponse {
  @Test
  public void validateJSONResponse() {
	  
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	 	  
	 	  //request object
	 	  RequestSpecification httpRequest=RestAssured.given();
	 	  
	 	  //response object
	 	  Response response=httpRequest.request(Method.GET,"/Delhi");
	 			
	 	  //print response in console window
	 	  String responseBody= response.getBody().asString();
	 	  System.out.println("Response body is"+responseBody);
	 	  
	 	  Assert.assertEquals(responseBody.contains("Delhi"), true);
	 	    
	 	  }
	 	     
	 	  
}

