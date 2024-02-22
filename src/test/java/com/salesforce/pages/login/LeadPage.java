package com.salesforce.pages.login;

import com.salesforce.pages.base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPage extends  BasePage{
	@FindBy(id="Lead_Tab") WebElement leadlink;
	@FindBy(id="fcf")WebElement leaddropdown;
	@FindBy(xpath="//*[@id=\"fcf\"]/option[4]")WebElement todayslead;
	//*[@id=\"filter_element\"]/div/span/span[1]/
	@FindBy(xpath="//input[@title='Go!']") WebElement go;
	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input") WebElement newbtn;
	@FindBy(id="name_lastlea2") WebElement lastname;
	@FindBy(id="lea3") WebElement companyname;
	@FindBy(xpath="//*[@id=\"topButtonRow\"]/input[1]") WebElement save;
	
public LeadPage(WebDriver driver) {
		super(driver);
	}
public void leadlink() {
		clickElement(leadlink, "leadlinktab");
	}
public void leaddropdown() {
	clickElement(leaddropdown, "viewdropdown");
}
public void todayslead() {
	clickElement(todayslead, "selecttodayslead");
}
public void go() {
	clickElement(go, "gobutton");
}
public void newbtn() {
	clickElement(newbtn, "newbutton");
}
public void enterlastname(String data) {
	enterText(lastname, data, "lastnamefield");
}	
public void entercompanyname(String data) {
	enterText(companyname, data, "companynamefield");
}	
	public void save() {
		clickElement(save, "savebutton");
	}
	
	
	
	
	
	
	
	
		
	/*	public void leadtab() throws InterruptedException {
			WebElement leadlink = driver.findElement(By.id(""));
			leadlink.click();
			   String title = driver.getTitle();
			  if(driver.getTitle().equalsIgnoreCase(title)) {
			    	System.out.println("Test pass. Lead page displayed");
			    }
			    else {
			    	System.out.println("test failed. lead page not displayed");
			    }
		}
		public void leaddropdown()throws InterruptedException {
			WebElement dropdown = driver.findElement(By.id(""));
			dropdown.click();
			System.out.println("dropdown" + dropdown.getText());	
			
		}
		public void selecttodayslead()throws InterruptedException {
		WebElement dropdown = driver.findElement(By.id("fcf"));
			dropdown.click();
		System.out.println("dropdown" + dropdown.getText());	
		Select selectlead = new Select(dropdown);
		selectlead.selectByVisibleText("Today's Leads");
		Thread.sleep(200);
		}
		public void go()throws InterruptedException {
			WebElement go = driver.findElement(
					By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input"));
			go.click();
			Thread.sleep(3000);
		}
		public void newbutton()throws InterruptedException {
		WebElement newbtn = driver.findElement(
				By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		newbtn.click();
		WebElement lname = driver.findElement(By.id("name_lastlea2"));
		lname.sendKeys("ABCD");
		WebElement company = driver.findElement(By.id("lea3"));
		company.sendKeys("ABCD");
		WebElement save = driver
				.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
		save.click();
		Thread.sleep(3000);
		}*/
}
