package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Parallel1 extends Superparallelclass {
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("Running test on Firefox");
		
		String title = driver.getTitle();
		System.out.println("Title in Firefox is: "+title);
		
		driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        System.out.println("Logged in on firefox browser");
        Thread.sleep(15000);
        
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
       // wait.until(ExpectedConditions.titleContains("Enter"));
        driver.findElement(By.id("logoutLink")).click();
        Thread.sleep(3000);
        System.out.println("Logged out on firefox browser");
        System.out.println("Closed Firefox browser");
	}

}
