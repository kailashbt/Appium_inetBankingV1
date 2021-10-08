package com.testautomation.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserUtility {
	
	
	public static AppiumDriver<MobileElement> getAndroidDriver()
			
	{
		AppiumDriver<MobileElement> driver=null;	
		//AndroidDriver driver=null;
		
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("deviceName", "Redmi Note 6 Pro");			
			cap.setCapability("udid", "4823955b");			
			cap.setCapability("platformName", "Android");			
			cap.setCapability("platformVersion", "9.1.1");		
			cap.setCapability("automationName", "UiAutomator2");		
			//cap.setCapability("appPackage", "com.miui.calculator");					
			//cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
			cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
			cap.setCapability("newCommandTimeout", 0);
			cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
			URL url = new URL("http://127.0.0.1:4723/wd/hub");			
			driver= new AppiumDriver<MobileElement>(url, cap);
			driver= new AndroidDriver<MobileElement>(url, cap);
			//driver = new AndroidDriver(url, cap);			
			System.out.println("Application Started");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return driver;			
	}
	
}

