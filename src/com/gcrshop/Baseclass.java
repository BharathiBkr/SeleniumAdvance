package com.gcrshop;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public static WebDriver driver;
	 public static String dateformat;
	
	@BeforeSuite
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver107\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		
	}
	public void screenshot(String filename) throws IOException {
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("ddMMyyyyhhmm");
		dateformat=datetime.format(format);
		TakesScreenshot shot=(TakesScreenshot) driver;
		File sourcefile=shot.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("D:\\Photos\\Screenshots\\"+dateformat+"\\"+filename+".jpg");
		FileUtils.copyFile(sourcefile, destinationfile);
		
		
	}

}
