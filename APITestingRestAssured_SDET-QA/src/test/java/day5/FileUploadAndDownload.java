package day5;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

public class FileUploadAndDownload {
	
	@Test(priority=1)
	void singleFileUpload() {
		
		File myFile = new File("C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Desktop\\sample.txt");
				
		given()
		.multiPart("file", myFile)  //Similar to form-data in Postman
		.contentType("multipart/form-data") //Mandatory to specify
		
		
		.when()
		.post("http://localhost:8080/uploadFile")
		
		.then()
		.statusCode(200)
		.body("fileName", equalTo("sample.txt"))
		.log().all();
		
	}
	
	//@Test
	void multipleFilesUpload() {
		
		File myFile1 = new File("C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Desktop\\sample.txt");
		File myFile2 = new File("C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Desktop\\testfile.docx");
				
		given()
		.multiPart("files", myFile1)  //Similar to form-data in Postman
		.multiPart("files", myFile2)
		.contentType("multipart/form-data")
		
		
		.when()
		.post("http://localhost:8080/uploadMultipleFiles")
		
		.then()
		.statusCode(200)
		.body("[0].fileName", equalTo("sample.txt"))
		.body("[1].fileName", equalTo("testfile.docx"))
		.log().all();
		
	}
	
	
	//@Test
	void multipleFilesUpload2() {  // Wont work for all kinds of APIs. But good to know.
		
		File myFile1 = new File("C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Desktop\\sample.txt");
		File myFile2 = new File("C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Desktop\\testfile.docx");
				
		File[] fileArr = {myFile1, myFile2};
		
		given()
		.multiPart("files", fileArr)  //Similar to form-data in Postman
		.contentType("multipart/form-data")
		
		
		.when()
		.post("http://localhost:8080/uploadMultipleFiles")
		
		.then()
		.statusCode(200)
		.body("[0].fileName", equalTo("sample.txt"))
		.body("[1].fileName", equalTo("testfile.docx"))
		.log().all();	
	}
	
	
	@Test(priority=2)
	void fileDownload() {
		
		given()
		
		.when()
		.get("http://localhost:8080/downloadFile/sample.txt") // Got this URL from file upload response
		
		.then()
		.statusCode(200)
		.log().body();
	}

}
