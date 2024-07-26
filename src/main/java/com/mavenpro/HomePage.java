package com.mavenpro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement search_box;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement search_btn;
	
}
