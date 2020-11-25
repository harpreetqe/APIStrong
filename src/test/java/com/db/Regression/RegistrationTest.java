package com.db.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;

public class RegistrationTest extends TestBase
{
	
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("RegistrationTest");
	}

	@Test()
	public void register(String email, String pass, String company)  throws Exception {

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
	}
}
