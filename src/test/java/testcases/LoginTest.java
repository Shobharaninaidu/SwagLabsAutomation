package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void LoginFailureTest() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user", "secret_sauce1");

		WebElement ErrorMsg = driver.findElement(By.xpath("//h3"));
		System.out.println(ErrorMsg.getText());

		String actMsg = ErrorMsg.getText();
		String expMsg = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actMsg, expMsg);

	}

	@Test
	public void LoginSuccessTest() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user", "secret_sauce");
	}

}
