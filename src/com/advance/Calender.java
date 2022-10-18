package com.advance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/");
		WebElement table=driver.findElement(By.xpath("//*[@id=\"menuform:j_idt41\"]/a"));
		table.click();
		List<WebElement> tablelist=driver.findElements(By.xpath("//*[@id=\"menuform:j_idt41\"]/ul/li"));
		System.out.println(tablelist.size());
		for (WebElement webElement : tablelist) {
			if (webElement.getText().equals("Calendar")) {
				webElement.click();
				break;
			}
		}
		//Click the 20th date from today;
		WebElement calendar=driver.findElement(By.xpath("//td[@class='fc-daygrid-day fc-day fc-day-thu fc-day-today ']//following::td[20]"));
		calendar.click();
		
		//Java Program for date time format taker
//		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-/MM-/yyyy");
//		LocalDate date=LocalDate.now();
//		System.out.println(dtf.format(date));
//		
		
		
		
	}

}
