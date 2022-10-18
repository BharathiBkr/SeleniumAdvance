package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is Start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Success");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test is Success on particular Percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Program is excution start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Program is excution is finished");
		
	}

	

	
}
