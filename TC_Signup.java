package com.FB.testcases;

import org.testng.annotations.Test;

import com.FB.pageobject.FB_Signup;

public class TC_Signup extends Baseclass
{
	@Test
	public void signup()
	{
		FB_Signup sup = new FB_Signup(driver);
		sup.createaccbtn();
		sup.sendfn();
		sup.sendln();
		sup.selectdate();
		sup.selectmonth();
		sup.selectyear();
		sup.selectgender();
		sup.sendregmail();
		sup.sendpassword();
	}
}
