package com.advance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		//Store the Current or Home Window:
		String homeWindow=driver.getWindowHandle();
		
		//1.Click the New Window link and Select one option and close the new window;
		
		WebElement newWindowLink=driver.findElement(By.id("home"));
		newWindowLink.click();
		Set<String>newWindow=driver.getWindowHandles();
		for (String getTheNewWindow : newWindow) {
			driver.switchTo().window(getTheNewWindow);
		}
			WebElement clickAny=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a"));
			clickAny.click();
			driver.close();
			driver.switchTo().window(homeWindow); //Its used to switch to home Window.every task completed in new window use this comment to return to home window.
			
		//2.Find the number of Windows to be opened after button is clicked;
			
			WebElement countWindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
			countWindow.click();
			Set<String>numberOfWindow=driver.getWindowHandles();
			int number=numberOfWindow.size();
			System.out.println("Number of Window to be opend  "+number);
			driver.switchTo().window(homeWindow);
			
		//3.Close the all window except homewindow:
			
			WebElement closeWindow=driver.findElement(By.id("color"));
			closeWindow.click();
			Set<String>openWindow=driver.getWindowHandles();
			for (String close : openWindow) {
				if (!close.equals(homeWindow)) { //Dont use operators like (close!=homewindow)
					driver.switchTo().window(close);
					driver.close();		
				}}}}
