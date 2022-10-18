package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class OpenMultiUrl {
	//Open Google,WhatsappWeb,You tube In one Click
	WebDriver driver;
	@BeforeSuite //Its means each testcase excucute akurathuku munnadi ithue nadakum
	public void open() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();//In this position to not add WebDriver comment.Already add the comment in before method 
		//bcz if driver is delcare in inside the method is only appicable for that particular methods.so add the driver in beofe method
	System.currentTimeMillis();
	}
	
	@Test
	public void openGoogle() {
		
		driver.get("https://www.google.co.in/");
			
	}
	@Test
	public void openWhatsappWeb() {
		
		driver.get("https://web.whatsapp.com/");
		
	}
	@Test
	public void openYouTube() {
		driver.get("https://www.youtube.com/");	
	}
	@AfterSuite //Ithu ovvaru test cage mundincha apram ithu nadakum.(Before suite--Test1--AfterSuite--BeforeSuit--Test2--AfterSuite--etc)
	public void close() {
		driver.quit();
		
	}
	
}
