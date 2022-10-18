package com.advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/frame.html");
		 //1.Click the button inside the frame.
		      //If you use the normal button program you get the error.
		driver.switchTo().frame(0);  //This line used to driver is switch to frame page
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		String text=button1.getText();//In this you get the text after button is click
		System.out.println(text);
		driver.switchTo().defaultContent();//In this line is used to initial driver position.
		
		//2.Click the button inside the nested frame;
		
		driver.switchTo().frame(1);// in this position first iframe loaction..this frame have no id so count the iframe order and give the index position.
		driver.switchTo().frame("frame2");//In this position iframe have the id.so use frame string method.
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		driver.switchTo().defaultContent();
		
		//3.Find the total number of frames:
		
		List<WebElement>noOfIFrame=driver.findElements(By.tagName("iframe"));  //In this position 'findelementssss' not a findelement.
		int total=noOfIFrame.size();
		System.out.println(total);
	
		
		

	}

}
