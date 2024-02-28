package com.naveenautomation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ChangePasswordPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsletterSubscriptionPage;
import org.junit.Assert;

public class MyAccountTest extends TestBase {

	private static final String Assert = null;
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ChangePasswordPage changePasswordPage;
	NewsletterSubscriptionPage newsLetterSubscriptionPage;
	private Object getNewsLettersSuccessBanner;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
		page = new AccountLoginPage();
	}

	@Test(enabled = false)
	public void createNewPassword() {
//Login
		page.submitLogin("basilabc@gmail.com", "Qwerty2");

		myAccountPage = new MyAccountPage();

		// changing password
		myAccountPage.clickChangePasswordBtn();
		changePasswordPage = new ChangePasswordPage();

		// updating password
		changePasswordPage.updatePassword("Qwerty1", "Qwerty1");
		String pwdAlertMessage = myAccountPage.getMyAccountSuccessText();
		 Assert.assertEquals("Success: Your password has been successfully updated.",pwdAlertMessage);

		
	}

	

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
