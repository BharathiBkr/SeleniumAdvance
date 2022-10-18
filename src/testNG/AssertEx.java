package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEx {
	@Test
	public void name() {
		String aname="Bharathiraj";
		String ename="Bharathraj";
		Assert.assertEquals(aname, ename);
		Reporter.log("This Is Same", false);
		
		
	}

}
