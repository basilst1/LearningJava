package SeleniumWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumAssignment {

	EdgeDriver driver = null;

	@BeforeMethod
	public void Initialization() {
		// Setting the path to the webDriver
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\hello\\Downloads\\edgedriver_win64\\msedgedriver.exe.exe");

		// To launch the browser instancE

		driver = new EdgeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test

	public void AddingProducttoCart() {

		WebElement addProductToCart = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]"));
		addProductToCart.click();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement goToCart = driver.findElement(By.id("cart-total"));
		goToCart.click();

		WebElement checkout = driver.findElement(By.xpath("//*[@class='dropdown-menu pull-right']/li[2]/div/p/a[2]"));
		checkout.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement radioGuestCheckout = driver.findElement(By.xpath("//input[@value='guest']"));
		radioGuestCheckout.click();

		WebElement continueBtn = driver.findElement(By.xpath("//*[@id='button-account']"));
		continueBtn.click();

		WebElement firstName = driver.findElement(By.id("input-payment-firstname"));
		WebElement lastName = driver.findElement(By.id("input-payment-lastname"));
		WebElement email = driver.findElement(By.id("input-payment-email"));
		WebElement telephoneNumber = driver.findElement(By.id("input-payment-telephone"));
		WebElement address = driver.findElement(By.id("input-payment-address-1"));
		WebElement city = driver.findElement(By.id("input-payment-city"));
		WebElement postalCode = driver.findElement(By.id("input-payment-postcode"));

		firstName.sendKeys("Basil");
		lastName.sendKeys("Thomas");
		email.sendKeys("abcabc@gmail.com");
		telephoneNumber.sendKeys("6390001234");
		address.sendKeys("123 Hillcrest Place");
		city.sendKeys("Edmonton");
		postalCode.sendKeys("T5R 5X6");

		WebElement dropCountry = driver.findElement(By.id("input-payment-country"));
		Select drpCountry = new Select(dropCountry);
		drpCountry.selectByVisibleText("Canada");

		WebElement dropZone = driver.findElement(By.id("input-payment-zone"));
		Select drpZone = new Select(dropZone);
		drpZone.selectByValue("602");

		WebElement billingContinue = driver.findElement(By.id("input-payment-zone"));
		billingContinue.click();

		WebElement termsAndConditionRadioBtn = driver.findElement(By.xpath("//*[@name='agree']"));
		termsAndConditionRadioBtn.click();

	}

}
