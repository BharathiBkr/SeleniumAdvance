package com.advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/");
		WebElement browser=driver.findElement(By.xpath("//*[@id=\'menuform:j_idt39\']/a"));
		browser.click();
		List<WebElement>browserList=driver.findElements(By.xpath("//*[@id=\'menuform:j_idt39\']/ul/li"));
		for (WebElement list : browserList) {
			if(list.getText().equals("Drag")){
				list.click();
				break;
			}
		}
		//Sort the Rows:Interchange the low Quantity Item in Bottom
		List<WebElement>totalRows= driver.findElements(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr"));
		System.out.println(totalRows.size());
		WebElement Qty1=totalRows.get(5);
		WebElement Qty2=totalRows.get(0);
		Actions action=new Actions(driver);
		action.dragAndDrop(Qty1, Qty2).build().perform();
		
		
		
		

	}

}
