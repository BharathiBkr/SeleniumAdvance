package com.gcrshop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AdminPage {
	WebDriver driver;
	String[][] values=null;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
	}
	// Verify Launch Application with valid URL
	@Test(priority = 0,enabled = false) //Test Pass
	public void goToURL() throws InterruptedException {
		driver.navigate().to("http://gcreddy.com/project/admin/login.php");	
		Thread.sleep(2000);
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();	
	}
	// Verify all elements availability in the Admin interface home page/login page
	@Test(priority = 1,enabled = false) //Test Pass
	public void verifyElement() {
		driver.navigate().to("http://gcreddy.com/project/admin/login.php");
		PageFactory.initElements(driver, AdminPOM.class);
		boolean admin=AdminPOM.administration.isDisplayed();
		System.out.println("The Administration link there is   "+admin);
		boolean online=AdminPOM.onlineCatalog.isDisplayed();
		System.out.println("The Online catalog link there is   "+online);
		boolean username=AdminPOM.username.isDisplayed();
		System.out.println("The username link there is    "+username);
		boolean pass=AdminPOM.password.isDisplayed();
		System.out.println("The password link there is   "+pass);
		boolean login= AdminPOM.login.isDisplayed();
		System.out.println("The login link there is    "+login);	
	}
	//Verify “Redirect” functionality from Admin to User Interface before Login
	@Test(priority = 2,enabled = false) //Test Pass
	public void redirectToUser () {
		driver.navigate().to("http://gcreddy.com/project/admin/login.php");
		PageFactory.initElements(driver, AdminPOM.class);
		AdminPOM.onlineCatalog.click();
		Assert.assertEquals(driver.getCurrentUrl(), "http://gcreddy.com/project/");	
	}
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\User\\Desktop\\LoginData.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(4);
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
	@DataProvider(name = "Login Test Data")
	public String[][] dataprovider() throws BiffException, IOException {
		values=getExcelData();
		return values;	
	}
	//Verify the Login Page Using Valid and invalid username,Password
	@Test(priority = 3,dataProvider = "Login Test Data",enabled = false) //Test Pass
	public void loginTestCase(String username,String password) throws InterruptedException {
		driver.navigate().to("http://gcreddy.com/project/admin/login.php");
		PageFactory.initElements(driver, AdminPOM.class);
		Thread.sleep(3000);
		AdminPOM.username.sendKeys(username);
		AdminPOM.password.sendKeys(password);
		AdminPOM.login.click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println("Current Username   :"+username+"   Current Password   :"+password+"   Current Url   :"+url);
		Thread.sleep(3000);
	}
	@BeforeClass
	public void loginBeforeMethod() {
		driver.navigate().to("http://gcreddy.com/project/admin/login.php");
		PageFactory.initElements(driver,AdminPOM.class);
		AdminPOM.username.sendKeys("gcreddy");
		AdminPOM.password.sendKeys("Temp@2020");
		AdminPOM.login.click();	
	}
	@AfterClass
	public void logoffAfterMethod() {
		AdminPOM.logoff.click();
	}
	//Verify the elements of manufacture,Add Function
	@Test(priority = 4)  //Test Pass
	public void manufacture() throws InterruptedException, AWTException {
		PageFactory.initElements(driver,AdminPOM.class);
		AdminPOM.catalog.click();
		Thread.sleep(3000);
		List<WebElement>listOfcatalog=driver.findElements(By.xpath("//*[@id=\"ui-accordion-adminAppMenu-panel-0\"]/ul/li"));
		int size=listOfcatalog.size();
		System.out.println(size);
		for (WebElement webElement : listOfcatalog) {
			if (webElement.getText().equals("Manufacturers")) {
				webElement.click();
				break;
			}
		}
	}
	@Test(priority = 5,enabled = false)//Test Pass
	public void insertManufacture() throws InterruptedException {
		PageFactory.initElements(driver,AdminPOM.class);
		Thread.sleep(3000);
		AdminPOM.insert.click();
		Thread.sleep(3000);
		AdminPOM.manName.sendKeys("Bharathiraj");
		Thread.sleep(1000);
		AdminPOM.manFile.sendKeys("C:\\Users\\User\\Desktop\\21-17.jpg"); //This is upload section i used sendkeys bcz its not under button tag is under inut tag so i used to sendkeys	
		AdminPOM.manURL.sendKeys("www.bharathiraj.com");
		Thread.sleep(3000);
		AdminPOM.manSubmit.click();
		
	}
	//Verify the elements of Edit Function
	@Test(priority = 6,enabled = false)//Test Pass
	public void editManufacture() {
		PageFactory.initElements(driver, AdminPOM.class);
		AdminPOM.clickone.click();
		AdminPOM.editbutton.click();
		AdminPOM.manufacureEdit.clear();
		AdminPOM.manufacureEdit.sendKeys("Bharathiraj");
		AdminPOM.manuURL.sendKeys("www.bharathiraj.com");
		AdminPOM.manuEdit.click();
		
	}
	@Test(priority = 7)
	public void deleteManufacture() {
		PageFactory.initElements(driver, AdminPOM.class);
		AdminPOM.clickone.click();
		AdminPOM.deletebtn.click();
	if (AdminPOM.deleteCheckBox.isSelected()) {
		AdminPOM.confirmDelete.click();	
	}
	else {
		AdminPOM.deleteCheckBox.click();
		AdminPOM.confirmDelete.click();
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
