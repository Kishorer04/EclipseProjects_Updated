package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	/*Scenario: A big basket is having different kinds of mobiles
	Let us say there are Apple phones, Moto, Vivo and Lenovo
	I want to run test only for VIVO and Moto phones. Write a program for that*/

@Test(groups= {"Apple"})
public void apple1() {
	System.out.println("Apple testing");
}

@Test(groups= {"Apple"})
public void apple2() {
	System.out.println("Apple testing");

}
@Test(groups= {"Moto"})
public void moto1() {
	System.out.println("Moto testing");

}
@Test(groups= {"Moto"})
public void moto2() {
	System.out.println("Moto testing");
}
@Test(groups= {"Vivo"})
public void vivo() {
	System.out.println("Vivo testing");

}
@Test(groups= {"Vivo"})
public void vivo2() {
	System.out.println("Vivo testing");
	
}
@Test(groups= {"Lenovo"})
public void lenovo() {
	
	System.out.println("Lenovo testing");

}

@Test(groups= {"Lenovo"})
public void lenovo2() {
	System.out.println("Lenovo testing");

}



}
