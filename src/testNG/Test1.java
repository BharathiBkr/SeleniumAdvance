package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	@Test
	public void seetheStore() {
		Reporter.log("See the Facebook Stroy", true);
		
	}

}
