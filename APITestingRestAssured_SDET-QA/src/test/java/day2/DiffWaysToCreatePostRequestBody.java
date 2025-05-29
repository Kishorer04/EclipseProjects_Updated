package day2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

/*
  Different ways to create POST request body
  1) Post request body using HashMap
  2) Post request body creation using Org.JSON
  3) Post request body creation using POJO class
  4) Post request using external json file data
 */

public class DiffWaysToCreatePostRequestBody {

	// 1. Post request body using HashMap
	
	@SuppressWarnings("unchecked")
	//@Test(priority=1)
	void testPostUsingHashMap() {
		
		Map jsonPayload = new HashMap();
		jsonPayload.put("name", "Kishore");
		jsonPayload.put("job", "Trainer");
			
		// FYI:
		// String[] courseArr = {"C","C++"};
		// jsonPayload.put("courses", courseArr);
		
		given()
		.contentType("application/json")
		.header("x-api-key","reqres-free-v1")
		.body(jsonPayload)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.body("name",equalTo("Kishore"))
		.body("job", equalTo("Trainer"))
		//.body("courses[0]",equalTo("C"))
		//.body("courses[1]",equalTo("C++"))
		.header("Content-Type","application/json; charset=utf-8") //equalTo() is not required for header verification
		.log().all();			
	}
	
	
	// 2. Post request using org.json library
	
	//@Test(priority=2)
	void testPostUsingJsonLibrary() {
		
        JSONObject data = new JSONObject();
        data.put("name", "Kishore");
        data.put("job", "Trainer");
        
		
		given()
		.contentType("application/json")
		.header("x-api-key","reqres-free-v1")
		.body(data.toString()) // toString() method should be used for JSONObject data
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.body("name",equalTo("Kishore"))
		.body("job", equalTo("Trainer"))
		.header("Content-Type","application/json; charset=utf-8") //equalTo() is not required for header verification
		.log().all();			
	}
	
	
	// 3. Post request using POJO class
	
	@Test(priority=3)
	void testPostUsingPOJO() {
		
		POJO_PostRequest data = new POJO_PostRequest();
		data.setName("Kishore");
		data.setJob("Trainer");
		
		given()
		.contentType("application/json")
		.header("x-api-key","reqres-free-v1")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.body("name",equalTo("Kishore"))
		.body("job", equalTo("Trainer"))
		.header("Content-Type","application/json; charset=utf-8") //equalTo() is not required for header verification
		.log().all();			
	}
	
	
	// 4. Post request using External JSON file
	
		//@Test(priority=4)
		void testPostUsingExternalJsonFile() throws FileNotFoundException {
			
			File file = new File("./body.json");
			FileReader fileReader = new FileReader(file);
			JSONTokener jsonTokener = new JSONTokener(fileReader);
			
			JSONObject data = new JSONObject(jsonTokener);
			
			given()
			.contentType("application/json")
			.header("x-api-key","reqres-free-v1")
			.body(data.toString())
			
			.when()
			.post("https://reqres.in/api/users")
			
			.then()
			.statusCode(201)
			.body("name",equalTo("Kishore"))
			.body("job", equalTo("Trainer"))
			.header("Content-Type","application/json; charset=utf-8") //equalTo() is not required for header verification
			.log().all();			
		}
		
}
