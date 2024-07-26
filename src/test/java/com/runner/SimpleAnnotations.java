package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.mavenpro.BaseClass;
import com.mavenpro.CartPage;
import com.mavenpro.HomePage;
import com.mavenpro.LoginPage;
import com.mavenpro.PaymentPage;
import com.mavenpro.ProductPage;

public class SimpleAnnotations extends BaseClass{
	@BeforeSuite
	public void launchBrowser() {
		browserLaunch("chrome");
	}
	@BeforeTest
	public void launchurl() {
		urlLaunch("https://www.amazon.in/");
	}
	@BeforeMethod
	public void wait_1() {
		implicitly_Wait(10);
	}
	
	@Test(priority = 1)
	public void searchProduct() {
		HomePage hp = new HomePage();
		passingValueToField(hp.search_box, "iphone");
		clickUsingJavascritp(hp.search_btn);
		}
	@Test(priority = 2)
	public void selectProduct() throws InterruptedException {
		ProductPage pd  = new ProductPage();
		scrollIntoView(pd.scrolltoelement);
		clickUsingJavascritp(pd.select_Product);
		Set<String> allwindowsId = driver.getWindowHandles();
		List<String>list = new ArrayList<String>(allwindowsId);
		driver.switchTo().window(list.get(1));
		sleep(3000);
		clickUsingJavascritp(pd.cart_Btm);
		sleep(5000);
        CartPage cp = new CartPage();
		clickUsingJavascritp(cp.proceed_to_buy);
		sleep(3000);
	}
	
	@Test(priority = 3)
	public void login() throws InterruptedException{
		LoginPage lg = new LoginPage();
		passingValueToField(lg.email_Box, "919080770877");
		clickUsingJavascritp(lg.click_Btn);
		sleep(3000);
		passingValueToField(lg.getPassword(), "Suriya@1");
		clickUsingJavascritp(lg.getSingin());
	}		
	@Test(priority = 4)
	public void paymentpage() throws InterruptedException {
		PaymentPage pp = new PaymentPage();
		clickUsingJavascritp(pp.useAdd);
		clickUsingJavascritp(pp.radiobtn);
		explicity_Wait(pp.radiobtn);
		clickUsingJavascritp(pp.cliccarrd);
		explicity_Wait(pp.cliccarrd);
	}
	@Test(priority = 5)
	public void frameInpp() throws InterruptedException {
		PaymentPage pp = new PaymentPage();
		switchframesUsingIndex(0);
		passingValueToField(pp.cardnum, "4557012345678902");
		explicity_Wait(pp.cardnum);                            //add the card number its use first time only
		selectDD(pp.dropdown1, "value", "5");
		selectDD(pp.dropdown2, "value", "2025");
		clickUsingJavascritp(pp.enterbtnclick);
		outToAllFrame();
		sleep(3000);
		passingValueToField(pp.ccv, "123");
		sleep(3000);
		clickUsingJavascritp(pp.useAdd);
		sleep(3000);
		if(pp.nothanks.isDisplayed()) {
			clickUsingJavascritp(pp.nothanks);
		}
		sleep(3000);
		clickUsingJavascritp(pp.procedtopay);
	}
	@AfterSuite
	public void quite_Bro() {
		quite();
	}
	
}