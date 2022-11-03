package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GothrourghTestNG {
	public  WebDriver driver;
	//	@Test(priority = 0)
	//	public static void name() {
	//		System.out.println("Bharathiraj");
	//		
	//	}
	//	@Test(priority = 2,enabled = false)
	//	public static void address() {
	//		System.out.println("Chithambarapuram");
	//		
	//	}
	//	@Test(priority = 1)
	//	public static void number() {
	//		System.out.println("9698196887");	
	//	}
	//	@Test
	//	public static void sslc() {
	//		System.out.println("He is Compled SSLC");
	//		
	//	}
	//	@Test(dependsOnMethods  = "sslc",enabled = false)
	//	public static void HSC() {
	//		System.out.println("He is Compled HSC");	
	//	}
	//	@Test(dependsOnMethods = "HSC")
	//	public static void BE() {
	//		System.out.println("He is compledt BE");
	//		
	//	}

	//Test Suite Method
//		@BeforeSuite
//		public void openBrowser() {
//			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
//			 driver=new ChromeDriver();
//			
//		}
//		@Test
//		
//		public void openGoogle() {
//			driver.get("https://www.google.com/");
//			
//		}
//		@Test
//		public void openyoutube() {
//			driver.get("https://www.youtube.com/");
//			
//		}
//		@Test
//		public void openWhatsappweb() {
//			driver.get("https://web.whatsapp.com/");	
//		}
//		@AfterSuite
//		public void closeBrowser() {
//			driver.quit();
//			
//		}
		
	//	
	//	//Grouping
	//	@Test(groups = "Fruit")
	//public void g1() {
	//	System.out.println("This is apple");
	//	
	//}
	//	@Test(groups = "Fruit")
	//public void g2() {
	//	System.out.println("This is Orange");
	//	
	//}
	//	@Test(groups = "Fruit")
	//public void g3() {
	//	System.out.println("This is banana");
	//	
	//}
	//	@Test(groups = "Juice")
	//public void g4() {
	//	System.out.println("This is Apple Juice");
	//	
	//}
	//	@Test(groups = "Juice")
	//public void g5() {
	//	System.out.println("This is redbanana Juice");
	//	
	//}
	//	@Test(groups = "Fruit")
	//public void g6() {
	//	System.out.println("This is Gova");
	//}
	//	@Test(groups = "Juice")
	//public void g7() {
	//	System.out.println("This is fruitMix");
	//}
	//	@Test(groups = {"Fruit","Banana"})
	//public void g8() {
	//	System.out.println("This is Redbanana");
	//	
	//}
	//	@Test(groups = {"Fruit","Banana"})
	//public void g9() {
	//	System.out.println("This is Greenbanana");
	//}
	//	@Test(groups = "Veg")
	//public void g10() {
	//	System.out.println("This is Onion");
	//	}
	//	
	//	//Parameterised
	//	@Test
	//	@Parameters("AddressName")
	//	public void address(String place) {
	//		System.out.println("The Palce name is   "+place);
	//		
	//	}
























}
