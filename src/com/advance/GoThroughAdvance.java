package com.advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoThroughAdvance {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node01gnsimcv0lm2o1k9vu8b75naho376570.node0");
		
		//Window Handle;
//		String homeWindow=driver.getWindowHandle();
//		WebElement clickWindow=driver.findElement(By.id("j_idt88:new"));
//		clickWindow.click();
//		Set<String> newwindows=driver.getWindowHandles();
//		for (String funWindow : newwindows) {
//			driver.switchTo().window(funWindow);
//		}
//		System.out.println(driver.getCurrentUrl());	
//		driver.close();
//		driver.switchTo().window(homeWindow);
//		WebElement noOfwindow=driver.findElement(By.id("j_idt88:j_idt91"));
//		noOfwindow.click();
//		Set<String>noofsubwindow=driver.getWindowHandles();
//		System.out.println(noofsubwindow.size());
//		
//		WebElement closewindow=driver.findElement(By.id("j_idt88:j_idt93"));
//		closewindow.click();
//		Set<String>clwindow=driver.getWindowHandles();
//		for (String newwin : clwindow) {
//			if (!newwin.equals(homeWindow)) {
//				driver.switchTo().window(newwin);
//				driver.close();	
//			}
//			
//		}
		
		//Frames
//		driver.switchTo().frame(0);
//		WebElement click=driver.findElement(By.id("Click"));
//		click.click();
//		driver.switchTo().defaultContent();
//		List<WebElement>noofframe=driver.findElements(By.tagName("iframe"));
//		System.out.println(noofframe.size());
//		driver.switchTo().frame(2);
//		driver.switchTo().frame("frame2");
//		WebElement nestedframe=driver.findElement(By.id("Click"));
//		nestedframe.click();
		
		//Drag and Drop
		//Actions actions=new Actions(driver);
//		WebElement dragalone=driver.findElement(By.id("form:conpnl"));
//		actions.clickAndHold(dragalone).moveByOffset(180, 0).build().perform();
//		WebElement drag=driver.findElement(By.id("form:drag_content"));
//		WebElement drop=driver.findElement(By.id("form:drop_header"));
//		actions.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
//		List<WebElement>colum=driver.findElements(By.xpath("//*[@id=\"form:j_idt94_head\"]/tr/th"));
//		System.out.println(colum.size());
//		WebElement catagory=colum.get(1);
//		WebElement qty=colum.get(2);
//		actions.dragAndDrop(catagory, qty).build().perform();
//		List<WebElement>row=driver.findElements(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr"));
//		System.out.println(row.size());
//		WebElement row5=row.get(5);
//		WebElement row0=row.get(0);
//		actions.dragAndDrop(row5,row0).build().perform();
//		WebElement slidebtn=driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
//		actions.clickAndHold(slidebtn).moveByOffset(-100, 0).build().perform();
//		//Resize the Image;
//		WebElement resize=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/div[1]"));
//		actions.clickAndHold(resize).moveByOffset(100,50).build().perform();
//		
		//Selectable;
//		List<WebElement>orderlist=driver.findElements(By.xpath("//*[@id=\"j_idt111\"]/div/div[2]/ul/li"));
//		System.out.println(orderlist.size());
//		//actions.clickAndHold(orderlist.get(0)).click(orderlist.get(1)).clickAndHold(orderlist.get(2)).build().perform();  Its Not Work
//		actions.keyDown(Keys.CONTROL).click(orderlist.get(0)).click(orderlist.get(1)).click(orderlist.get(2)).build().perform();
		
		//Auto Complition;
		
//		WebElement inputtext=driver.findElement(By.id("j_idt87:auto-complete_input"));
//		inputtext.sendKeys("S");
//		Thread.sleep(4000);
//		inputtext.sendKeys(Keys.ARROW_DOWN);
//		inputtext.sendKeys(Keys.ARROW_DOWN);
//		inputtext.sendKeys(Keys.ENTER);
		
		//Download the file
//		
//		WebElement downloadbutton=driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));
//		downloadbutton.click();
//		Thread.sleep(5000);
//		File file=new File("C:\\Users\\User\\Downloads");
//		File[]filelist=file.listFiles();
//		for (File orifile : filelist) {
//			if (orifile.getName().equalsIgnoreCase("TestLeaf Logo.png")) {
//				System.out.println("Yaah File is Downloaded");
//				break;
//			}
//			
//			
//		}
		
		//upload a file;
		
//		WebElement uploadbutton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
//		uploadbutton.click();
//		Thread.sleep(3000);
//		StringSelection filepath=new StringSelection("C:\\Users\\User\\Downloads\\TestLeaf Logo.png");
//		Thread.sleep(3000);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
//		Thread.sleep(3000);
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		
//		//This Method Via Input Method
//		
//		WebElement inputupload=driver.findElement(By.id("j_idt88:j_idt89_input"));
//		inputupload.sendKeys("C:\\Users\\User\\Downloads\\TestLeaf Logo.png");
//		
//		WebElement uploadimage=driver.findElement(By.id("j_idt97:j_idt98_input"));
//		uploadimage.sendKeys("C:\\Users\\User\\Desktop\\21-17.jpg");
		
		//Broken Image
		
//		WebElement brokenimage=driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
//		System.out.println(brokenimage.getAttribute("naturalwidth"));
//		WebElement broken2=driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[2]"));
//		System.out.println(broken2.getAttribute("naturalwidth"));
//		if (broken2.getAttribute("naturalwidth").equals("")) {
//			System.out.println("I am broken Image");	
//		}
//		else {
//			System.err.println("I am real image");}
		
		//Hyper Link
		
//		WebElement link1=driver.findElement(By.linkText("Go to Dashboard"));
//		link1.click();
//		WebElement lin2=driver.findElement(By.partialLinkText("Find the URL without"));
//		String linkid=lin2.getAttribute("href");
//		System.out.println(linkid);
//		WebElement broken=driver.findElement(By.linkText("Broken?"));
//		broken.click();
//		if (driver.getTitle().contains("404")) {
//			System.out.println("I am a Broken Link");
//		}
//		else {
//			System.out.println("I am a original link");
//		}
//		List<WebElement> nooflink=driver.findElements(By.tagName("a"));
//		System.out.println(nooflink.size());
		
		//Take ScreenShot
		
		TakesScreenshot takeshot=(TakesScreenshot) driver;
		File sourcefile=takeshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\sample.png");
		FileUtils.copyFile(sourcefile, destination);
		
		
	}

}
