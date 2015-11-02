package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	private WebDriver driver;
	private int timeout = 20;

	public Wait(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForElementPresent(String locator) {
		try {
			(new WebDriverWait(driver, timeout)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		} catch (Exception e) {
			System.out.println("waitForElementPresent出错了！！！");
		}

	}

	public void waitForElementIsEnable(String locator) {
		try {
			(new WebDriverWait(driver, timeout)).until(ExpectedConditions
					.elementToBeClickable(By.xpath(locator)));
		} catch (Exception e) {
			System.out.println("waitForElementIsEnable出错了！！！");
		}

	}
	
	public void waitFor(long timeout){
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
