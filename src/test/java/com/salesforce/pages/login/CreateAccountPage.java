package com.salesforce.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.pages.base.BasePage;

public class CreateAccountPage extends BasePage {
	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"Account_Tab\"]/a") WebElement accountlink;
	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input") WebElement newbtn;
	@FindBy(xpath="//*[@id=\"acc2\"]") WebElement accountname;
	@FindBy(id="acc6") WebElement type;	
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]") WebElement savebtn;
	@FindBy(xpath="//*[@id=\"contactHeaderRow\"]/div[2]/h2") WebElement topname;
	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[2]") WebElement createnewview;
	@FindBy(id="fname") WebElement viewname;	
	@FindBy(id="devname") WebElement viewuname;
	@FindBy(xpath="//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]") WebElement savecreatenew;
	@FindBy(id="fcf") WebElement dropdown;	
	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[1]") WebElement editkey;
	@FindBy(id="fcoll") WebElement field;	
	@FindBy(id="fop1") WebElement operator;
	@FindBy(id="fval1") WebElement value;
	@FindBy(xpath="//select[@name='fcf']/option[2]") WebElement viewname1;
	@FindBy(xpath=
			"//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a") WebElement mergeaccount;
	@FindBy (id="srch")WebElement faccount;
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]") WebElement findaccount;
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]") WebElement next;
	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]")WebElement merge ;
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a") WebElement account30;
	@FindBy(id="ext-gen20") WebElement datefield;	
	@FindBy(xpath="//div[@class='x-combo-list-inner']/div[text()='Created Date']") WebElement createddate;
	@FindBy(xpath="//*[@id=\\\"ext-gen152\\") WebElement datebtn;
	@FindBy (id="ext-gen281")WebElement frombtn;
	@FindBy (xpath="//*[@id=\"ext-gen154\"]") WebElement date1btn;
	@FindBy (xpath="//*[@id=\"ext-gen296\"]") WebElement tobtn;
	@FindBy (id="saveReportBtn")WebElement savereportbtn;
	@FindBy (id="saveReportDlg_reportNameField")WebElement reportname;
	@FindBy(id="saveReportDlg_DeveloperName")WebElement reportuname;
	@FindBy(id ="dlgSaveAndRun")WebElement savenrun;
	@FindBy (xpath="//*[@id=\"noTableContainer\"]/div/div[1]/div[1]/div[1]/h1") WebElement topname1;
	
	
	public void accountlink() {
		clickElement(accountlink, "accountlinktab");
	}
	public void newbtn() {
		clickElement(newbtn, "newbutton");
	}
	public void enteraccountname(String data) {
		enterText(accountname, data, "accontnamefield");
	}
	public void type() {
		clickElement(type, "typebtn");
	}
	public void save() {
		clickElement(savebtn, "savebutton");
	}
	public void topname() {
		clickElement(topname, "topnamechk");
	}
	public void createnewview() {
		clickElement(createnewview, "createnewviewlink");
	}				
	
	public void enterviewname(String data) {
		enterText(viewname ,data, "viewnamefield");
	}
	public void enterviewuname(String data) {
		enterText(viewuname ,data, "viewunamefield");
		
	}	
   public void savecreatenew() {
	clickElement(savecreatenew, "savebutton");
   }
   public void dropdown() {
		clickElement(dropdown, "dropdownchk");
	}
   public void editkey() {
		clickElement(editkey, "editkeychk");
	}
   public void field(String data) {
		enterText(field ,data, "fieldname");
	}
   public void operator(String data) {
		enterText(operator ,data, "operatordropdown");
	} 
   public void value(String data) {
		enterText(value ,data, "valuefield");
	}
   public void viewname1(String data) {
 		enterText( viewname1 ,data, "viewnamefield");
 	}
   public void merge(String data) {
		enterText(mergeaccount ,data, "mergeaccountfield");
	} 
   public void enterfaccountname(String data) {
		enterText(faccount, data, "accontnamefield");
	} 
   public void findaccount(String data) {
		enterText(findaccount, data, "findaccountfield");
	}  
   public void next() {
		clickElement(next, "nextbutton");
	}
   public void account30(String data) {
		enterText(account30, data, "account30field");
	} 
   public void datefield(String data) {
		enterText(datefield, data, "datefield");
	}  
   public void createddate(String data) {
		enterText(createddate, data, "datefield");
	}   
   public void datebtn(String data) {
		enterText(datebtn, data, "datebutton");
	}  
   public void frmbtn(String data) {
		enterText(frombtn, data, "frombutton");
	}  
   public void date1btn(String data) {
		enterText(frombtn, data, "frombutton");
	}  
   public void tobtn(String data) {
		enterText(tobtn, data, "tobutton");
	} 
   public void savereport(String data) {
		enterText(savereportbtn, data, "saveandreportbutton");
	} 
   public void reportname(String data) {
		enterText(reportname, data, "saveandreportbutton");
	} 
   public void reportuname(String data) {
		enterText(reportuname, data, "reportubutton");
	} 
   public void savenrun() {
		clickElement(savenrun, "savenrunbutton");
	}
   public void topname1() {
		clickElement(topname1, "topnamechk");
	} 
}




