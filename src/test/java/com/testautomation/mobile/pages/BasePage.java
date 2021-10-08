package com.testautomation.mobile.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.testautomation.Utility.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class BasePage
	{	
	protected  AppiumDriver<MobileElement> driver;
	//public static String baseURL="http://demo.guru99.com/v4/";	
	//public   String username="mngr356041";
	//public String password="ugEtYpe";
	
	static ReadConfig readconfig = new ReadConfig();
	public static String baseURL= readconfig.getApplicationURL();	
	public static String username=readconfig.getUsername();
	public static String password=readconfig.getPassword();
	
	//public static Logger logger;
	
	public BasePage(AppiumDriver<MobileElement> driver)	
	{
		this.driver=driver;		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
		//logger = Logger.getLogger("appiumtests");
		//PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.close();
		driver.quit();
	}


}
