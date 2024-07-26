package com.mavenpro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[@class='a-size-medium a-color-base a-text-normal'])[18]")
	public WebElement scrolltoelement;
	@FindBy(xpath = "//*[text()='Apple iPhone 13 (128GB) - Pink']")
	public WebElement select_Product;
	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
	public WebElement cart_Btm;
//	@FindBy(xpath = "(//*[@class='nav-line-2'])[3]")
//	public WebElement cart;

}
