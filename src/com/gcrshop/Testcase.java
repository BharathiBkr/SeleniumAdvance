package com.gcrshop;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase extends Baseclass {
	@Test
	public void googlesearch() {
		driver.get("https://www.google.com/");
		WebElement searchterms=driver.findElement(By.name("q"));
		searchterms.sendKeys("Chennai"+Keys.ENTER);
		String actualresult= driver.getTitle();
		String expectedresult="Chennai";
		Assert.assertEquals(actualresult, expectedresult);	
	}
	@Test
	public void phptravels() {
		driver.get("https://phptravels.net/api/admin");
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("admin@phptravels.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demoadmin");
		WebElement clickbutton=driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button"));
		clickbutton.click();
		String actualresult=driver.getTitle();
		String expectedresult="Login in to PHP travels Admin";
		assertEquals(actualresult, expectedresult);
		
		
	}

}
