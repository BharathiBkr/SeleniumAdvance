package com.advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		WebElement dashBoardLink=driver.findElement(By.linkText("Go to Dashboard"));
		dashBoardLink.click();
		driver.navigate().back();
		//Find the Destination of link without click the link;
		WebElement findDestination=driver.findElement(By.partialLinkText("Find the URL"));
		String distination=findDestination.getAttribute("href"); //This the attribute is give the destination of the link..
		//Normally all the destination location should be stored in the href attribute 
		System.out.println("This link is go to "+distination);
		
		//Am I broken link?:
		WebElement amBroken=driver.findElement(By.linkText("Broken?"));
		String Name=amBroken.getTagName(); // In this position get a is tag name
		System.out.println(Name);
		amBroken.click();
		if (driver.getTitle().contains("404")) { //get title means chrome page-page name..contains means that page contain the seq of 404
			System.out.println("Yaah..This is broken link");
		}
		driver.navigate().back();
			
		//Duplicate Link:
				//dashBoardLink.click(); //If you click the previous mentioned webelement.
				//you got StaleElementReferenceException bcz you already enter into link and back to link.
				//Its not able to identify the old element(ie orderwise is read)
		WebElement dashBoardLink1=driver.findElement(By.linkText("Go to Dashboard"));
		dashBoardLink1.click();
		driver.navigate().back();
		
		//Count the Links:
		List<WebElement> total=driver.findElements(By.tagName("a")); //Find element using tagname.bcz all link are in under tag name
		int num=total.size();
		System.out.println(num);//In this position using tag name is identify 'a' letter tag name in this HTML Page//Total 47
		
		//Layout of Links:
		List<WebElement> layout=driver.findElements(By.cssSelector("div.grid.formgrid"));
		int count=layout.size();
		System.out.println(count);//In this position find the elements using css selector is only unique to identify the link this layouts.
		//Each link have common css value so use this css value for identification
		

	}

}
