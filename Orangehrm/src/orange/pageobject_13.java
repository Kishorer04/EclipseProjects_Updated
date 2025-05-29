package orange;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageobject_13 {
WebDriver driver;

	
	public pageobject_13(WebDriver driver) {
		this.driver=driver;
		
	}
	By Username = By.xpath("//input[@name='username']");
	By Password = By.xpath("//input[@type='password']");
	By Login = By.xpath("//button[@type='submit']");
	By Recruitment = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");
	By Add = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By First_Name = By.xpath("//input[@name='firstName']");
	By Middle_Name = By.xpath("//input[@name='middleName']");
	By Last_Name = By.xpath("//input[@name='lastName']");
	By Vacancy = By.xpath("//div[@tabindex='0']");
	By Email = By.xpath("//input[@class='oxd-input oxd-input--active']");
	By Contact_Number = By.xpath("//input[@class='oxd-input oxd-input--active']");
	By Resume = By.xpath("//div[@class='oxd-file-button']");
	By Keywords = By.xpath("//input[@class='oxd-file-button']");
	By Notes = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
	By Consent = By.xpath("//label[@class='oxd-label']");
	By Save = By.xpath("//button[@type='submit']");

//public String Vacancy(String Testdata ) {
//	return Testdata;
//}
//	List<WebElement> comp = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr//td[1]"));
//	int a = comp.size();
//	System.out.println(a);
//	for(int i=1;i<=a;i++) {
//	    System.out.println( driver.findElement(
//	            By.xpath("(//table[contains(@id,'customers')]//tr[" + (i+1) +"]//td[1])")).getText());
//	
//	public String number_of_record(int k) {
//  	  int iCount = driver.findElements(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border']")).size();
//     return"(//*[@class='oxd-table-row oxd-table-row--with-border'])["+k+"]";
//	}
    public String Vacancy(int k) {
  	  return"//div[@class='oxd-text oxd-text--p']) ["+k+"]";
    }
    public String Candidate(int k) {
    	  return"//div[@class='oxd-text oxd-text--p']) ["+k+"]";
      }
    public String HiringManager(int k) {
  	  return"//div[@class='oxd-text oxd-text--p']) ["+k+"]";
    }
    }

