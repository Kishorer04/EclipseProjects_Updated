package day3;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {

	//@Test(priority=1)
		void testHeaders() {

			given()
			
			.when()
			.get("https://www.google.com/")
			
			.then()
			.header("Content-Type", "text/html; charset=ISO-8859-1") // Value captured from "CookiesAndHeaders" collection in Postman
		    .and() //Optional not mandatory
			.header("Content-Encoding", "gzip") // Note: Header value will be constant all the time (not all headers). Hence, validations can be done
			.and()  
			.header("Server", "gws")
		    .log().all();                                                              
		}
		
		@Test(priority=2)
		void getHeadersInfo() {
			
			Response res = given()
			
			.when()
			.get("https://www.google.com");
			
			//get single header info
			String headerValue = res.getHeader("Content-Type");
			System.out.println("Header value is --->" + headerValue);
			
			//get all headers info
			Headers headers = res.getHeaders();
			
			for(Header header: headers)
			{
				System.out.println(header.getName()+ "    "+header.getValue());
			}

		}
		
	
}
