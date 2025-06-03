package day5;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

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
		
		
		//Approach 2
		
		Response res = 
		given()
		.accept("application/xml") // To give response in XML format. Default is Json.
		
		.when()
		.get("https://petstore.swagger.io/v2/store/order/1");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml");
		
		String status = res.xmlPath().get("Order.status").toString();
		Assert.assertEquals(status, "placed");
	}
	
	
	@Test
	void testXMLResponseBody() {
		
		//Approach 3
		
		Response res = 
				given()
				.accept("application/xml") // To give response in XML format. Default is Json.
				
				.when()
				.get("https://petstore.swagger.io/v2/store/order/1");
				
			XmlPath xmlPath = new XmlPath(res.asString()); // Using asString() bcoz it returns the actual response body as a plain String
            											   // toString() returns a summary string about the response object (e.g., memory address or class info)
			   											   // It does not give the actual response content.
			
			//Use XmlPath class for various purposes
			//Example usage --> xmlPath.getList()
			//Implementation is not shown here since test data is not available.	
			//Refer day4.ParsingJsonResponseData.java for examples using Json response.
	}
}
