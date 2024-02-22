package com.salesforce.automationtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.home.HomePage;
import com.salesforce.pages.login.LoginPage;
import com.salesforce.utilities.Constants;
import com.salesforce.utilities.PropertiesUtility;

public class LoginModule extends BaseTest {

	protected Logger logger = LogManager.getLogger();

	@Test
	public void Login_Error_Message_1() {
		String ExpectedError = "Please enter your password.";
		LoginPage loginPage = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		loginPage.enterUserName(userName);
		loginPage.clearPassword();
		loginPage.clickLoginButton();
		String ActualError = loginPage.getLoginErrorMsg();
		Assert.assertEquals(ActualError,ExpectedError);
		
//		String expected = "Home Page ~ Salesforce - Developer Edition";
//		// extentReport.logTestInfo("username and password extracted from
//		// properties file");
//		LoginPage loginPage = new LoginPage(driver);
//		String userName = PropertiesUtility.readDataFromPropertyFile(
//				Constants.APPLICATION_PROPERTIES, "username");
//		String password = PropertiesUtility.readDataFromPropertyFile(
//				Constants.APPLICATION_PROPERTIES, "password");
//		logger.info(" userName: "+userName+", password: "+password+", Driver: "+driver);
//		loginPage.enterUserName(userName);
//		loginPage.enterPassword(password);
//		loginPage.clickLoginButton();
//		/*
//		 * Alert a=loginPage.switchToErrorAlert(); String actualError
//		 * =loginPage.extractTextFromAlert(a); loginPage.acceptErrorAlert(a);
//		 * Assert.assertEquals(actualError, expected);
//		 */

	}

	@Test
	public void Login_To_SalesForce_2() throws InterruptedException {
		String expected = "Home Page ~ Salesforce - Developer Edition";
		String userName = PropertiesUtility.readDataFromPropertyFile(
				Constants.APPLICATION_PROPERTIES, "username");
		String password = PropertiesUtility.readDataFromPropertyFile(
				Constants.APPLICATION_PROPERTIES, "password");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		Thread.sleep(3000);
		HomePage homePage = new HomePage(driver);
		String actual = homePage.getPageTitle();
		Assert.assertEquals(actual, expected);

	}
	@Test
	public void CheckRemeberMe_3() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		login.enterPassword(password);
		login.clickRememberMeButton();
		login.clickLoginButton();
		HomePage homePage = new HomePage(driver);
		homePage.ClickdropDown();
		homePage.clickLogOut();
		Thread.sleep(5000);
		LoginPage login1 = new LoginPage(driver);
		//login1.isDisplayed(userNameTextBoxField, "userNameText");
		Assert.assertEquals(login1.isUserNameDisplayed(), true);
		String ExpectedUsername = userName;	
		String ActualUsername =login1.getUserNameFieldText();
		Assert.assertEquals(ActualUsername, ExpectedUsername);
		
	}
	
	@Test
	public void ForgotPassword_4A() {
		LoginPage login = new LoginPage(driver);
		login.forgetPasswordLink();
		String ExpectedMsg = "Forgot Your Password";
		String ActualMsg = login.getForgotPasswordMsg();
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		login.enterUserNameInForgotPage(userName);
		login.clickContinueButton();
		String ExpectedEmailError = "Check Your Email";
		String ActualEmailError = login.getEmailError();
		Assert.assertEquals(ActualEmailError, ExpectedEmailError);
		
	}
	
	@Test
	public void ForgotPassword_4B() {
		LoginPage login = new LoginPage(driver);
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "wrongUserName");
		login.enterUserName(userName);
		String password = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "wrongPassword");
		login.enterPassword(password);
		login.clickLoginButton();
		String ExpectedLoginError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String ActualLoginError = login.getInvalidLoginErrorMsg();
		Assert.assertEquals(ActualLoginError, ExpectedLoginError);
		
		
		
	}
}
