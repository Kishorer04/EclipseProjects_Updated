package day7;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Authentications {
	
	//@Test
	void testBasicAuthentication() {
		
		given()
		.auth().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
	}
	
	//@Test
	void testDigestAuthentication() {
		
		given()
		.auth().digest("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
	}
	
	//@Test
	void testPreemptiveAuthentication() {
		
		given()
		.auth().preemptive().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
	}
	
	//@Test
	void testBearerTokenAuthentication() {
		
		String bearerToken = "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";
		
		given()
		.headers("Authorization", "Bearer " + bearerToken)
		
		.when()
		.get("https://api.github.com/user/repos")
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
	
	//@Test
	void testOuth1Authentication() {
		
		given()
		.auth().oauth("consumerKey", "consumerSecret", "accessToken", "secretToken") // This is for OAuth 1.0 authentication
		
		.when()
		.get("url")  // Example API not available. This is just a sample
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	//@Test
	void testOuth2Authentication() {
		
		given()
		.auth().oauth2("accessToken") // This is for OAuth 2.0 authentication
		
		.when()
		.get("url") // Example API not available. This is just a sample
		
		.then()
		.statusCode(200)
		.log().all();

	}
	
	
	//@Test
	void testAPIKeyAuthentication() {
		
		//Method 1
		
		given()
		   .queryParam("appid", "1636440e024df50d861ea8c416241aa7")  //appid is APIKey
		   
		.when()
		.get("https://openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7")
		
		.then()
		.statusCode(200)
		.log().all();
		
		
		//Method 2
		
		given()
		
		.queryParam("appid", "1636440e024df50d861ea8c416241aa7")
		
		.pathParam("mypath", "data/2.5/forecast/daily")
		
		.queryParam("q", "Delhi")
		
		.queryParam("units", "metric")
		
		.queryParam("cnt", 7)
		
		.when()
		.get("https://openweathermap.org/{mypath}") // Need to refer path parameter using {} in the url. Need not refer query parameter in the url, it goes automatically
		
		
		.then()
		.statusCode(200)
		.log().all();
		
	}

}






















