package com.testautomation.mobile.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseClass{

	public LoginPage (AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
		
	public void getUrl() {
		driver.get(baseURL);		
	}
	
	@FindBy(name="uid")
	@CacheLookup
	 AndroidElement txtUserName;
	
	public void setUserName(String uname) throws InterruptedException 
	{
		txtUserName.sendKeys(uname);
	}

	@FindBy(name="password")
	@CacheLookup
	 AndroidElement txtPassword;
	
	public void setPassword(String pwd) throws InterruptedException 
	{
		txtPassword.sendKeys(pwd);
		Thread.sleep(1000);
		txtPassword.sendKeys(Keys.TAB);
	}
	
	//@FindBy(xpath="//input[@type='submit']")
	@FindBy(name="btnLogin")
	@CacheLookup
	 AndroidElement Loginbtn;
	
	public void Loginbtn_Click() throws InterruptedException 
	{
		//Loginbtn.click();
		Loginbtn.sendKeys(Keys.ENTER);		
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	@CacheLookup
	AndroidElement Logoutbtn;
	
	public void Logoutbtn_Click() throws InterruptedException 
	{
		Logoutbtn.click();	
	}

	public void accept()
	{
		driver.close();		
		driver.quit();
	}
}
