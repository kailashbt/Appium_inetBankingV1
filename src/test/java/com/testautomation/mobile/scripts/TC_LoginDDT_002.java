package com.testautomation.mobile.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.testautomation.Utility.BrowserUtility;
import com.testautomation.Utility.XLUtils;
import com.testautomation.mobile.pages.BaseClass;
import com.testautomation.mobile.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TC_LoginDDT_002
    {

	//AppiumDriver<MobileElement> driver =  BrowserUtility.getAndroidDriver();
		
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException 
	
	  {
	
		AppiumDriver<MobileElement> driver =  BrowserUtility.getAndroidDriver();
		 {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 //String bs1= BasePage.baseURL;
		 String bs1= BaseClass.baseURL;
		 System.out.println(bs1);
		 driver.get(bs1);		 
		 //PageObjectPage3 PageObjectPage3= new PageObjectPage3(driver);	
		 LoginPage lp=new LoginPage(driver);
		// PageObjectPage3.setUserName(user);
		 lp.setUserName(user);
		 //logger.info("Entered username");			 
		 //PageObjectPage3.setPassword(pwd);
		 lp.setPassword(pwd);
		 //logger.info("Entered password");	
		 //PageObjectPage3.Loginbtn_Click();
		 lp.Loginbtn_Click();
		 
		 Thread.sleep(4000);
		 
		 if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
			{
				Assert.assertTrue(true);
				//PageObjectPage3.accept();
				lp.accept();
			}
			else
			{
				Assert.assertFalse(false);
				//PageObjectPage3.accept();
				lp.accept();
			}									
//		if (isAlertPresent()==true)
//		{
//						
//			//driver.switchTo().alert().accept();
//			//driver.switchTo().defaultContent();
//		    Assert.assertTrue(false);
//		    PageObjectPage3.accept();
//		}
//		else
//		{
//			Assert.assertTrue(true);
//			PageObjectPage3.Logoutbtn_Click();
//			
//			//driver.switchTo().defaultContent();
//			//driver.switchTo().alert().accept();			
//			//driver.switchTo().defaultContent();
//			PageObjectPage3.accept();
//		}
		
		
		 }

		}
	
	
//	public boolean isAlertPresent()
//	{
//		try
//		{
//			driver.switchTo().alert();
//			return true;
//		}catch(NoAlertPresentException e)
//		{
//			return false;
//		}
//		
//	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path =System.getProperty("user.dir")+"/src/test/java/com/testautomation/testdata/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "sheet1");
		int colcount=XLUtils.getCellCount(path, "sheet1", 1);
		
		String logindata[][]=new String [rownum][colcount];		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j] =XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;
	}
}

	 