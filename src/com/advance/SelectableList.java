package com.advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/selectable.html");
		//If you select the multiple box in table this inspect page must have 'ol'Tag name colum(ie.Order List)This is list of box.
		//In this position you get the x path is //*[@id=\'mydiv\'].you extra add the /li bcz consider all the list of tables
		//get the xpath syntax from ol section...very very important
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));//findelements all ways List type
		int totaltable=selectable.size();
		System.out.println(totaltable);
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		                 //or
		//actions.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1)).clickAndHold(selectable.get(2)).build().perform();
		

	}

}
