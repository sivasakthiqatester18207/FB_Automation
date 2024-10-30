package com.FB.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FB_Signup {
	public WebDriver ldriver;
	
	public FB_Signup(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//*[text()='Create new account']")
	WebElement createnewbtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@name='firstname']")
	WebElement fnfld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@name='lastname']")
	WebElement lnfld;
	
	@CacheLookup
	@FindBy(xpath = "//*[@name='birthday_day']")
	WebElement date;
	
	@CacheLookup
	@FindBy(xpath = "//*[@name='birthday_month']")
	WebElement month;
	
	@CacheLookup
	@FindBy(xpath = "//*[@name='birthday_year']")
	WebElement year;
	
	@CacheLookup
	@FindBy(xpath = "(//*[@name='sex'])[2]")
	WebElement sex_male;
	
	@CacheLookup
	@FindBy(xpath = "(//*[@name='reg_email__'])")
	WebElement regmail;
	
	@CacheLookup
	@FindBy(xpath = "(//*[@name='reg_passwd__'])")
	WebElement regpassword;
	
	@CacheLookup
	@FindBy(xpath = "(//*[text()='Sign Up'])[1]")
	WebElement signupbtn;
	
	
	public void createaccbtn()
	{
		createnewbtn.click();
	}
	
	public  void sendfn()
	{
		fnfld.sendKeys("Tester");
	}
	
	public void sendln()
	{
		lnfld.sendKeys("Super_Tester");
	}
	
	public void selectdate()
	{
		Select datedrop = new Select(date);
		datedrop.selectByValue("21");
	}
	
	public void selectmonth()
	{
		Select monthdrop = new Select(month);
		monthdrop.selectByValue("10");
	}
	
	public void selectyear()
	{
		Select yeardrop = new Select(year);
		yeardrop.selectByValue("1999");
	}
	
	public void selectgender()
	{
		sex_male.click();
	}
	
	public void sendregmail()
	{
		regmail.sendKeys("abc123@gmail.com");
	}
	
	public void sendpassword()
	{
		regpassword.sendKeys("Abcdef@123");
	}
	
	public void clicksignup()
	{
		signupbtn.click();
	}
}
