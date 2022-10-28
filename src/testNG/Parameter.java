package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters("Name") //This "Name" is must present in the XML file parameter name=" "..what name u want type tin the value comment section
	public void giveAddress(String Place ) {
		System.out.println("The Name is  "+Place);	
	}

}
//Parameter Comment is used to give the input through the XML file...parameter.xml
//In TestNG Parameters is annotation give the special name to identification
//In XML File Before Class Add the parameter comment give the name to call the particular testNG method to be mentioned parameter .
