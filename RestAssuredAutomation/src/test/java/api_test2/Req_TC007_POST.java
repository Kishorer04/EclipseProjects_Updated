package api_test2;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Req_TC007_POST {
  @Test
  public void create() {
	  
	//specify base uri
	  RestAssured.baseURI="https://reqres.in";
	  
	  //request object
	  RequestSpecification httpRequest=RestAssured.given(); 
	  
	
	  //request payload(body) sending along with post request
	  JSONObject requestParams= new JSONObject();
	  
	  requestParams.put("name", "morpheus");
	  requestParams.put("job", "leader");
	  
	  //specify header
	  httpRequest.header("Content-Type","application/json");
	  
	  //attach above data to the request
	  httpRequest.body(requestParams.toJSONString());
	  
	  //response object
	  Response response=httpRequest.request(Method.POST,"/api/users");
	  
	  
	  //print response in console window
	  String responseBody=response.getBody().asString();
	  System.out.println("Response body is"+responseBody);
	  
	  //status code validation
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is"+statusCode);
	  Assert.assertEquals(statusCode, 201);
	  
//	  //success code validation which is present inside the response
//	  String successCode =response.jsonPath().get("SuccessCode");
//	  Assert.assertEquals(successCode, "OPERATION_SUCCESS");
	  
  }
}
