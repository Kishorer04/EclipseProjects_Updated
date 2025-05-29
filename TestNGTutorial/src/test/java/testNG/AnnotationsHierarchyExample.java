package testNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class AnnotationsHierarchyExample {
  @Test
  public void test1() {
	  System.out.println("Im test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im beforeMethod");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im afterMethod");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im beforeClass");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Im afterClass");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im beforeTest");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("Im afterTest");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im beforeSuite");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("a");
  }

}
