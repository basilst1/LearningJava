package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class ChangePasswordPage extends TestBase {

	public ChangePasswordPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-password")
	WebElement changePassword;

	@FindBy(id = "input-confirm")
	WebElement confirmPassword;

	@FindBy(css = "div.buttons.clearfix input")
	WebElement continueBtn;

	private void enterPassword(String pwd) {
		changePassword.sendKeys(pwd);
	}

	private void enterconfirmPassword(String confirmPwd) {
		confirmPassword.sendKeys(confirmPwd);
	}

	private void clickContinue() {
		continueBtn.click();
	}

	public void updatePassword(String pwd, String confirmPwd) {
		enterPassword(pwd);
		enterconfirmPassword(confirmPwd);
		clickContinue();
	}

}
