package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	// @FindBy(xpath="//div[text()='Sauce Labs Backpack']/following::button[1]")
	WebElement addtocart;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void addtocart(String ProductName) {
		addtocart = driver.findElement(By.xpath("//div[text()='" + ProductName + "']/following::button[1]"));
		addtocart.click();
	}
}
