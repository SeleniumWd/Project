package com.mavenpro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PaymentPage extends BaseClass{
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id='orderSummaryPrimaryActionBtn']")
	public WebElement useAdd;
	@FindBy(xpath = "//input[@value='SelectableAddCreditCard']")
	public WebElement radiobtn;
	@FindBy(xpath = "(//a[text()='Enter card details'])[1]")
	public WebElement cliccarrd;
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement cardnum;
	@FindBy(xpath = "//iframe[@class='apx-secure-iframe pmts-portal-component pmts-portal-components-pp-qkWWdL-23']")
	public WebElement frame;
	@FindBy(xpath = "(//select[@data-a-native-class='pmts-native-dropdown'])[1]")
	public WebElement dropdown1;
	@FindBy(xpath = "(//select[@data-a-native-class='pmts-native-dropdown'])[2]")
	public WebElement dropdown2;
	@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	public WebElement enterbtnclick;
	@FindBy(xpath = "//input[@type='password']")
	public WebElement ccv;
	@FindBy(xpath = "//*[text()='Use this address ']")
	public WebElement useaddress;
	@FindBy(xpath = "//*[text()='Use this payment method']")
	public WebElement paymentbtn;
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]")
	public WebElement radio2;
	@FindBy(xpath = "//a[contains(text(),'Thanks')]")
    public WebElement nothanks;
	@FindBy(xpath = "//*[@id='submitOrderButtonId-announce']")
	public WebElement procedtopay;
}

