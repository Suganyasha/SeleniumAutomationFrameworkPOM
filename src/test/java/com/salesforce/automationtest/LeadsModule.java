package com.salesforce.automationtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.login.LeadPage;
import com.salesforce.pages.login.LoginPage;
import com.salesforce.utilities.Constants;
import com.salesforce.utilities.PropertiesUtility;


	public class LeadsModule extends BaseTest {
			@Test
	public void  Leadtab() throws InterruptedException {
	logInApp();
	LeadPage leadtab = new LeadPage(driver);
	leadtab.leadlink();
	String Expected ="Leads: Home ~ Salesforce - Developer Edition";
	String Actual = leadtab.getPageTitle();
	Assert.assertEquals(Actual,Expected);
}
			@Test
	public void  Leadselectview() throws InterruptedException {		
	 Leadtab();
	 LeadPage leadtab = new LeadPage(driver);
	leadtab.leaddropdown();
	String Expected ="Leads: Home ~ Salesforce - Developer Edition";
	String Actual = leadtab.getPageTitle();
	Assert.assertEquals(Actual,Expected);
	}	
	@Test
	public void  defaultview() throws InterruptedException {		
	Leadtab();
	LeadPage leadtab = new LeadPage(driver);
	leadtab.todayslead();
    String Expected ="Leads ~ Salesforce - Developer Edition";
	String Actual = leadtab.getPageTitle();
    Assert.assertEquals(Actual,Expected);
			}

	@Test
	public void  todayslead() throws InterruptedException {		
	defaultview();
	LeadPage leadtab = new LeadPage(driver);
	String Expected ="Leads ~ Salesforce - Developer Edition";
	String Actual = leadtab.getPageTitle();
	 Assert.assertEquals(Actual,Expected);
}
	@Test
	public void  checknewbtn() throws InterruptedException {	
	Leadtab();
	LeadPage leadtab = new LeadPage(driver);
	leadtab.newbtn();
	String lastname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "lastname");
	leadtab.enterlastname(lastname);
	System.out.println(lastname);
	String companyname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "companyname");
	leadtab.entercompanyname(companyname);
	System.out.println(companyname);
	leadtab.save();
	String Expected ="Lead: ABCD ~ Salesforce - Developer Edition";
	String Actual = leadtab.getPageTitle();
	 Assert.assertEquals(Actual,Expected);
			
	}
	
	}