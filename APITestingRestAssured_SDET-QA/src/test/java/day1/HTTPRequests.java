package day1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

/*
  given()
  content type, set cookies, add auth, add param, set headers info etc.
  
  when()
  get, post, put, delete
 
  then()
  validate status code, extract response, extract headers cookies and response body
 */


public class HTTPRequests {
	
	int id;
	
	@Test(priority=1)
	void getUsers() {
		
		given()
		
		.when()
		   .get("https://reqres.in/api/users?page=2")
		   
		.then()
		    .statusCode(200)
			.body("page",equalTo(2))
			.log().all();  //Prints the response in the console
	}
	
	@Test(priority=2)
	void createUser() {
		
		Map<String, String>  jsonPayload = new HashMap<String, String>();
		jsonPayload.put("name", "kishore");
		jsonPayload.put("job", "trainer");
		
		
		id=given()
		.contentType("application/json")
		.header("x-api-key","reqres-free-v1")
		.body(jsonPayload)
		
		.when()
		  .post("https://reqres.in/api/users")
		  .jsonPath().getInt("id");
		  
//		.then()
//		.statusCode(201)
//		.log().all();
	}
	
	
	@Test(priority=3, dependsOnMethods= {"createUser"})
	void updateUser() {
		
		Map<String, String>  jsonPayload = new HashMap<String, String>();
		jsonPayload.put("name", "karthik");
		jsonPayload.put("job", "student");
		
		given()
		.contentType("application/json")
		.header("x-api-key","reqres-free-v1")
		.body(jsonPayload)
		
		.when()
		  .put("https://reqres.in/api/users/"+id)
		  
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	@Test(priority=4)
	void deleteUser() {
		
		given()
		.header("x-api-key","reqres-free-v1")
		
		.when()
		.delete("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(204)
		.log().all();
	}
}
