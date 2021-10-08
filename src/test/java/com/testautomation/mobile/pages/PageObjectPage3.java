package com.testautomation.mobile.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObjectPage3 extends BasePage {
		
	public PageObjectPage3 (AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	@AndroidFindBy(id ="com.miui.calculator:id/btn_3_s")
	private AndroidElement LinkThree;
	
	public void clickonLinkThree() throws InterruptedException 
	{
		LinkThree.click();
	}
	
	public void getUrl() throws InterruptedException{
		
		//driver.get();		
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
