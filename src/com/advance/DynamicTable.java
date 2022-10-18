package com.advance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/dynamicgrid.xhtml");
		//Count the Total Column 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		List<WebElement> noOfColoum=driver.findElements(By.tagName("th"));//th is column tag name
		int totalcolum=noOfColoum.size();
		System.out.println(totalcolum);

		//Count the total rows;

		List<WebElement> noOfRows=driver.findElements(By.tagName("tr"));
		int totalRows=noOfRows.size();
		System.out.println(totalRows);

		//		//Interact with Dynamic Table;ex.get the activity of Leon Adams
		//		//1.Using Name get the activity
		//		WebElement activity=driver.findElement(By.xpath("//td[normalize-space()=\"Leon Adams\"]//following::td[3]"));
		//		//This is the Dynamic Table Xpath Syntax(//tagname[normalize-space()='Attribute value']//following::cell position)
		//		String Value=activity.getText();
		//		System.out.println(Value);//Get the excepiton bcz this is dynamic table name is changed every sec.//Following is forward direction

		//2.Using Status get the name
		WebElement status=driver.findElement(By.xpath("//td[normalize-space()='UNQUALIFIED']//preceding::td[2]"));
		//Preceding is used to backward Travel
		String name=status.getText();
		System.out.println(name);

		//Get the minimum Value of activity:
		List<WebElement>allActivity=driver.findElements(By.xpath("//td[4]"));//Xpath is identify the cell using common word td[4]

		List<Integer>AllValue=new ArrayList<Integer>();  //In this method is used to store the collected values in ArrayList

		for (WebElement webElement : allActivity) {  //Iteration using for each method

			String eachValue=webElement.getText();   //Get the text from iteration

			int listValue=Integer.parseInt(eachValue);  //Change the string to integer

			AllValue.add(listValue);  //add the integer to arraylist
		}
		System.out.println(AllValue);

		int smallValue=Collections.min(AllValue);  //get the minimum value from the arraylist---arraylist is also one ofthe collections
		System.out.println(smallValue);



	}

}
