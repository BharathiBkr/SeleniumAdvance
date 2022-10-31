package com.advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GoThroughAdvance {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAdvance\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");

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

		//i-Frames

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
		//		Actions actions=new Actions(driver);
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

		//		TakesScreenshot takeshot=(TakesScreenshot) driver;
		//		File sourcefile=takeshot.getScreenshotAs(OutputType.FILE);
		//		File destination=new File("D:\\sample.png");
		//		FileUtils.copyFile(sourcefile, destination);

		//Dynamic Table;

		//		List<WebElement> column=driver.findElements(By.xpath("//th"));
		//		System.out.println(column.size());
		//		List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"form:customers_data\"]//tr"));
		//		System.out.println(row.size());
		//		WebElement marilo=driver.findElement(By.xpath("//td[contains(text(),'RENEWAL')]//following::td[1]"));
		//		System.out.println(marilo.getText());
		//		
		//Get the minium value of activity Person;

		//		List<WebElement>listofactivity=driver.findElements(By.xpath("//td[4]"));
		//		List<Integer> integervalue=new ArrayList<Integer>();
		//		for (WebElement activity : listofactivity) {
		//			String strigvalue=activity.getText();
		//			Integer value=Integer.parseInt(strigvalue);
		//			integervalue.add(value);	
		//		}
		//		System.out.println(integervalue);
		//		Integer miniumvalue=Collections.min(integervalue);
		//		String minvalue=Integer.toString(miniumvalue);
		//		System.out.println(minvalue);
		//		String xpath="//td[text()="+"\""+minvalue+"\""+"]//preceding::td[3]";
		//		System.out.println(xpath);
		//		WebElement mini=driver.findElement(By.xpath(xpath));
		//		System.out.println(mini.getText());

		//Get the maximum and minium Stock value company name;

//		List<WebElement>currentpriceList=driver.findElements(By.xpath("//td[4]"));
//		System.out.println(currentpriceList.size());
//		List<Float> floatlist=new ArrayList<Float>();
//		for (int i = 0; i <= 228; i++) {
//			String stringlist=currentpriceList.get(i).getText().replace(",", "");
//			Float convertedList=Float.parseFloat(stringlist);
//			floatlist.add(convertedList);
//		}
//		
//		Formatter formatter = new Formatter(); //Very Very Important
//		
//		Float min= Collections.min(floatlist);
//
//		String stmin= formatter.format("%,.2f",min).toString();  //This terms is used to price format ex-30,300.33
//	
//
//		Float max=Collections.max(floatlist);
//		System.out.println(max);
//		Formatter formatter2 = new Formatter();
//		String stmax=formatter2.format("%,.2f", max).toString();
//		System.out.println(stmax);
//		
//		String minXpath="//td[text()="+"\""+stmin+"\""+"]//preceding::td[3]";
//		String maxXpath="//td[text()="+"\""+stmax+"\""+"]//preceding::td[3]";
//		System.out.println(minXpath);
//		System.out.println(maxXpath);
//		WebElement mincompany=driver.findElement(By.xpath(minXpath));
//		System.out.println("Minimum Stock Price company is   "+mincompany.getText());
//		WebElement maxcompany=driver.findElement(By.xpath(maxXpath));
//		System.out.println("Maximun Stock price Company is   "+maxcompany.getText());
		
		//Dynamic Table
		
//		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"menuform:j_idt41\"]/a"));
//		dropdown.click();
//		Thread.sleep(2000);
//		List<WebElement>listOfdropDown=driver.findElements(By.xpath("//*[@id=\"menuform:j_idt41\"]/ul/li"));
//		listOfdropDown.get(2).click();
//		List<WebElement>listOfValue=driver.findElements(By.xpath("//td[4]"));
//		List<Integer>list=new ArrayList<Integer>();
//		for (WebElement integerlist : listOfValue) {
//			String stringlist= integerlist.getText();
//			Integer iteratelist=Integer.parseInt(stringlist);
//			list.add(iteratelist);
//			
//		}
//		Integer min=Collections.min(list);
//		//td[text()='5']//preceding::td[3]
//		String xpath="//td[text()="+"\""+min+"\""+"]//preceding::td[3]";
//		System.out.println(xpath);
//		WebElement minelement=driver.findElement(By.xpath(xpath));
//		System.out.println(minelement.getText());
		
		//File Upload;
		
//		WebElement click=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
//		click.click();
//		StringSelection selection=new StringSelection("C:\\Users\\User\\Desktop\\21-17.jpg");
//		Thread.sleep(2000);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		Thread.sleep(2000);
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		WebElement inputupload=driver.findElement(By.id("j_idt97:j_idt98_input"));
//		inputupload.sendKeys("C:\\Users\\User\\Desktop\\21-17.jpg");
		
		//Window handle;
		
		//New Window
		
//		String homewindow=driver.getWindowHandle();
//		WebElement newWindow=driver.findElement(By.id("newWindowBtn"));
//		newWindow.click();
//		Set<String>newWindowopen=driver.getWindowHandles();
//		for (String string : newWindowopen) {
//			Thread.sleep(3000);
//			driver.switchTo().window(string);	
//		}
//		driver.close();
//		driver.switchTo().window(homewindow);
		
		//New Tab;  Same as like Window handle for new tab also
		
//		WebElement newtab=driver.findElement(By.id("newTabBtn"));
//		newtab.click();
//		Thread.sleep(3000);
//		Set<String>newtabpage=driver.getWindowHandles();
//		for (String string : newtabpage) {
//			driver.switchTo().window(string);	
//		}
//		driver.close();
//		driver.switchTo().window(homewindow);
		
		
		
		
		






	}

}
