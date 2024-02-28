package com.naveenautomation.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsletterSubscriptionPage;

public class NewsletterSubscriptionTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void launchBrowser() {
		initialization();
	}

	@Test

	public void subscribeToNewsletter() {
		// Login
		page.submitLogin("basilabc@gmail.com", "Qwerty2");

		myAccountPage = new MyAccountPage();

		// Subscribing to news letter
		myAccountPage.clickSubscribeToNewsletter();

		// click radioBtn

		NewsletterSubscriptionPage newsLetterSubscriptionPage;
		newsLetterSubscriptionPage.clickYesRadioBtn();
		newsLetterSubscriptionPage.clickSubmit();
		String newsLetterSuccess = NewsletterSubscriptionPage.getNewsLettersSuccessBanner;
		Assert.assertEquals("Success: Your newsletter subscription has been successfully updated!",getNewsLettersSuccessBanner);

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
