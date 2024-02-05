package SeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUs {

	EdgeDriver driver = null;

	@BeforeMethod
	public void Initialization() {
		// Setting the path to the webDriver
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\hello\\Downloads\\edgedriver_win64\\msedgedriver.exe.exe");

		// To launch the browser instancE

		driver = new EdgeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=information/contact");

	}

	@Test
	

	public void contactUsForm() {
	

		WebElement inputName = driver.findElement(By.id("input-name"));

		WebElement inputEmail = driver.findElement(By.id("input-email"));

		WebElement inputEnquiry = driver.findElement(By.id("input-enquiry"));

		inputName.sendKeys("Basi");
		inputEmail.sendKeys("abcd@gmail.com");
		inputEnquiry.sendKeys("i would like to know about your hours of operation.");

		WebElement SubmitBtn = driver.findElement(By.cssSelector("input[type='submit']"));
		SubmitBtn.submit();

	}

}
