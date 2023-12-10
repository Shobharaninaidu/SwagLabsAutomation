package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "user-name")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "login-button")
	WebElement LoginBtn;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void LoginFunction(String UserNameVal, String PwdVal) {

		// click on the login link

		UserName.sendKeys(UserNameVal);

		Password.sendKeys(PwdVal);

		LoginBtn.click();
	}

}