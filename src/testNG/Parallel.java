package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	//Open the Google,YouTube,WhatsappWeb
	@Test
	public void openGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.quit();	
	}
	@Test
	public void openYoutube() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.quit();	
	}
	@Test
	public void openWhatsapp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(3000);
		driver.quit();	
	}
	
	//In XML File 
	// <suite name="Test Suite" parallel="methods" thread-count="3"> is very important for parallel run 
	//Parallel="methods" ithu etha parallel ah run panna poromo atha podanum inga methods ah the parallel ah run pannuroo
	//next thread-count="3" ethuna window open akanum nu solluro 3 methods 3 window so use 3 in count

}
