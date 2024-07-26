package com.mavenpro;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreatAccount extends BaseClass {
	public CreatAccount() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	public WebElement phone_Input;
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	public WebElement customerName;
	@FindBy(xpath = "//input[@id='ap_password']")
	public WebElement password;
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement verifyMobileNo;
	@FindBy(xpath = "//i[@class='a-icon a-icon-checkbox']")
	public WebElement box;
	@FindBy(xpath = "//input[@class='a-button-input']")
	public WebElement creat_A_Account;
	@FindBy(xpath = "//input[@id='auth-pv-enter-code']")
	public WebElement otp_Box;
	@FindBy(xpath = "//input[@id='auth-verify-button']")
	public WebElement verify_btn;

}
