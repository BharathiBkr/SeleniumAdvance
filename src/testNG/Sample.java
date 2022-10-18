package testNG;

import org.testng.annotations.Test;

public class Sample {
	//  Instruction about TestNG:
	//	1.Download the TestNG software From Eclipse-Help-Install New Software-Add-Give the Name,Put the  TestNG Download Url 
	//	  get the url from offical TestNG Website specially for eclipse.Click Next.
	//	2.Once Its Downloaded Tick the box click Finsh Button.
	//	3.In case you get a prompt "Do you trust unsigned content of unknown origin", 
	//	   hit the checkbox in the "UnSigned" and click on "Trust selected".
	//	4.Eclipse is restart.
	//	5.Create the new Package like testNG.
	//	6.Create the new class like Sample.
	//	7.Build Configure Process:
	//	    i)Right Click the testNG Package--go to build configure--go to lib
	//      --go to Classpath--Click Add Lib-Select  the TestNG Lib--apply  -- This is very Important
	//  8.All the program under the method.TestNg not have the main method.
	
	@Test(priority = 0) //priority is used to order of excecution 
	//(ie.if you give the priority =0 to the method.that method excecute first )order is index type 0,1,2,3,....
	public void name() {
		System.out.println("Bharathiraj");
	}
	@Test(priority = 1)
	public void id() {
		System.out.println("24");
	}
	@Test(priority = 3)
	public void address() {
		System.out.println("Chithambarapuram");	
	}
	@Test(priority = 2)
	public void fatherName() {
		System.out.println("Gunaraj");
	}
	//If you want to skip the any menthod using enabled boolean attribute(enbaled=false)
	@Test (priority = 4,enabled = false)
	public void bikeNo() {
		System.out.println("TN74AA3513");	
	}

	
}
