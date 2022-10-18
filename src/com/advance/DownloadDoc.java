package com.advance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadDoc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement download=driver.findElement(By.id("j_idt93:j_idt95"));
		download.click();
		Thread.sleep(4000);
		
		//C:\\Users\\User\\Downloads\\TestLeaf Logo
		
		File filelocation=new File("C:\\Users\\User\\Downloads"); //Its used identify the file location
		File[] allfile=filelocation.listFiles(); //in this line File array store the all files in array.its used do iteration
		for (File file : allfile) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded"); //For verification purpose
				break;
				
				
				
//				Note:
//					In download type program.First you remind 
//					1.File class-(give the input of download file location);
//					2.Listfiles- is it array type(its used access the all files in above mentioned file location)
			}
		}
		

	}

}
