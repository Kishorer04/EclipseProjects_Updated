package testNG;

import org.testng.annotations.Test;

public class DriveACar {

	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the car");	
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("Put 1st gear");
	}
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Put 2nd gear");
	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Put 3rd gear");
	}
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("Put 4th gear");
	}
	
}
