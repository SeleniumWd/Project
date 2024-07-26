package com.mavenpro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage extends BaseClass {
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//b[text()='Cart subtotal']//following::span[@id='attach-accessory-proceed-to-checkout-text']")
	public WebElement proceed_to_buy;
	@FindBy(xpath = "//*[@class='a-button-inner']//child::input[@name='proceedToRetailCheckout']")
	public WebElement checkout;
}
