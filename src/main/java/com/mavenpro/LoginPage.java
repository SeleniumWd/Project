package com.mavenpro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='email']")
    public	WebElement email_Box;
	@FindBy(xpath = "//input[@class='a-button-input']")
	public	WebElement click_Btn;
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement singin;
	public WebElement getSingin() {
		return singin;
	}

	

}
