package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
	
	// Never keep assertions in the Page class. Keep assertions in the Test class 
	
	private Locator usernameLocator;
	
	private Locator passwordLocator;
	
	private Locator submitButtonLocator;
	
	public LoginPage(Page page) {
		
		usernameLocator= page.getByPlaceholder("Enter Email");
		
		passwordLocator = page.getByPlaceholder("Enter Password");
		
		submitButtonLocator = page.locator(".submit-btn");
	}
	
	// Approach - Create login method and pass parameter
	
	
	public void loginToApplication(String userName, String password) {
		
		usernameLocator.fill(userName);
		
		passwordLocator.fill(password);
		
		submitButtonLocator.click();
		
	}

}
