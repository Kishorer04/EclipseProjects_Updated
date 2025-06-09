package day8;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser {
	
	@Test
	void test_updateUser(ITestContext context) {
		
		Faker faker = new Faker();
		
		JSONObject data = new JSONObject();
		
		data.put("name", faker.name().fullName());
		data.put("gender", "Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "active");
		
		
		String bearerToken = "40ace497108157c34ed37163bd07cfcf327e81e977bc5861adcd6ff482d3ef8f";
		
		int id = (int) context.getAttribute("user_id"); //This is coming from CreateUser request
		
		given()
		.headers("Authorization", "Bearer "+bearerToken)
		.contentType("application/json")
		.pathParam("id", id)
		.body(data.toString())
		
		.when()
		.put("https://gorest.co.in/public/v2/users/{id}") //Path param need to be mentioned in the URL. Query param need not to be mentioned in the URL
		
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
