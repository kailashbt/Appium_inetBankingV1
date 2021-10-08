package com.testautomation.mobile.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.testautomation.Utility.BrowserUtility;
import com.testautomation.mobile.pages.BasePage;
import com.testautomation.mobile.pages.PageObjectPage1;
import com.testautomation.mobile.pages.PageObjectPage2;
import com.testautomation.mobile.pages.PageObjectPage3;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectTestCase {	

	@Test
	public void pageObjectTestCase()
	{		
		AppiumDriver<MobileElement> driver =  BrowserUtility.getAndroidDriver();
		
	
		//AndroidDriver driver =  (AndroidDriver) BrowserUtility.getAndroidDriver();
		try {
			Thread.sleep(3000);						 			 			  									
			 PageObjectPage3 PageObjectPage3= new PageObjectPage3(driver);
			 				 
			 String bs1= BasePage.baseURL;
			 System.out.println(bs1);
			 driver.get(bs1);								 		
			 String user1 = BasePage.username;
			 String pwd1 = BasePage.password;
			 
			 System.out.println(user1);
			 System.out.println(pwd1);
			 
			 PageObjectPage3.setUserName(user1);			 						
			 PageObjectPage3.setPassword(pwd1);			 
			 PageObjectPage3.Loginbtn_Click();
			 												
			Thread.sleep(3000);			 
			if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
				{
					Assert.assertTrue(true);
					PageObjectPage3.accept();				
				}
				else
				{
					Assert.assertFalse(false);
					PageObjectPage3.accept();
				}			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
