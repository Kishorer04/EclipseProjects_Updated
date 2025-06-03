package day6;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



@Test
public class XmlSchemaValidation {

	@Test
	void xmlSchemaValidation() 
	{
		given()
		.accept("application/xml")
		
		.when()
		.get("https://petstore.swagger.io/v2/store/order/1")
		
		.then()
		.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("XmlSchema.xsd"));
		
		
	}
}
