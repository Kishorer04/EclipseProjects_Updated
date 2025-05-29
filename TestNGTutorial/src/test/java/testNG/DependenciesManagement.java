package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	
	//Problem 1: You have to Admit a student to Engineering
	//Problem 2: You have to Admit a student to higher secondary
	
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High school");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Higher secondary school");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("College");
	}

}
