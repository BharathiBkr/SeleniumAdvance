package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SwagLabs {
	String[][] datas=null;
	WebDriver driver;

	public String[][] openExcel() throws BiffException, IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\User\\Desktop\\LoginData.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet("Sheet3");
		int noOfRows=sheet.getRows();
		int noOfColumns=sheet.getColumns();
		
		String[][] arrayData=new String[noOfRows-1][noOfColumns]; //Why i use noofrows-1 bcz username,password also in one row so its used to eliminate the row 
		
		for (int i = 1; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {  //if you give the j=1 is give the data is both the username data.password not iterarted
				
				arrayData[i-1][j]=sheet.getCell(j, i).getContents(); //if give getcell(i,j) its give (1,0) excel struture start with (0,1)	
			}
		}
		return arrayData;
	}
	@DataProvider(name="FromExcel")
	public String[][] dataprovider() throws BiffException, IOException {
		datas=openExcel();
		return datas;	
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();	
		 driver.get("https://www.saucedemo.com/");
		 Thread.sleep(2000);	
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}	
	@Test(dataProvider = "FromExcel")
	public void loginSwagLabs(String uName,String pWord) throws InterruptedException {
		
		 WebElement userName=driver.findElement(By.id("user-name"));
		 userName.sendKeys(uName);
		 Thread.sleep(2000);
		 WebElement passWord=driver.findElement(By.id("password"));
		 passWord.sendKeys(pWord);
		 Thread.sleep(2000);
		 WebElement clickBtn=driver.findElement(By.id("login-button"));
		 clickBtn.click();
		 Thread.sleep(2000);
		 if (driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html")) {
			 driver.navigate().back();	
		 }
			 else {
				 driver.navigate().refresh();
				
			}
		
		
		
	}
	 

	
}
