package com.advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete { // Auto complete means if you type one related word in box its show the related results.
	//And select the one wanted results.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/autoComplete.html");
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("a");
		Thread.sleep(4000); //for only slow purpose
		List<WebElement>list=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));//Get the x path of list of values from 'ul' tag name.(ie unorder list)
		int size=list.size();
		System.out.println(size);//To check the list size.
		
		for (WebElement webElement : list) { //iteration
			if (webElement.getText().equals("Rest API")) {  //iteration pannum pothum varum text ah get pannu atha Rest API kuda Check Pannuthu
				webElement.click();
				break;	
			}
			
		}
		
		

	}

}
