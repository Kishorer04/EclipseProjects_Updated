package stepdef;

import org.openqa.selenium.By;

import driver.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends DriverInstance{

    
    @Given("Launch Open Cart application URL")
    public void launchOpenCartApplicationURL() {
    	driver.get("https://www.orangehrm.com/en/30-day-free-trial"); 
       
    }
    
    @Given("Enter valid {string} and  {string} and {string}")
    public void enterValidAndAnd(String string, String string2, String string3) {
    	
      driver.findElement(By.xpath("//*[@id=\"Form_getForm_Name\"]")).sendKeys(string);
      driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys(string2);
      driver.findElement(By.xpath("//*[@id=\"Form_getForm_Contact\"]")).sendKeys(string3);
      System.out.println("Phone Number: "+string3);
    }
    
    @When("Click on login button")
    public void clickOnLoginButton() {
    	driver.findElement(By.id("Form_getForm_action_submitForm")).click();
    }
    
    @Then("Application should open landing page")
    public void applicationShouldOpenLandingPage() {
   
    }
   
    }

