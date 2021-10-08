package com.testautomation.mobile.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testautomation.Utility.BrowserUtility;
import com.testautomation.mobile.pages.BaseClass;
import com.testautomation.mobile.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TC_LoginTest_001 {
	
	@Test
	public void loginTest()
	{
		
				AppiumDriver<MobileElement> driver =  BrowserUtility.getAndroidDriver();
							
			try
			{
			Thread.sleep(3000);
			
			LoginPage lp=new LoginPage(driver);
			
			String bs1= BaseClass.baseURL;
			 
			 System.out.println(bs1);
			 driver.get(bs1);								 		
			 String user1 = BaseClass.username;			 
			 String pwd1 = BaseClass.password;
			 			 
			 System.out.println(user1);
			 System.out.println(pwd1);
			 			
			lp.setUserName(user1);			
			lp.setPassword(pwd1);
			lp.Loginbtn_Click();
	
			if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
			{
				Assert.assertTrue(true);
				lp.accept();
			}
			else
			{
				Assert.assertFalse(false);
				lp.accept();
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

}
