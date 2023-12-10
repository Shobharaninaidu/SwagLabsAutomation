package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseClass {

	@Test
	public void addoneproducttest() {
		String ProductName = "Sauce Labs Backpack";

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user", "secret_sauce");

		ProductPage product = new ProductPage(driver);
		product.addtocart(ProductName);

	}

	@Test
	public void addmultiproductstest() {
		String Product1 = "Sauce Labs Backpack";
		String Product2 = "Sauce Labs Bike Light";
		String Product3 = "Sauce Labs Bolt T-Shirt";

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user", "secret_sauce");

		ProductPage product = new ProductPage(driver);
		product.addtocart(Product1);
		product.addtocart(Product2);
		product.addtocart(Product3);

	}
}
