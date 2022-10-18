package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginWithParaAndDataProv {
	
//	//Login using Parameter Annotation
//  @Test
//  @Parameters({"username","password"}) //for two parameter passing--this syntax is very very important
//  public void logINTest(String uName,String pword) {
//	  System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
//	  WebDriver driver=new ChromeDriver();
//	  driver.get("http://testphp.vulnweb.com/login.php");
//	  WebElement userName=driver.findElement(By.name("uname"));
//	  userName.sendKeys(uName);
//	  WebElement passWord=driver.findElement(By.name("pass"));
//	  passWord.sendKeys(pword);
//	  WebElement submit=driver.findElement(By.xpath("//input[@value='login']"));
//	  submit.click();  
//  }
     
	 //Login Using DataProvider without XML
		String[][]values={
			           {"test","test"}
	                   };
	@DataProvider(name="login")
	public String[][] dataProvider() {
		return values;	
	}
	@Test(dataProvider = "login") //This name from Dataprovider annotation name..must be both are same
  public void logInTest(String uName,String pword) {
	  System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://testphp.vulnweb.com/login.php");
	  WebElement userName=driver.findElement(By.name("uname"));
	  userName.sendKeys(uName);
	  WebElement passWord=driver.findElement(By.name("pass"));
	  passWord.sendKeys(pword);
	  WebElement submit=driver.findElement(By.xpath("//input[@value='login']"));
	  submit.click(); 
	  driver.quit();
  }
}


//Notes;

//1.Create the DataProvider Annotation for Seprate class and give the name to the annotation.
//
//2.Store the what are the datas to be give to the test in public. 
//bcz in side the method is not possible to access other method.so store in public.
//ex.String,String[][](Mutli dimensional Array->)more than one value to be give to the test that time use string array,int,float what ever else
//
//3.Stored value must have returen.this return type present inside the dataprovider method.
//
//4.@Test give the attribute of dataprovider="Dataprovider annotation Name"
//   This line is used to collect the data from the dataprovider method and give to the test case
                
//			Differnce between Parameter and DataProvider
//       Parameter 							Dataprovider												
//1.Not have Seprate method                1.It Have Seprate method for DataProvider Annotation(must present "return" type)
//
//2.Give the Value thorugh the XML File    2.Give the Value through the Same Program
//                                             
//
//3.This is one of the attribute           3.Annotation and attribute both it have.
//
//4.Syntex (Parameters= {"name","ID"})     4.Annotation Syntax-@DataProvider(name="Name")
//	name-1st name						   Attribute Syntax-(dataProvider="Name") both names are same in dataprovider
//    ID-2nd Name
//5.In XML Parameter tag must
//   present in the before classes Tag.
//(TestNG Parameter name and XML Parameter
//   name must be same)
//    
//    
    
    
    