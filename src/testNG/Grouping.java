package testNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test (groups = {"Fruit"})
	public void apple() {
		System.out.println("This is apple");
	}
	@Test(groups = {"Fruit"} )
	public void orange() {
		System.out.println("This is orange");
	}
	@Test(groups = {"Fruit"})
	public void banana() {
		System.out.println("This is banana");
	}
	@Test(groups = {"Fruit"})
	public void graps() {
		System.out.println("This is graps");
	}
	@Test(groups = {"Juice"})
	public void jackfruit() {
		System.out.println("This is jackfruit");
	}
	@Test(groups = {"Juice","Friut"})
	public void fruitmix() {
		System.out.println("This is fruit Mix");	
	}
	@Test(groups = {"Juice"})
	public void appleJuice() {
		System.out.println("This is appleJuice");
	}
	@Test(groups = {"Juice"})
	public void orangeJuice() {
		System.out.println("This is orangeJuice");
	}
	@Test(groups = {"Juice"})
	public void bananaJuice() {
		System.out.println("This is bananaJuice");
	}

}
//Run By XML File Go tho the XML File-Name-TestNG.xml
//Include comment is used to mention group name onlt is run or test
//Exclude is opposite to include
//More Hints are available in XML Hint Folder and Grouping File
