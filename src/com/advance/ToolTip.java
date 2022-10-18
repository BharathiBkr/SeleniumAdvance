package com.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/tooltip.html");
		WebElement toolTip=driver.findElement(By.id("age"));
		String toolTipText=toolTip.getAttribute("title");
		System.out.println(toolTipText);
//Tooltip means if you move the mouse cursor to any text box its show some msg.that text msg is tooltip.
//Normally tooltip text is present inthe 'title' attribute section.so we use getattribute of web element using getattribute cooment.
	}

}
