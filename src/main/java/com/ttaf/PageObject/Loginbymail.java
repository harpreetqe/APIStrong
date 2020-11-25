package com.ttaf.PageObject;

import com.db.Library.AppLibrary;

public class Loginbymail {
	AppLibrary appLibrary;
	
	public String URL = "//dev.apistrong.com";
	public String emailInput = "xpath://input[(@id='txtEmail')]";
	public String  passwordInput= "xpath://input[(@id='txtPassword')]";
	public String loginButton = "xpath://button[(@id='kc-login')]";
	public String newButtonVerification = "xpath://button[(@id='btnCreateTest')]";
	public String errormsg = "xpath://span[(@id='lblerrormsg')]";


	
	
	public Loginbymail(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
	}
	
public void login(String email, String pass) throws Exception
{
appLibrary.launchApp(URL);
appLibrary.findElement(loginButton).click();
String text=appLibrary.findElement(errormsg).getText();
appLibrary.findElement(emailInput).sendKeys(email);
appLibrary.findElement(loginButton).click();
String text1=appLibrary.findElement(errormsg).getText();
appLibrary.findElement(passwordInput).sendKeys(pass);
appLibrary.findElement(loginButton).click();
appLibrary.verifyElement(newButtonVerification, true, 3);

}}
