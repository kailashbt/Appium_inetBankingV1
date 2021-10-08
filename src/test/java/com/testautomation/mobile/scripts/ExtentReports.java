package com.testautomation.mobile.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.Writable;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReports {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void reportSetup()
	{
		
		htmlReporter = new ExtentSparkReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}
	
	private void attachReporter(ExtentSparkReporter htmlReporter2) {
		// TODO Auto-generated method stub
		
	}

	@AfterSuite
	public void tearDown()
	{
	
		 ((Writable) extent).flush();
	}

}
