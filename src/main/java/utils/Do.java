package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Do {
	private WebDriver driver;
	private Wait wait;

	public Do(WebDriver driver) {
		this.driver = driver;
		wait = new Wait(driver);
	}
	
	public WebElement what(String locatorname){
		return driver.findElement(By.xpath(locatorname));
	}

	public List<WebElement> whats(String locatorname){
		return driver.findElements(By.xpath(locatorname));
	}
	
	public void waitForElementPresent(String locatorname){
		wait.waitForElementPresent(locatorname);
	}
	
	public void waitForElementIsEnable(String locatorname){
		wait.waitForElementIsEnable(locatorname);
	}
	
	public void waitFor(long timeout){
		wait.waitFor(timeout);
	}
}
