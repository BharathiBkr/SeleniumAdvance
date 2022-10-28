package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Parallel2 extends Superparallelclass {
	@Test
	public void test2() throws InterruptedException
	{
		
		System.out.println("Running test on Chrome");
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        Thread.sleep(5000);
        System.out.println("Logged in on chrome browser");
        
        //click on help button
        driver.findElement(By.xpath("//tr[2]//div[4]")).click();
        Thread.sleep(2000);
        //click on About your actiTIME
        driver.findElement(By.linkText("About your actiTIME")).click();
        Thread.sleep(2000);
        //close the popup
        driver.findElement(By.id("aboutPopupCloseButtonId")).click();
        
        driver.findElement(By.id("logoutLink")).click();
        Thread.sleep(3000);
        System.out.println("Logged out on chrome browser");
        System.out.println("Closed chrome browser");
	}


}
