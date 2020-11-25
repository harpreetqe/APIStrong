package com.ttaf.PageObject;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.db.Library.AppLibrary;

public class RegisterPage {
	
	AppLibrary appLibrary;
//Locators for registration by email
	public String URL = "//dev.apistrong.com";
	public String Signupbutton = "xpath://button[(@class='signUpButton')]";
	
	public String emailInput  = "xpath://input[(@id='txtRegEmail')]";
	public String passwordInput = "xpath://input[(@id='txtRegPassword')]";
	public String confirmPasswordInput = "xpath://input[(@id='txtConfirmPassword')]";
	public String companyInput = "xpath://input[(@id='txtCompany')]";
	public String registerButton = "xpath://input[(@class='signInButton')]";
	public String newButtonVerification = "xpath://button[(@id='btnCreateTest')]";
	public String errormsg = "xpath://span[(@id='lblerrormsg')]";


	public RegisterPage(AppLibrary appLibrary) 
	{
		this.appLibrary = appLibrary;
	}
	
	public void register(String email, String pass, String company) throws Exception
	{
	appLibrary.launchApp(URL);	
	appLibrary.findElement(Signupbutton).click();
	appLibrary.findElement(registerButton).click();
	String text=appLibrary.findElement(errormsg).getText();

	appLibrary.findElement(emailInput).sendKeys(email);
	appLibrary.findElement(registerButton).click();
	String text1=appLibrary.findElement(errormsg).getText();

	appLibrary.findElement(passwordInput).sendKeys(pass);
	appLibrary.findElement(registerButton).click();
	String text2=appLibrary.findElement(errormsg).getText();

	appLibrary.findElement(confirmPasswordInput).sendKeys(pass);
	appLibrary.findElement(registerButton).click();
	String text3=appLibrary.findElement(errormsg).getText();

	appLibrary.findElement(companyInput).sendKeys(company);
	appLibrary.findElement(registerButton).click();
	appLibrary.verifyElement(newButtonVerification, true, 3);

	

	}
}

