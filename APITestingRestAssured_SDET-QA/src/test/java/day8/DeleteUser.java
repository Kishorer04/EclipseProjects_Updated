package day8;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DeleteUser {
	
	@Test
	void test_deleteUser(ITestContext context) {
		
	    String bearerToken = "40ace497108157c34ed37163bd07cfcf327e81e977bc5861adcd6ff482d3ef8f";
		
	    int id = (int) context.getAttribute("user_id"); //This is coming from CreateUser request
		
		given()
		.headers("Authorization", "Bearer "+bearerToken)
		.pathParam("id",id)
		
		.when()
		.delete("https://gorest.co.in/public/v2/users/{id}") //Path param need to be mentioned in the URL. Query param need not to be mentioned in the URL
		
		.then()
		.statusCode(204)
		.log().all();
	}

}
