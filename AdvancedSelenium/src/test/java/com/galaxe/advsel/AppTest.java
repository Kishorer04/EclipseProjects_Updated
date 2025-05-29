package com.galaxe.advsel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.galaxe.advsel_main.App;

public class AppTest{
	
App ap=new App();	


@BeforeMethod
@Parameters("browser")
public void test1(@Optional("IE")String browser) {
ap.before(browser);
	
}		



	@Test
	@Parameters({"username","password"})
	public void test(String username,String password) {
		ap.loginPage(username, password);
		
	}
	
	
	
	
	
	
}
