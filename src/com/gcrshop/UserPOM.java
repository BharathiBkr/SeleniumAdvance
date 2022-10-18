package com.gcrshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPOM {
	
	@FindBy(id = "tdb3")
	public static WebElement myAccountButton;
	
	@FindBy(id = "tdb2")
	public static WebElement continueButton;
	
	@FindBy(xpath = "//input[@value='m']")
	public static WebElement genderBox;
	
	@FindBy(xpath  ="//input[@name='firstname']")
	public static WebElement firstname;
	
	@FindBy(xpath  ="//input[@name='lastname']")
	public static WebElement lasttname;
	
	@FindBy(id = "dob")
	public static WebElement dateOfBirth;
	
	@FindBy(xpath ="//input[@name='email_address']" )
	public static WebElement email;
	
	@FindBy(xpath ="//input[@name='street_address']" )
	public static WebElement streetAddress;
	
	@FindBy(xpath ="//input[@name='postcode']" )
	public static WebElement postCode;
	
	@FindBy(xpath ="//input[@name='city']" )
	public static WebElement city;
	
	@FindBy(xpath ="//input[@name='state']" )
	public static WebElement state;
	
	@FindBy(xpath = "//select[@name='country']")
	public static WebElement country;
	
	@FindBy(xpath = "//input[@name='telephone']")
	public static WebElement telephone;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@name='confirmation']")
	public static WebElement confirmPassword;
	
	@FindBy(id = "tdb4")
	public static WebElement confirm;
	
	@FindBy(xpath = "//input[@name='email_address']")
	public static WebElement emailAddress;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement passWord;
	
	@FindBy(id = "tdb1")
	public static WebElement siginin;
	
	@FindBy(id = "bharathi123@")
	public static WebElement logout;
	
	@FindBy(xpath = "//span[text()='Cart Contents']")
	public static WebElement cartContent;
	
	@FindBy(linkText = "Shopping Cart")
	public static WebElement shoppingCart;
	
	@FindBy(xpath = "//div[@class='contentText']")
	public static WebElement getText;
	
	@FindBy (id = "tdb5")
	public static WebElement continuebtn;
	
	@FindBy(linkText = "samsung")
	public static WebElement samsung;
	
	@FindBy(id = "tdb5")
	public static WebElement addcart;
	
	@FindBy(xpath = "//p[@align=\"right\"]")
	public static WebElement cartvalue;
	
	@FindBy(id = "tdb2")
	public static WebElement checkoutbtn;
	
	
	
	
	
	
	
	
	
	
	

}
