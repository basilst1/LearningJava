package SeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountCreate {

	EdgeDriver driver = null;

	@BeforeMethod
	public void Initialization() {
		// Setting the path to the webDriver
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\hello\\Downloads\\edgedriver_win64\\msedgedriver.exe.exe");

		// To launch the browser instancE

		driver = new EdgeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

//	@Test
//
//	public void goToNaveenLabsWebPage() {
//		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	}

	@Test

	public void fillBlanks() {
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement phoneNumber = driver.findElement(By.id("input-telephone"));
		WebElement passWord = driver.findElement(By.id("input-password"));
		WebElement passWordConfirm = driver.findElement(By.id("input-confirm"));

		firstName.sendKeys("Basil");
		lastName.sendKeys("Thomas");
		email.sendKeys("bst@gmail.com");
		phoneNumber.sendKeys("7051231234");
		passWord.sendKeys("Bst@1234");
		passWordConfirm.sendKeys("Bst@1234");
		
		WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		checkBox.click();
	
		
		WebElement SubmitBtn= driver.findElement(By.cssSelector("input[type='submit']"));
		SubmitBtn.submit();
		
	}

}
