package day3;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class PathAndQueryParameters {
	
	//https://reqres.in/api/users?page=2&id=5
	
	@Test
	void testQueryAndPathParameters() {
		
		given()
		
		.header("x-api-key","reqres-free-v1")
		// .pathParam("mypath1", "api") // Can mention this also as path parameter
		.pathParam("mypath", "users")  //path parameter
        .queryParam("page", 2) //query parameter		
        .queryParam("id", 5) //query parameter
        
		.when()
		.get("https://reqres.in/api/{mypath}") //Have to mention only path parameter in the url with {}. Query parameter will 
		                                       // automatically go along with the request, don't need to mention in the url.
		
		.then()
		.statusCode(200)
		.log().all();	
	}

}
