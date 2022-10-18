package com.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.html5.AddApplicationCache;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class GuruDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int noOfRows=rows.size();
		System.out.println(noOfRows);
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int noOfCloumns=columns.size();
		System.out.println(noOfCloumns);
		//Get the apollowo hospitals Current Stock market price
		Thread.sleep(3000);
//		WebElement apollo=driver.findElement(By.xpath("//a[contains(text(),'Apollo Hospitals')]//following::td[3]"));
//		String value=apollo.getText();
//		System.out.println(value);
		//Get the maximum current price company:
		List<WebElement>currentprice=driver.findElements(By.xpath("//td[4]"));
		List<Float>floatlist=new ArrayList<Float>();
		for (WebElement price : currentprice) {  //Its Used to Skip the Particular td Value
			if (price.getText().contains("Java")) {
				continue;
			}
			String priceText=price.getText();
			Float floatvalue=Float.parseFloat(priceText); //Very Very Important
			floatlist.add(floatvalue);
		}
		Float maximum=Collections.max(floatlist);
		System.out.println(maximum);
		String createXpath="//td[contains(text(),"+"\""+maximum+"\""+")]//preceding::td[3]";
		System.out.println(createXpath);
		WebElement maxCompany=driver.findElement(By.xpath(createXpath));
		String companyName=maxCompany.getText();
		System.out.println(companyName);
		
		

	}

}
