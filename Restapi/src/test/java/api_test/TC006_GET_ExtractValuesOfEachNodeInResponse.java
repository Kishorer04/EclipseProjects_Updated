package api_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC006_GET_ExtractValuesOfEachNodeInResponse {
	@Test
	  public void extractAllValuesFromResponse() {
		  
		  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		 	  
		 	  //request object
		 	  RequestSpecification httpRequest=RestAssured.given();
		 	  
		 	  //response object
		 	  Response response=httpRequest.request(Method.GET,"/Delhi");
		 			
		 	   JsonPath jsonpath=response.jsonPath(); //jsonpath class
//		 	   
//		 	 System.out.println(jsonpath.get("City")); //returns value of city name
//		 	 System.out.println(jsonpath.get("Temperature"));//returns value of Temperature 
//		 	 System.out.println(jsonpath.get("Humidity"));
//		 	 System.out.println(jsonpath.get("WeatherDescription"));
//		 	 System.out.println(jsonpath.get("WindSpeed"));
//		 	 System.out.println(jsonpath.get("WindDirectionDegree"));
//		 	   
		 	  }
		 	     
}
