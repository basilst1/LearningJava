package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

import io.opentelemetry.api.internal.Utils;

public class NewsletterSubscriptionPage extends TestBase {

	public static final String getNewsLettersSuccessBanner = null;

	private static final String utils = null;

	public NewsletterSubscriptionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@type='radio'] [@value='1']")
	WebElement yesRadioBtn;

	@FindBy(xpath = "//*[@type='submit'] [@value='Continue']")
	WebElement submitBtn;
	@FindBy(css = "div.alert")
	WebElement successBanner;

	public void clickYesRadioBtn() {
		yesRadioBtn.click();
	}

	public void clickSubmit() {
		submitBtn.click();
	}

	public String getNewsLettersSuccessBanner() {
		Utils.sleep(5000);
		return successBanner.getText();
	}
}
