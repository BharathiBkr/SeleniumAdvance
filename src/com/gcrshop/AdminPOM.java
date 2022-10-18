package com.gcrshop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPOM {
	@FindBy(linkText = "Administration")
	public static WebElement administration;
	
	@FindBy(linkText = "Online Catalog")
	public static WebElement onlineCatalog;
	
	@FindBy(name = "username")
	public static WebElement username;
	
	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(id = "tdb1")
	public static WebElement login;
	
	@FindBy(id = "ui-accordion-adminAppMenu-header-0")
	public static WebElement catalog;
	
	@FindBy(id = "tdb1")
	public static WebElement insert;
	
	@FindBy(xpath = "//*[@id=\"contentText\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/input")
	public static WebElement manName;
	
	@FindBy(xpath = "//input[@name='manufacturers_image']")
	public static WebElement manFile;
	
	@FindBy(name ="manufacturers_url[1]")
	public static WebElement manURL;
	
	@FindBy(id = "tdb1")
	public static WebElement manSubmit;
	
	@FindBy(linkText = "Logoff")
	public static WebElement logoff;
	
	@FindBy(xpath = "//*[@id=\"contentText\"]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[12]/td[1]")
	public static WebElement clickone;
	
	@FindBy(id = "tdb2")
	public static WebElement editbutton;
	
	@FindBy(xpath = "//*[@id=\"contentText\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/input")
	public static WebElement manufacureEdit;
	
	@FindBy(xpath = "//*[@id=\"contentText\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[4]/td/input")
	public static WebElement manuURL;
	
	@FindBy(id = "tdb1")
	public static WebElement manuEdit;
	
	@FindBy(id = "tdb3")
	public static WebElement deletebtn;
	
	@FindBy(name = "delete_image")
	public static WebElement deleteCheckBox;
	
	@FindBy(id = "tdb1")
	public static WebElement confirmDelete;
	
	
	
	
}
