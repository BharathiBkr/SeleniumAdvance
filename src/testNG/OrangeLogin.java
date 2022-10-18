package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class OrangeLogin {
	//Login in teast Case using EXCEL file data throuth JXL Jar
	WebDriver driver;
	
	String[][] values=null;//It is used to convert the array value from getexceldata method to public values of array

	
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\User\\Desktop\\LoginData.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		
		Sheet sheet=workbook.getSheet(0); //If you give the 0--first sheet will be open
		
		int noOfRows=sheet.getRows();
		int noOfColumns=sheet.getColumns();
		
		String[][] testdata=new String[noOfRows-1][noOfColumns];
		
		for (int i = 1; i < noOfRows; i++) { // For Iteration Under Excel Data Structure
			for (int j = 0; j < noOfColumns; j++) {  //For Iteration Under Excel Data Structure
				testdata[i-1][j]=sheet.getCell(j, i).getContents();	 //Store the excel data in testdata under array data Structure
			}
	
		}
		return testdata;
	}
	@DataProvider
	public String[][] dataProvider() throws BiffException, IOException {
		values=getExcelData();
		return values;
	}
		
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	@Test(dataProvider = "dataProvider") //This name from Dataprovider annotation name..must be both are same
	public void logInTest(String uName,String pword) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement userName=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		userName.sendKeys(uName);
		WebElement passWord=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		passWord.sendKeys(pword);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		submit.click(); 	
	}
}

////Notes;
//
//1.Create the DataProvider Annotation for Seprate method and give the name to the annotation.
//
//2.Store the what are the datas to be give to the test in public. 
//  bcz in side the method is not possible to access other method.so store in public.
//  ex.String,String[][](Mutli dimensional Array->)more than one value to be give to the test that time use string array,int,float what ever else
//
//3.Stored value must have returen type.
//
//pls Go through the LoginWithParaAndDataProv class for more information
//
//----------**Collect the Data From Excel file using JXL Jar---->add the JXL jar to the referenced lib**-----------
//
//----Excel Order Format-------
//i)File Location 
//ii)WorkBook
//iii)Sheet
//iv)Rows
//v)Columns
//vi)Cells
//
//4.Create another one method for collect and store the data from excel file
//
//5.Create the FileInputStream class and give the path of file location.

//6.Create Workbook Class--using getworkbook comment is used to get the excel file.give fileInputStream object name

//7.Create Sheet Attribute Sheet sheet=workbook.getsheet(0)---This comment is used to get the sheet from the workbook..workbook have lot of sheets

//8.Get the number of rows count is used for iteration--Each sheet have the number of rows

//9.Get the number of columns count is used for iteration--Each sheet have the number of columns

//10.Create the one new Two dimen string Array class bcz this test have two variable--
//      this is array is used to store the content from the for loop iteration
//
//11.Create the for loop for rows and columns.from the for loop- result is row,cloumn struture postion.
//   this  value is used to get the cell position.get the content and store the String array class
//
//12.Give the return String Array Class

//13.Next follow the normal DataProvider Annotation Method and @Test(DataProvider)attribute

























































