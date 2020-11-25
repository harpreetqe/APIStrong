package com.db.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;

public class LoginGmailTest extends TestBase{
	
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("LoginGmailTest");
	}

	@Test()
	public void login(String email, String pass) throws Exception {

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
	}}

