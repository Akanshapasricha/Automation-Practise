package com.utailerProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utailerProject.baseClass.BaseLibs;
import com.utailerProject.baseClass.KeyWords;

public class LoginPages extends BaseLibs {
	public LoginPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='useremail']")
	WebElement emailId;

	@FindBy(xpath="//input[@name='userpassword']")
	WebElement password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotPassLink;
	public DeshBoardPages login(String emil,String pass) throws InterruptedException
	{
		KeyWords.SendData(emailId, emil);
		KeyWords.SendData(password, pass);
		KeyWords.Click(loginBtn);
		return new DeshBoardPages();
}
	//<url>http://maven.apache.org</url>
}
