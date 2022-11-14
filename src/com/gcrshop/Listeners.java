package com.gcrshop;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Baseclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			screenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	

}
