package day8;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetUser {

	@Test
   void test_getUser(ITestContext context) {
		
		int id = (int) context.getAttribute("user_id"); //This is coming from CreateUser request. This will get the attribute in the test level i.e. <test></test> in testng.xml
		
		//int id = (int) context.getSuite().getAttribute("user_id"); //This will get the attribute in the suite level. Refer testng2.xml
		
		String bearerToken = "40ace497108157c34ed37163bd07cfcf327e81e977bc5861adcd6ff482d3ef8f";
	   
	   given()
	   .headers("Authorization", "Bearer "+ bearerToken)
	   .pathParam("id", id)

	   .when()
	   .get("https://gorest.co.in/public/v2/users/{id}") //Path param need to be mentioned in the URL. Query param need not to be mentioned in the URL
	   
	   .then()
	   .statusCode(200)
	   .log().all();
   }
}
