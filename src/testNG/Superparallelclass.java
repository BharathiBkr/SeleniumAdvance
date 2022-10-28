package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Superparallelclass {
	public WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	
	public void preCondition(String browser)
	{
		if(browser.equals("firefox1"))
		{
			//System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			//driver=new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");// ucan use "//" also
			driver=new ChromeDriver();
		}
		
		if(browser.equals("chrome1"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");// ucan use "//" also
			//Open the browser
			driver=new ChromeDriver();
		}
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	
	public void postCondition()
	{
		
		driver.quit();
		
	}
	

}
