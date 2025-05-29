package day3;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {

	//@Test(priority=1)
	void testCookies() {

		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.cookie("AEC","AVcja2fmQf1OtB7W_csqIWfLtspLhky9U3nC6QxlYd4qurDoQ2JCezrh8w") // Value captured from "CookiesAndHeaders" collection in Postman
		.log().all();                                                               // Note: Cookie value will be changing dynamically after each request. So mostly Cookie validations won't be done.
	}
	
	
	@Test(priority=2)
	void getCookiesInfo() {
		
		Response res = given()
		
		.when()
		.get("https://www.google.com");
		
		//get single cookie info
		String cookieValue = res.getCookie("AEC");
		System.out.println("Cookie value is --->" + cookieValue);
		
		//get all cookies info
		Map<String,String> cookiesValues = res.getCookies();
		
		for(String key: cookiesValues.keySet())
		{
			String cValue = res.getCookie(key);
			System.out.println(key+ "    "+cValue);
		}

	}
}
