package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import driver.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps extends DriverInstance {


	
//	@Given("User should navigate to the application")
//	public void userShouldNavigateToTheApplication() {
//		
//	}

	@Given("User should login as {string} and {string}")
	public void userShouldLoginAsAnd(String username, String password) {

		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("(//input[@id='mat-input-0'])[1]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();

	}

	@Given("user should search a {string}")
	public void userShouldSearchA(String book) {
		driver.findElement(By.xpath("//input[@aria-label='search']")).sendKeys(book);
		driver.findElement(By.xpath("(//mat-option[@role='option'])[1]")).click();

	}

	@When("User add the book to the cart")
	public void userAddTheBookToTheCart() throws InterruptedException {
    Thread.sleep(5000);
//    driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[6]//preceding-sibling::span[contains(text(),'Add to Cart')]")).click();
    driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[7]//preceding-sibling::span[2]")).click();
    Thread.sleep(4000);
	}	

	@Then("the cart badge should be updated")
	public void theCartBadgeShouldBeUpdated() {

		String text = driver.findElement(By.xpath("//span[@id='mat-badge-content-0']")).getText();
        Assert.assertEquals(Integer.parseInt(text)>0, true);
//        driver.quit();
	}

}
