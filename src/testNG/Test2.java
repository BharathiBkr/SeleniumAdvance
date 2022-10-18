package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void postStory() {
		Reporter.log("Post the Story", true);	
	}

}
