package day8;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CreateUser {
	
	
	
	@Test
	void testCreateUser(ITestContext context) {
		
		Faker faker = new Faker();
		
		JSONObject data = new JSONObject();
		
		data.put("name", faker.name().fullName());
		data.put("gender", "Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "inactive");
		
		
		String bearerToken = "40ace497108157c34ed37163bd07cfcf327e81e977bc5861adcd6ff482d3ef8f";
		
		int id = given()
		.headers("Authorization", "Bearer "+bearerToken)
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("https://gorest.co.in/public/v2/users")
		.jsonPath().getInt("id");
				
		System.out.println("Generated ID: "+ id);
		
		context.setAttribute("user_id", id); // This will set the attribute in the test level i.e. <test> to </test> in testng.xml
		
		//context.getSuite().setAttribute("user_id", id);  //This will set the attribute in the suite level. Refer testng2.xml
	}

}
