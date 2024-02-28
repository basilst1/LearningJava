package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>ul:nth-of-type(1) li:nth-of-type(2)a")
	WebElement changePasswordBtn;

	@FindBy(css = "div.alert")
	WebElement successBanner;

	@FindBy(xpath = "//*[@id='content']/ul[4]/li/a")
	WebElement subscribeToNewsletter;

	public void clickSubscribeToNewsletter() {
		subscribeToNewsletter.click();

	}

	public void clickChangePasswordBtn() {
		changePasswordBtn.click();
	}

	public String getMyAccountSuccessText() {
		return successBanner.getText();

	}

}
