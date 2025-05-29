package day5;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class ParsingXMLResponse {
	
	@Test
	void testXMLResponse() {
		
		//Approach 1
		
		given()
		.accept("application/xml") // To give response in XML format. Default is Json.
		
		.when()
		.get("https://petstore.swagger.io/v2/store/order/1")
		
		.then()
		.statusCode(200)
		.header("Content-Type","application/xml")
		.body("Order.status", equalTo("placed"));	
	}
}
