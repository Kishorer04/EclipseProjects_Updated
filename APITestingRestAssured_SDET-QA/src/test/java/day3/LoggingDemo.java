package day3;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LoggingDemo {
	
	@Test
	void testLogs() {
		
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		//.log().body(); //Prints only Body
		//.log().cookies(); //Prints only Cookies
		//.log().headers(); //Prints only Headers
		.log().all(); //Prints everything from the response
	}

}
