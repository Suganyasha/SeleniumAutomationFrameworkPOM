package com.salesforce.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.pages.base.BasePage;

public class ContactsPage extends BasePage {
	@FindBy(xpath="//a[@title='Contacts Tab']") WebElement contactlink;
	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")WebElement newbtn;
	@FindBy(id="name_lastcon2")WebElement lname;
	@FindBy(xpath="//*[@id=\"con4\"]")WebElement accname;
	@FindBy(xpath="//*[@id=\"fcf\"]/option[6]")WebElement mycontact;
	@FindBy(xpath="//*[@id=\"fcf\"]/option[5]")WebElement little;
	@FindBy(xpath="//select[@id='hotlist_mode']")WebElement recentlycreated;
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")WebElement savecon;
	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")WebElement createnw;
	@FindBy(id="fname")WebElement viewname;
	@FindBy(xpath="//div[text()=\" You must enter a value\"]") WebElement error;
	@FindBy(xpath="//input[@id='devname']")WebElement viewuname;
	@FindBy(xpath="//*[@id=\"topButtonRow\"]/input[2]")WebElement savenew;
	@FindBy(id="fcf")WebElement view;
	@FindBy(xpath="//input[@title='Go!']")WebElement go;
	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")WebElement newview;
	@FindBy(xpath="//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]")WebElement cancel;
	public ContactsPage(WebDriver driver) {
		super(driver);
	}
public void clickcontact() {
	clickElement(contactlink, "contacttab");	
}
public void newbtn() {
	clickElement(newbtn, "newbutton");
}
public void enterlname(String data) {
	enterText(lname, data, "lastnamefield");
}
public void enteraccname(String data) {
	enterText(accname, data, "accountnamefield");
}
public void createnw() {
	clickElement(createnw, "createnewview");
}
public void enterviewname(String data) {
	enterText(viewname, data, "viewnamefield");
}
public void enterviewuname(String data) {
	enterText(viewuname, data, "viewunamefield");
}
public void mycontact() {
	clickElement(mycontact, "mycontactdropdown");
}
public void recentlycreated() {
	clickElement(recentlycreated, "recentlycreateddropdown");
}
public void Little() {
	clickElement(little, "littledropdown");
}
public void error() {
	clickElement(error,"actualerror");
}
public void savenew(){
	clickElement(savenew,"savebutton");
	}
public void cancel(){
	clickElement(cancel,"cancelbutton");
}
}
