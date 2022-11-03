package com.gcrshop;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 extends Baseclass {
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Chithambarapuram"+Keys.ENTER);
		String actualtitile=driver.getTitle();
		String exceptedtitile="Chithambarapuram - Google Search";
		assertEquals(actualtitile, exceptedtitile);
		Thread.sleep(3000);
	}
	@Test
	public void test2() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("bharathiraj"+Keys.ENTER);
		String actualtitle=driver.getTitle();
		String exceptedtitile="Log in to Facebook";
		assertEquals(actualtitle, exceptedtitile);
		Thread.sleep(3000);
		
	}
	@Test
	public void test3() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));
		username.sendKeys("Admin");
		password.sendKeys("admin123"+Keys.ENTER);
		String actualtitile=driver.getTitle();
		Assert.assertEquals(actualtitile, "Welcome");
		Thread.sleep(3000);
		
		
		
	}
}
