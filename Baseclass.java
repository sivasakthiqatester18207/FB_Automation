package com.FB.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions op = new ChromeOptions();
		op.setBrowserVersion("130");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterClass
	public void teardown()
	{
	driver.quit();
	}
}
