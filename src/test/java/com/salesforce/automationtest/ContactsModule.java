package com.salesforce.automationtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.home.HomePage;
import com.salesforce.pages.login.ContactsPage;
import com.salesforce.pages.login.LeadPage;
import com.salesforce.utilities.Constants;
import com.salesforce.utilities.PropertiesUtility;

public class ContactsModule extends BaseTest {
	@Test
	public void Createnewcontact() throws InterruptedException {
		logInApp();
		ContactsPage contacttab = new ContactsPage(driver);
		contacttab.clickcontact();
		contacttab.newbtn();
		String lname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "lname");
		contacttab.enterlname(lname);
		String accname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "accname");
		contacttab.enterlname(accname);
		String Expected = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
		HomePage topname = new HomePage(driver);
		String Actual = topname.getPageTitle();
		Assert.assertEquals(Actual, Expected);
		
	}
	@Test
	public void Createnewviewincontactpage() throws InterruptedException {
		logInApp();
		ContactsPage contacttab = new ContactsPage(driver);
		contacttab.clickcontact();
		Thread.sleep(300);
	    contacttab.createnw();
	    String viewname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "viewname");
		contacttab.enterviewname(viewname);
		System.out.println(viewname);
		String viewuname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "accname");
		contacttab.enterviewuname(viewuname);
		System.out.println(viewuname);
        String Expected = "Contacts: Create New View ~ Salesforce - Developer Edition";
		HomePage topname = new HomePage(driver);
		String Actual = topname.getPageTitle();
		Assert.assertEquals(Actual, Expected);
		
	}
	@Test
	public void  Checkmycontactsview() 
			throws InterruptedException {
		logInApp();
		ContactsPage contacttab = new ContactsPage(driver);
		contacttab.clickcontact();
		contacttab.mycontact();
		String Expected = "Contacts ~ Salesforce - Developer Edition";
		HomePage topname = new HomePage(driver);
		String Actual = topname.getPageTitle();
		Assert.assertEquals(Actual, Expected);		
	}
@Test
	public void Checkrecentlycreatedcontactinthecontactpage() throws InterruptedException {
		logInApp();
		ContactsPage contacttab = new ContactsPage(driver);
		contacttab.clickcontact();
		contacttab.recentlycreated();
		String Expected = "Contacts: Home ~ Salesforce - Developer Edition";
		HomePage topname = new HomePage(driver);
		String Actual = topname.getPageTitle();
		Assert.assertEquals(Actual, Expected);		

	}
	@Test
	public void Viewacontactinthecontactpage() throws InterruptedException {
		logInApp();
		ContactsPage contacttab = new ContactsPage(driver);
		contacttab.clickcontact();
		contacttab.Little();
		String Expected = "Contacts ~ Salesforce - Developer Edition";
		HomePage topname = new HomePage(driver);
		String Actual = topname.getPageTitle();
		Assert.assertEquals(Actual, Expected);		
	}
@Test
	public void Checktheerrormessage() throws InterruptedException {
		logInApp();
		ContactsPage contacttab = new ContactsPage(driver);
		contacttab.clickcontact();
		contacttab.createnw();
		String viewuname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "viewuname");
		contacttab.enterviewuname(viewuname);
	    contacttab.savenew();
		//String expectederror ="Error: You must enter a value";   
		
}
@Test
public void Checkthecancelbutton()throws InterruptedException {
	logInApp();
	ContactsPage contacttab = new ContactsPage(driver);
	contacttab.clickcontact();
	contacttab.createnw();
	String viewuname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "viewuname");
	contacttab.enterviewuname(viewuname);
	contacttab.cancel();
	String Expected = "Contacts: Home ~ Salesforce - Developer Edition";
	HomePage topname = new HomePage(driver);
	String Actual = topname.getPageTitle();
	Assert.assertEquals(Actual, Expected);	
}
@Test
public void saveandnewbtn()throws InterruptedException {
	logInApp();
	ContactsPage contacttab = new ContactsPage(driver);
	contacttab.clickcontact();	
	contacttab.newbtn();
	String lname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "lname");
	contacttab.enterlname(lname);
	System.out.println(lname);
	String accname = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "accname");
	contacttab.enterlname(accname);
	System.out.println(accname);
	contacttab.savenew();
	String Expected = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
	HomePage topname = new HomePage(driver);
	String Actual = topname.getPageTitle();
	Assert.assertEquals(Actual, Expected);	
}
}

