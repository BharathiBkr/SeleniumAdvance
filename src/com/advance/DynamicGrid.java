package com.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/grid.xhtml;jsessionid=node0rtmgcwwasa375uzt1ec0vwlq93341.node0");
		
		//Total Column 
		List<WebElement>totalcolumn=driver.findElements(By.tagName("th"));
		int totalcol=totalcolumn.size();
		System.out.println(totalcol);
		
		//Total Row
		List<WebElement>totalRow=driver.findElements(By.tagName("tr"));
		int totalrow=totalcolumn.size();
		System.out.println(totalrow);
		
		//Interact with Black Watch
		WebElement blackWatch=driver.findElement(By.xpath("//td[text()='Black Watch']//following::td[2]"));
		String amount=blackWatch.getText();
		System.out.println(amount);
		
		//Get the minimum Value and Click;
		List<WebElement>priceList=driver.findElements(By.xpath("//td[5]"));
		
		List<Float>floatlist=new ArrayList<Float>();
		
		for (WebElement webElement : priceList) {
			
			String stringList=webElement.getText().replace("$"," ");//Do not Use ReplaceAll..only use Replace
			
			Float newList=Float.parseFloat(stringList); //Price Amount is Float
			
			floatlist.add(newList);
		}
		
		System.out.println(floatlist);
		
		Float Min=Collections.min(floatlist);  //Get the Min Value.
		
		System.out.println(Min);
		
		String minValue="$"+Float.toString(Min)+"0";//Add you needed Symbol in this step
		
		System.out.println(minValue);
		
		//   //td/span[normalize-space()='$15.00']//preceding::td[4]   This is inner text so i used the span tagname also
		
		String createXpath="//td/span[normalize-space()="+"\""+minValue+"\""+"]//preceding::td[4]";  // +"\"" || "\""+ escaping char
		
		//or //td/span[text()='$15.00']//preceding::td[4]  
	
		System.out.println(createXpath);
		
		WebElement minClick=driver.findElement(By.xpath(createXpath));
		minClick.click();
		
//		Notes:	
//		1.tr--Row
//		
//		2.th--column
//		
//		3.td--cell
//		
//		Get the Minimum Value use below notes are very important:
//			
//		4.gettext comment inside the for loop get the value and store in string(Normally gettext is string type) 
//		
//		5.Change the string to Float or Integer-- bcz compare the value and get the minimum value(parsefloat or parseint)
//		
//		6.From the floatlist is add to newList Collection
//		bcz one iteration is completed in for loop next iteration value is override in the old value so we use the each value in array list
//		
//		7.List<>=new ArrayList<>();  From the for loop iteration store the each string value in the list collection
//				
//		8.Get the minimum value using collections.min(store listname)
//		
//		9.Next the convert the float or int to string bcz for xpath creation.in this line add what you want
//		
//		10.During Xpath Creation time get the string in above line is placed in middle of the xpath using escaping charater
//		{ +"\""+minvalue+"\""+ } ecs char-- ["\""]
//		
	}

}
