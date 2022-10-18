package com.advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.leafground.com/file.xhtml");
//		WebElement uploadButton=driver.findElement(By.id("j_idt88:j_idt89"));
//		uploadButton.click();
//		
//		StringSelection selection=new StringSelection("C:\\Users\\User\\Downloads\\TestLeaf Logo.png");
//		//In this line is used to Transfer the String to Data and also temporary store the location in selection class(ie copy)
//		Thread.sleep(3000);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		//In this line used to access the clipbord of copy item and paste the item using setcontent comment
//		Thread.sleep(3000);
//		Robot action=new Robot(); //Robot class is similar to action class.action class is used in the web application.
//		//but robot class is used windows access.use each an every action press release all key event is similar to build and perform
//		action.keyPress(KeyEvent.VK_CONTROL);
//		action.keyPress(KeyEvent.VK_V);
//		action.keyRelease(KeyEvent.VK_V);
//		action.keyRelease(KeyEvent.VK_CONTROL);
//		action.keyPress(KeyEvent.VK_ENTER);
//		action.keyRelease(KeyEvent.VK_ENTER);
		
		
//		Notes:
//			In upload programs main thinks are given below:
//				1.StringSelection class-(Similar to file class not file array).Both have at the end of path window string.
//				2.ToolKit- is used to Set the content to be uploaded via clipboard.
//				2.Robot-is used to access the Keyboard action
//This is Another one method for File Uploading using sendkeys 
		//1.If the HTML Page file choose button inside the input tag use sendkeys method..no need click the button
		//2.If the HTML page file upload button inside the click tag using string selection and robot method.need to click the button
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		Thread.sleep(5000);
		WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
		button.sendKeys("C:\\Users\\User\\Desktop\\21-17.jpg");
		WebElement sendBtn=driver.findElement(By.id("file-submit"));
		sendBtn.click();
		
		
		
		
		
	}

}
