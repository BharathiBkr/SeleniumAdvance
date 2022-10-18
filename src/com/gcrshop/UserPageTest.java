package com.gcrshop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UserPageTest {
	WebDriver driver;
	String[][] data=null;
	@BeforeSuite
	public void openUserPage() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://gcreddy.com/project/");
//		PageFactory.initElements(driver, UserPOM.class);
//		UserPOM.myAccountButton.click();
//		UserPOM.emailAddress.sendKeys("bharathiraj.bkr@gmail.com");
//		UserPOM.passWord.sendKeys("bharathi123@");
//		UserPOM.siginin.click();
	}
	@AfterSuite
	public void closeUserPage() {
		PageFactory.initElements(driver, UserPOM.class);
		UserPOM.logout.click();
		driver.close();	
	}
//	@BeforeMethod
//	public void newUser() {
//		PageFactory.initElements(driver, UserPOM.class);
//		UserPOM.myAccountButton.click();
//		//UserPOM.continueButton.click();
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//	}
	@Test(enabled = false)
	public void register() throws InterruptedException {
		PageFactory.initElements(driver, UserPOM.class);
		UserPOM.genderBox.click();
		UserPOM.firstname.sendKeys("Bharathiraj");
		UserPOM.lasttname.sendKeys("Gunaraj");
		UserPOM.dateOfBirth.sendKeys("07/17/1995");
		UserPOM.email.sendKeys("bharathiraj.bkr@gmail.com");
		UserPOM.streetAddress.sendKeys("Chithambarapuram");
		UserPOM.postCode.sendKeys("627114");
		UserPOM.city.sendKeys("Tirunelveli");
		UserPOM.state.sendKeys("TamilNadu");
		Select select=new Select(UserPOM.country);
		select.selectByVisibleText("India");
		UserPOM.telephone.sendKeys("955180552");
		UserPOM.password.sendKeys("bharathi123@");
		UserPOM.confirmPassword.sendKeys("bharathi123@");
		UserPOM.confirm.click();
		Thread.sleep(3000);	
	}
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\User\\Desktop\\LoginData.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(5);
		int noOfRows=sheet.getRows();
		int noOfColumns=sheet.getColumns();
		String[][] exceldata=new String[noOfRows-1][noOfColumns];
		for (int i = 1; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				exceldata[i-1][j]=sheet.getCell(j, i).getContents();	
			}
			
		}
		return exceldata;
	}
	@DataProvider(name = "Excel Data")
	public String[][] dataprovider() throws BiffException, IOException {
		data=getExcelData();
		return data;	
	}
	@Test(dataProvider = "Excel Data",enabled = false)
	public void login(String email,String password) throws InterruptedException {
		PageFactory.initElements(driver,UserPOM.class);
		Thread.sleep(3000);
		UserPOM.emailAddress.sendKeys(email);
		Thread.sleep(3000);
		UserPOM.passWord.sendKeys(password);
		Thread.sleep(3000);
		UserPOM.siginin.click();
		Thread.sleep(3000);
		if (driver.getCurrentUrl().equals("https://gcreddy.com/project/account.php")) {
			Thread.sleep(3000);
			driver.navigate().back();
		}
		else {
			driver.navigate().refresh();
			Thread.sleep(3000);
			UserPOM.emailAddress.clear();
		}	
	}
	@Test
	public void checkButton() {
		PageFactory.initElements(driver, UserPOM.class);
//		System.out.println(UserPOM.cartContent.isDisplayed());
//		if (UserPOM.shoppingCart.isDisplayed()) {
//			UserPOM.shoppingCart.click();	
//		}
//		System.out.println(UserPOM.getText.getText());
//		UserPOM.continuebtn.click();
//		UserPOM.samsung.click();
//		UserPOM.addcart.click();
//		System.out.println(UserPOM.cartvalue.getText());
		//Check the Checkout Page before Login
		UserPOM.checkoutbtn.click();
		System.out.println(driver.getCurrentUrl());
		
	}
	
	
	
//	@AfterMethod
//	public void getTheMessage() {
//		String afterregister=driver.getCurrentUrl();
//		System.out.println(afterregister);
//	
//		
//	}
}
