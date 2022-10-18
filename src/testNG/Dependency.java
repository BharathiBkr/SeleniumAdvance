package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency {
	//Dependency means oru method ai sarnthu..havemoney is depend on depositmoney.if you depositmoney is false you get the error
	@Test
	public void noMoney() {
		Reporter.log("No money", false);
	}
	@Test //is it false so next dependency related methos are not happen
	public void depositMoney() {
		Reporter.log("In Account=10.00",true);
	}
	@Test (dependsOnMethods = "depositMoney")
	public void haveMoney() {
		System.out.println("In my Bank Account Bal is 10.00");
	}
	@Test (dependsOnMethods = "haveMoney")
	public void buyBanana() {
		System.out.println("one Banana is Rs.10");	
	}
	
	//Mutiple class in single run  comment using XML format---go to desktop--XML Hint---Mutiple

}
