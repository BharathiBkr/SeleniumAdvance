package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeMethod
	public void login() {
		Reporter.log("Enter the Valid Username and Password in login Page", true);	
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout After Finised Work", true);
		
	}

}
