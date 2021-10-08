package com.testautomation.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage2 extends BasePage{

	public PageObjectPage2(AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	@AndroidFindBy(id ="com.miui.calculator:id/btn_9_s")
	private AndroidElement nineLink;

	public void clickonnineLink() throws InterruptedException 
	{
		nineLink.click();
	}
}
