package com.galaxe.advsel_main;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class App 
{
    
	
	@Parameters("browser" )
	public void before(String browser) {
		System.out.println("The browser name is"+ browser);
		
	}
	
	
    
    @Parameters({"username","password"})
    public void loginPage(String username, String password) {
   
     System.out.println("Username is"+  username);   
     System.out.println("Password is"+  password);
    }
}
