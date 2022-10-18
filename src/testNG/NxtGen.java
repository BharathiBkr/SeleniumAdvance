package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.dataloader.ValueCacheOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NxtGen {
	WebDriver driver;
	
	String[][] values=null;
	
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excelData=new FileInputStream("C:\\Users\\User\\Desktop\\LoginData.xls");
		Workbook workbook=Workbook.getWorkbook(excelData);
		Sheet sheet=workbook.getSheet(3);
		int noOfRows=sheet.getRows();
		int noOfColumns=sheet.getColumns();
		
		String[][] testData=new String[noOfRows-1][noOfColumns];
		
		for (int i = 1; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				testData[i-1][j]=sheet.getCell(j, i).getContents();
				
			}
			
		}
		return testData;
		
	}
	@DataProvider(name="Name Data")
	public String[][] dataProvider() throws BiffException, IOException {
		values=getExcelData();
		return values;	
	}
	@BeforeTest
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void getURL() {
		driver.get("https://nxtgenaiacademy.com/demo-site/");	
	}
	@Test(dataProvider="Name Data")
	public void names(String firstName,String lastName,String emailId,String Number) throws InterruptedException {
		WebElement fName=driver.findElement(By.id("vfb-5"));
		fName.sendKeys(firstName);
		Thread.sleep(2200);
		WebElement lName=driver.findElement(By.id("vfb-7"));
		lName.sendKeys(lastName);
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("vfb-14"));
		email.sendKeys(emailId);
		Thread.sleep(2000);
		WebElement number=driver.findElement(By.id("vfb-19"));
		number.sendKeys(Number);
		Thread.sleep(2000);
		}
	@AfterMethod
	public void normal() throws InterruptedException {
		WebElement genderBtn=driver.findElement(By.id("vfb-8-1"));
		genderBtn.click();
		Thread.sleep(1500);
		WebElement address1=driver.findElement(By.id("vfb-13-address"));
		address1.sendKeys("Chithambarapuram");
		Thread.sleep(1500);
		WebElement address2=driver.findElement(By.id("vfb-13-address-2"));
		address2.sendKeys("North Street");
		Thread.sleep(1500);
		WebElement city=driver.findElement(By.id("vfb-13-city"));
		city.sendKeys("Tirunelveli");
		Thread.sleep(1500);
		WebElement state=driver.findElement(By.id("vfb-13-state"));
		state.sendKeys("Tamil Nadu");
		Thread.sleep(1500);
		WebElement code=driver.findElement(By.id("vfb-13-zip"));
		code.sendKeys("627114");
		Thread.sleep(1500);
		WebElement country=driver.findElement(By.id("vfb-13-country"));
		Select select2=new Select(country);
		select2.selectByVisibleText("India");
		Thread.sleep(1500);
		WebElement calender=driver.findElement(By.id("vfb-18"));
		calender.click();
		Thread.sleep(1500);
		WebElement click1=driver.findElement(By.xpath("//a[@data-date=\"28\"]//following::a[3]"));
		click1.click();
		Thread.sleep(1500);
		WebElement timeHr=driver.findElement(By.id("vfb-16-hour"));
		Select select=new Select(timeHr);
		select.selectByVisibleText("05");
		Thread.sleep(1500);
		WebElement timeMin=driver.findElement(By.id("vfb-16-min"));
		Select select1=new Select(timeMin);
		select1.selectByIndex(3);
		Thread.sleep(1500);
		WebElement checkbox=driver.findElement(By.id("vfb-20-0"));
		checkbox.click();
		Thread.sleep(1500);
		WebElement query=driver.findElement(By.id("vfb-23"));
		query.sendKeys("Hai");
		Thread.sleep(1500);
		WebElement verify=driver.findElement(By.id("vfb-3"));
		verify.sendKeys("99");
		Thread.sleep(1500);
		WebElement submit=driver.findElement(By.id("vfb-4"));
		submit.click();
		if (driver.getPageSource().contains("Registration Form is Successfully Submitted")) {
			driver.navigate().back();	
		}
		else {
			driver.navigate().refresh();
		}		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}	
	}
	
	


