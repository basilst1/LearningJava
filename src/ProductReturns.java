package SeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductReturns {

	EdgeDriver driver = null;
	String month = "March 2024";
	String date = "1";

	@BeforeMethod
	public void Initialization() {
		// Setting the path to the webDriver
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\hello\\Downloads\\edgedriver_win64\\msedgedriver.exe.exe");

		// To launch the browser instancE

		driver = new EdgeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/return/add");

	}

	@Test

	public void productReturnFormFilling() throws InterruptedException {

		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement telephoneNumber = driver.findElement(By.id("input-telephone"));
		WebElement orderID = driver.findElement(By.id("input-order-id"));

		firstName.sendKeys("Basil");
		lastName.sendKeys("Thomas");
		email.sendKeys("bst@gmail.com");
		telephoneNumber.sendKeys("1231231234");
		orderID.sendKeys("Orderid7890");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[1]/div[6]/div/div/span/button")).click();

		while (true) {

			String text = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/thead/tr[1]/th[2]"))
					.getText();

			if (text.equals(month)) {
				break;
			} else {
				driver.findElementByCssSelector("div > div.datepicker-days > table > thead > tr:nth-child(1) > th.next")
						.click();

			}
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr/td[contains(text(),'11')")).click();

		}

		
		WebElement productName = driver.findElement(By.id("input-product"));
		WebElement productCode = driver.findElement(By.id("input-model"));

		productName.sendKeys("GoatLife");
		productCode.sendKeys("GL1234");

		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='3']"));
		radioBtn.click();

		WebElement radioBtn2 = driver.findElement(By.xpath("//input[@name='opened'and @value='1']"));
		radioBtn2.click();

		System.out.println("Reason for Return is Selected" + radioBtn.isSelected());
		System.out.println("Product is opened or not option has marked" + radioBtn2.isSelected());

		WebElement FaultyOrOtherDetails = driver.findElement(By.id("input-comment"));
		FaultyOrOtherDetails.sendKeys("Defected packaging");

		WebElement SubmitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		SubmitBtn.submit();

	}

}
