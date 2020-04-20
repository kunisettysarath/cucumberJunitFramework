package utils;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

public class BaseClass extends DriverFactory {

	public void waitForElement(WebElement element, int timeOut) {
		Reporter.addStepLog("waiting for element---->" + element);
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.addStepLog("element found--->" + element);
		} catch (TimeoutException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	public String getWebPageTitle() {
		return driver.getTitle();
	}

	public void openURL(String url) {
		Reporter.addStepLog("website url navigating to " + url);
		driver.get(url);
	}

	public boolean isElementExists(WebElement element, int timeOut) {
		waitForElement(element, timeOut);
		Reporter.addStepLog("element found -->" + element);
		return element.isDisplayed();
	}

	public String getElementText(WebElement element, int timeOut) {
		waitForElement(element, timeOut);
		Reporter.addStepLog("\"" + element.getText() + "\" is the text obtained from element -->" + element);
		return element.getText();
	}

	public void clickOnElement(WebElement element, int timeOut) {
		waitForElement(element, timeOut);
		try {
			Reporter.addStepLog("clicking on element----->" + element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	public void sendTextToElement(WebElement element, String data, int timeOut) {
		waitForElement(element, timeOut);
		element.click();
		try {
			Reporter.addStepLog("sending text to element----->" + element);
			element.sendKeys(data);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}
	
	public void selectBoxByVisibleText(WebElement element, String data, int timeOut) {
		waitForElement(element, timeOut);
		try {
			Select select = new Select(element);
			select.selectByVisibleText(data);
			Reporter.addStepLog("selecting the element----->" + element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
