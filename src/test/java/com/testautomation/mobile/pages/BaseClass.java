package com.testautomation.mobile.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.ReadConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseClass {
	

	//protected AndroidDriver driver;
	protected  AppiumDriver<MobileElement> driver;
	static ReadConfig readconfig = new ReadConfig();
	public static String baseURL= readconfig.getApplicationURL();	
	public static String username=readconfig.getUsername();
	public static String password=readconfig.getPassword();
		
	
	public BaseClass(AppiumDriver<MobileElement> driver)	
	{
		this.driver=driver;		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	public Logger logger()
	{
		Logger logger;
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");	
		return logger;
	}	
	
	@AfterSuite
	public void teardown()
	{
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.close();
		driver.quit();
	}
	
	public String 	randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);		
	}
	
	
	
	public void captureScreen(AppiumDriver<MobileElement> driver,String tname) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot take");
		
	}
	
}

