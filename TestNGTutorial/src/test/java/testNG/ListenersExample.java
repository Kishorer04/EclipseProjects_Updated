package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");	
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub	
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub	
	}
	public void onStart(ITestContext context) {
		System.out.println("before everything");	
	}
	public void onFinish(ITestContext context) {
		System.out.println("after everything");	
	}

}
