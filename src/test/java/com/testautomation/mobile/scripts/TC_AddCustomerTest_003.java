package com.testautomation.mobile.scripts;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.mobile.pages.AddCustomerPage;
import com.testautomation.mobile.pages.BaseClass;
import com.testautomation.mobile.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TC_AddCustomerTest_003{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		AppiumDriver<MobileElement> driver =  BrowserUtility.getAndroidDriver();
		
		BaseClass bc = new BaseClass(driver);
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
		  bc.logger().info("Entered username");		
		  lp.setPassword(pwd1);
		  bc.logger().info("Entered password");
		  lp.Loginbtn_Click();
		  bc.logger().info("Clicked on login button");
		  Thread.sleep(3000);
	
	} catch (InterruptedException e) {			
		e.printStackTrace();
	}
		
		AddCustomerPage acp = new AddCustomerPage(driver);
		
		acp.clickAddNewCustomer();
		acp.custName("Kailash");		
		acp.custgender("male");
		acp.custdobenter();						
		Thread.sleep(3000);
		acp.custaddress("INDIA");
		acp.custcity("HYD");
		acp.custstate("AP");
		acp.custpinno("585105");
		acp.custtelephoneno("0783049294");				
		String email=randomestring()+"@gmail.com";
		acp.custemailid(email);
		acp.custpassword("adcfs");
		Thread.sleep(2000);
		acp.custsubmit();
		Thread.sleep(3000);
		bc.logger().info("Test completed");
				
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if (res==true)
		{
			Assert.assertTrue(true);			
		}
		else
		{							
			//captureScreen(driver,"addNewCustomer");			
			Assert.assertTrue(false);
			bc.logger().info("Unable to enter all fileds in new cutomer page");		  
		}
  }
		
	public String 	randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);		
	}

}
