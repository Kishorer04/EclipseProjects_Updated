package api_test2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Reqres_TC004_GET {
  @Test
void listResource() {
	  
	  //specify base uri
	  RestAssured.baseURI="https://reqres.in";
	  
	  //request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	  //response object
	  Response response=httpRequest.request(Method.GET,"/api/unknown");
	  
	  //print response in console window
	  String responseBody= response.getBody().asString();
	  System.out.println("Response body is"+responseBody);
	  
	  //status code validation
	  int statuscode=response.getStatusCode();
	  System.out.println("The status code is  "+statuscode);
	  Assert.assertEquals(statuscode, 200);
  }
}
