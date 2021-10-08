package com.testautomation.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage1 extends BasePage{
	
	public PageObjectPage1(AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	@AndroidFindBy(id ="com.miui.calculator:id/btn_c_s")
	private AndroidElement clearLink;

	public void clickonClear() throws InterruptedException 
	{
		clearLink.click();
	}
}
