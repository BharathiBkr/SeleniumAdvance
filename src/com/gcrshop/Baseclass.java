package com.gcrshop;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;  //This is very Important for screenhot on xml and base class model
	public static String subfolder;
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver107\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
		
	}
	public void screenshots(String filename) throws IOException {
		if (subfolder==null) { //During The XML execution each time this subfolder is null..during the execution time is create the datetime format file type
			LocalDateTime datetime=LocalDateTime.now();
			DateTimeFormatter dateformat=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			subfolder=datetime.format(dateformat);
		}
		TakesScreenshot shot=(TakesScreenshot) driver;
		File sourcefile=shot.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("./Screenshots/"+subfolder+"/"+filename+".jpg");
		FileUtils.copyFile(sourcefile, destinationfile);
		
	}

}
