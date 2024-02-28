package com.naveenautomation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;

public class AccountLoginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		initialization();
	}

	@Test(enabled=false)

	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("basilabc@gmail.com", "Qwerty2");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
