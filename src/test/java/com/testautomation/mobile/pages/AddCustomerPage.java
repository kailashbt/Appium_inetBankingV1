package com.testautomation.mobile.pages;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class AddCustomerPage extends BaseClass {

	
	public AddCustomerPage (AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	@FindBy(how = How.XPATH,using ="//a[contains(text(),'New Customer')]")
	@CacheLookup
	AndroidElement lnkAddNewCustomer;

	@FindBy(how = How.NAME,using ="name")
	@CacheLookup
	AndroidElement txtCustomerName;
	
	@FindBy(how = How.NAME,using ="rad1")
	@CacheLookup
	AndroidElement rdGender;
	
	@FindBy(how = How.XPATH,using ="//input[@id='dob']")
	@CacheLookup
	AndroidElement txtdob;
	
	@FindBy(how = How.NAME,using ="addr")
	@CacheLookup
	AndroidElement txtaddress;
	
	@FindBy(how = How.NAME,using ="city")
	@CacheLookup
	AndroidElement txtcity;
	
	@FindBy(how = How.NAME,using ="state")
	@CacheLookup
	AndroidElement txtstate;
	
	@FindBy(how = How.NAME,using ="pinno")
	@CacheLookup
	AndroidElement txtpinno;
	
	@FindBy(how = How.NAME,using ="telephoneno")
	@CacheLookup
	AndroidElement txttelephoneno;
	
	@FindBy(how = How.NAME,using ="emailid")
	@CacheLookup
	AndroidElement txtemailid;
	
	@FindBy(how = How.NAME,using ="password")
	@CacheLookup
	AndroidElement txtpassword;
	
	@FindBy(how = How.NAME,using ="sub")
	@CacheLookup
	AndroidElement btnsubmit;
	
	@FindBy(how = How.NAME,using ="SET")
	@CacheLookup
	AndroidElement btnset;
	
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender) {
		rdGender.sendKeys(cgender);
	}
	
	public void custdob(String mm,String dd,String yy) {
			txtdob.sendKeys(mm);
			txtdob.sendKeys(dd);
			txtdob.sendKeys(yy);
	}
	
	public void custdobenter() {
		txtdob.sendKeys(Keys.ENTER);					
    }
	
	public void btnset() {
		btnset.click();					
    }
	
	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno) {
		txtpinno.sendKeys(cpinno);
	}
	
	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}
	
	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}
	
	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit() {
		btnsubmit.click();
	}
	
	
}
