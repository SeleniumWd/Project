package com.mavenpro;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	
	public static Select select;
	
	public static void browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
	}
	public static void urlLaunch(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	public static void passingValueToField(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void elementClik(WebElement element) {
		element.click();
	}
	public static void takeScreenShort(String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourceImage = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationImage = new File("C:\\Users\\GOWTHAM M\\eclipse-workspace\\Project_Class\\Screenshort\\"+ name +".png");
		System.out.println(destinationImage);
		FileHandler.copy(sourceImage, destinationImage);
	}
//	public static void selectDDUsingIndex(WebElement element,int indexvalue) {
//		select = new Select(element);
//		select.selectByIndex(indexvalue);
//	}
//	public static void selectDDUsingValue(WebElement element,String value) {
//		select= new Select(element);
//		select.selectByValue(value);
//	}
//	public static void selectDDUsingVisibleText(WebElement element,String text) {
//		select = new Select(element);
//		select.selectByVisibleText(text);
//	}
	public static void selectDD(WebElement element,String option , String value) {
		select = new Select (element);
		if (option.equalsIgnoreCase("index")){
			int index = Integer.parseInt(value);
			select.selectByIndex(index);
		}
		else if(option.equalsIgnoreCase("value")) {
			select.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("text")) {
			select.deselectByVisibleText(value);
		}
		
	}
	public static void close() {
		driver.close();
	}
	public static void quite() {
		driver.quit();
	}
	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}
	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor javascript  = (JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void scrollUsingrang(int x , int y) {
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		javascript.executeScript("window.scrollBy("+x+","+y+")");
	}
	protected static void clickUsingJavascritp(WebElement element) {
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].click();", element);
	}
	public static void rightclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}
	public static void mouseHover(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public static void dragDrop(WebElement src,WebElement dest) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, dest).perform();
	}
	public static void switchwindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listid = new ArrayList<>(windowHandles);
		driver.switchTo().window(listid.get(index));
	}
	public static void switchframesUsingIndex(int index) {
		driver.switchTo().frame(index);
	}
	public static void switchframesUsingWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void switchframesUsingid(String id) {
		driver.switchTo().frame(id);
		
	}
	public static void outToAllFrame() {
		driver.switchTo().defaultContent();
	}
	public static void outToParantFrame() {
		driver.switchTo().parentFrame();
	}
	public static void implicitly_Wait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	public static void pagerefresh() {
		driver.navigate().refresh();
	}
	public static void explicity_Wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
