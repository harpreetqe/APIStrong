package com.ttaf.PageObject;

import com.db.Library.AppLibrary;

public class LoginGmail {
	AppLibrary appLibrary;
	public String URL = "//dev.apistrong.com";
	public String loginButton = "xpath://div[(@id='kc-info')]";
	public String gmailId = "xpath://input[(@id='identifierId')]";
	public String nextButton = "xpath:(//span[(@class='VfPpkd-vQzf8d')])[0]";
	public String PasswordInput = "xpath://div[(@id='password')]";
	public String nextButton1 = "xpath://span[(@class='VfPpkd-vQzf8d')][0]";
	public String newButtonVerification = "xpath://button[(@id='btnCreateTest')]";


public LoginGmail(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
}
public void login(String mail, String pass) throws Exception
{
appLibrary.launchApp(URL);
appLibrary.findElement(loginButton).click();
appLibrary.findElement(gmailId).sendKeys(mail);
appLibrary.findElement(nextButton).click();
appLibrary.findElement(PasswordInput).sendKeys(pass);
appLibrary.findElement(nextButton1).click();
appLibrary.verifyElement(newButtonVerification, true, 3);


}


}