package com.gcrshop;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerners extends Baseclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			screenshots(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
