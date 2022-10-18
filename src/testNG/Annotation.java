package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.asynchttpclient.util.HttpConstants.Methods;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
	 @Test 
	 public void test() { 
		 System.out.println("I am Test"); }
	 
	 
		/*
		 * @BeforeTest public void beforeTest2() {
		 * System.out.println("I am Before Test 2"); }
		 * 
		 * @AfterTest public void afterTest2() {
		 * System.out.println("I am After Test 2"); }
		 */
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("I am Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("I am After Method");
	  }
		/*
		 * @BeforeMethod public void beforeMethod2() {
		 * System.out.println("I am Before Method2"); }
		 * 
		 * @AfterMethod public void afterMethod2() {
		 * System.out.println("I am After Method2"); }
		 */


	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("I am Before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("I am After Class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("I am Before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  Reporter.log("I am After Test", true);
		  System.out.println("I am After Test");
	  }
	  @BeforeClass
	  public void beforeClass2() {
		  System.out.println("I am Before Class2");
	  }

	  @AfterClass
	  public void afterClass2() {
		  System.out.println("I am After Class2");
	  }
	  
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("I am Before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("I am After Suite");
	  }
}
//	  
//	  This is the Result of the TestNG Program:
//		  
//	  I am Before suite
	//I am Before Test
	//I am Before Test 2
	//I am Before Class
	//I am Before Class2
	//I am Before Method
	//I am Before Method2
	//I am Test
	//I am After Method
	//I am After Method2
	//I am Before Method
	//I am Before Method2
	//I am Test2
	//I am After Method
	//I am After Method2
	//I am After Class
	//I am After Class2
	//I am After Test
	//I am After Test 2
//	  I am After Suite
//	  
//	  From this Results some important Notes:
//		  1.Order of excecution is suite--test--class--method--testcase(original Test)
//		  2.If you have multiple test (testcase) under the single Methods.
//		    In Method line before1method--test--after1method,before1method--test2--after1method,
//		  3.If you have the multiple test,class,methods,testcases is run in alphapet order.
//		    that means first run the suite next run the test in alphapet order like others class,methods,testcase
//	 
	  



