package com.advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/list.xhtml;jsessionid=node01uwx54ucq5siborq6w81lwo46338006.node0");
		List<WebElement> from=driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"pickList\"]/div[4]/ul"));
		System.out.println(from.size());
		Actions action=new Actions(driver);
		action.clickAndHold(from.get(0)).moveToElement(to).release().build().perform();
		List<WebElement>orderlist=driver.findElements(By.xpath("//*[@id=\"j_idt111\"]/div/div[2]/ul/li"));
		action.keyDown(Keys.CONTROL).click(orderlist.get(0)).click(orderlist.get(1)).click(orderlist.get(2)).build().perform();

	}

}
